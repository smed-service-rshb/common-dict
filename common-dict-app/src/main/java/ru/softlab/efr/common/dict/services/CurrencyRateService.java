package ru.softlab.efr.common.dict.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.exchange.model.CalculationType;
import ru.softlab.efr.common.dict.exchange.model.rate.ValuteData;
import ru.softlab.efr.common.dict.model.CurrencyEntity;
import ru.softlab.efr.common.dict.model.CurrencyRate;
import ru.softlab.efr.common.dict.model.CurrencyRateCb;
import ru.softlab.efr.common.dict.model.enums.CurrencyRateCalculationType;
import ru.softlab.efr.common.dict.repositories.CurrencyRateCbRepository;
import ru.softlab.efr.common.dict.repositories.CurrencyRateRepository;
import ru.softlab.efr.common.dict.services.currency.WsCurrencyRateService;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
@PropertySource("classpath:dict-update.properties")
public class CurrencyRateService {

    private static final Logger LOGGER = Logger.getLogger(CurrencyRateService.class);
    private static final List<String> ISO_CODES = Arrays.asList("USD", "EUR");
    private static final String CALCULATION_TYPE_SETTING = "currencyRateCalculationType";
    private static final String ADDITIONAL_PERCENT_SETTING = "additionalPercent";
    private static final DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    @Autowired
    private WsCurrencyRateService wsCurrencyRateService;

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private SettingsService settingsService;

    @Resource
    private CurrencyRateRepository rateRepository;
    @Resource
    private CurrencyRateCbRepository rateCbRepository;

    /**
     * Получение курса валюты по идентификатору записи в справочнике курсов валют
     *
     * @param id идентификатор курса
     * @return курс валюты
     */
    @Transactional(readOnly = true)
    public CurrencyRate findCurrencyRateById(Long id) {
        return rateRepository.findById(id);
    }

    /**
     * Получить постраничный список курсов валют
     *
     * @param pageable параметр постраничного просмотра
     * @return страница курсов валют
     */
    @Transactional(readOnly = true)
    public Page<CurrencyRate> findAll(Pageable pageable) {
        Pageable pageableDesc = new PageRequest(pageable.getPageNumber(), pageable.getPageSize(),
                new Sort(Sort.Direction.DESC, "startDate"));
        return rateRepository.findAll(pageableDesc);
    }

    /**
     * Получить мапу курсов валют ЦБ РФ за период по iso коду валюты
     *
     * @param iso       iso-код валюты
     * @param startDate дата начала получения курсов
     * @param endDate   дата окончания получения курсов
     * @return мапа ключ - дата, значение - курс, итератор от возвращаемой мапы будет возвращать пары (ключ/значение) в отсортированном по дате виде
     */
    public Map<LocalDate, BigDecimal> getCbRateByCurrencyIsoAndDateBetween(String iso, LocalDate startDate, LocalDate endDate) {
        List<CurrencyRateCb> rates = rateCbRepository.findAllByCurrencyIsoAndDateCbBetween(iso, startDate, endDate, new Sort("date"));
        Map<LocalDate, BigDecimal> result = new LinkedHashMap<>();
        if (rates != null) {
            rates.forEach(rate -> result.put(rate.getDate(), rate.getValue()));
        }
        return result;
    }

    /**
     * Получение текущего курса валюты
     *
     * @param currencyId идентификатор валюты
     * @return курс валюты
     */
    public CurrencyRate findActiveCurrencyRateByCurrencyId(Long currencyId) {
        return rateRepository.findActiveCurrencyRateByCurrencyId(currencyId);
    }

    /**
     * Сохранение курса валюты
     *
     * @param currencyRate данные курса для сохранения
     * @return сохраненная сущность
     */
    @Transactional
    public CurrencyRate save(CurrencyRate currencyRate) {
        return rateRepository.save(currencyRate);
    }

    /**
     * Создать новую запись справочника курсов валют и установить дату окончания у предыдущего курса
     *
     * @param rate данные для сохранения в справочнике курсов валют
     */
    @Transactional
    public void createRate(CurrencyRate rate) {
        CurrencyRate oldRate = findActiveCurrencyRateByCurrencyId(rate.getRate().getCurrency().getId());
        if (oldRate != null) {
            LocalDateTime endDate = rate.getStartDate();
            oldRate.setEndDate(endDate.minusSeconds(1));
            oldRate.setActive(false);
            rateRepository.save(oldRate);
        }
        rateRepository.save(rate);
    }

    /**
     * Задача обновления курса валют
     */
    @Scheduled(cron = "${currency.rate.update.schedule.cron}")
    @Transactional
    public void runUpdate() {
        ValuteData dailyInfoRate = wsCurrencyRateService.getDailyInfoRate(LocalDate.now());
        if (dailyInfoRate != null) {
            SettingEntity calculationTypeSetting = settingsService.get(CALCULATION_TYPE_SETTING);
            CurrencyRateCalculationType calculationType = CurrencyRateCalculationType.valueOf(calculationTypeSetting.getValue());
            SettingEntity additionalPercentSetting = settingsService.get(ADDITIONAL_PERCENT_SETTING);
            final BigDecimal percent = BigDecimal.valueOf(Long.parseLong(additionalPercentSetting.getValue()));
            dailyInfoRate.getValuteCursOnDate().stream()
                    .filter(rate -> ISO_CODES.contains(rate.getVchCode()))
                    .sorted(Comparator.comparing(ValuteData.ValuteCursOnDate::getVchCode))
                    .forEach(rate -> {
                        CurrencyEntity currency = currencyService.findByIso(rate.getVchCode());
                        CurrencyRate activeInnerRate = rateRepository.findActiveRateByCurrencyIdWithLock(currency.getId());
                        if (rateCbRepository.findByDateAndCurrency(LocalDate.now(), currency) == null) {
                            BigDecimal innerRate = calculateInnerRate(calculationType, rate.getVcurs(), percent, currency.getId());
                            createRate(rate, innerRate, currency, activeInnerRate);
                        }
                    });
        } else {
            LOGGER.warn(String.format("Не удалось получить данные курса валют из ЦБ РФ за %s", LocalDate.now().format(formatters)));
        }
    }

    /**
     * Обновление настроек для курсов валют
     *
     * @param type    тип расчета
     * @param percent добавочный процент
     */
    @Transactional
    public void updateCurrencyRateSettings(CalculationType type, BigDecimal percent) {
        SettingEntity calculationTypeSetting = settingsService.get(CALCULATION_TYPE_SETTING);
        SettingEntity additionalPercentSetting = settingsService.get(ADDITIONAL_PERCENT_SETTING);
        calculationTypeSetting.setValue(type.name());
        additionalPercentSetting.setValue(percent.toString());
        settingsService.save(calculationTypeSetting);
        settingsService.save(additionalPercentSetting);
    }

    private void createRate(ValuteData.ValuteCursOnDate rate, BigDecimal innerRate, CurrencyEntity currency, CurrencyRate activeRate) {
        CurrencyRateCb rateCb = new CurrencyRateCb();
        rateCb.setCurrency(currency);
        rateCb.setValue(rate.getVcurs());
        rateCb.setDate(LocalDate.now());
        rateCbRepository.save(rateCb);
        CurrencyRate newRate = new CurrencyRate();
        newRate.setRate(rateCb);
        newRate.setInnerRate(innerRate);
        newRate.setActive(true);
        newRate.setEdited(false);
        newRate.setStartDate(LocalDateTime.now());

        if (activeRate != null) {
            activeRate.setEndDate(newRate.getStartDate().minusSeconds(1));
            activeRate.setActive(false);
            rateRepository.save(activeRate);
        }
        rateRepository.save(newRate);
    }

    private BigDecimal calculateInnerRate(CurrencyRateCalculationType calculationType, BigDecimal rate, BigDecimal percent, Long currencyId) {
        switch (calculationType) {
            case CB_RF_WITH_PERCENT:
                return rate.add(rate.multiply(percent).divide(BigDecimal.valueOf(100), 4, RoundingMode.HALF_UP));
            case SET_BY_ADMINISTRATOR:
                CurrencyRate oldRate = findActiveCurrencyRateByCurrencyId(currencyId);
                return oldRate != null ? oldRate.getInnerRate() : rate;
            default:
                return rate;
        }
    }
}
