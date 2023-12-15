package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.*;
import ru.softlab.efr.common.dict.model.CurrencyEntity;
import ru.softlab.efr.common.dict.model.CurrencyRate;
import ru.softlab.efr.common.dict.services.CurrencyRateService;
import ru.softlab.efr.common.dict.services.CurrencyService;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
public class CurrencyRateController implements CurrencyRateApi {

    private static final String CALCULATION_TYPE_SETTING = "currencyRateCalculationType";
    private static final String ADDITIONAL_PERCENT_SETTING = "additionalPercent";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Autowired
    private CurrencyRateService rateService;

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private SettingsService settingsService;

    @Override
    public ResponseEntity<Void> createCurrencyRate(@Valid @RequestBody CurrencyRateData createRateRequest) throws Exception {

        CurrencyEntity currencyEntity = currencyService.findById(createRateRequest.getCurrencyId());
        CurrencyRate rateDb = rateService.findActiveCurrencyRateByCurrencyId(createRateRequest.getCurrencyId());
        if (currencyEntity == null) {
            return ResponseEntity.badRequest().build();
        }

        CurrencyRate rate = new CurrencyRate();
        rate.setRate(rateDb.getRate());
        rate.setInnerRate(createRateRequest.getInnerRate());
        rate.setEdited(createRateRequest.isEdited());
        rate.setStartDate(LocalDateTime.now());
        rate.setActive(true);
        rateService.createRate(rate);

        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<ShortCurrencyRateData> getActiveCurrencyRate(@NotNull @Valid @RequestParam(value = "currencyId") Long currencyId) throws Exception {
        CurrencyRate currencyRate = rateService.findActiveCurrencyRateByCurrencyId(currencyId);
        if (currencyRate == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(convertToShortData(currencyRate));
    }

    @Override
    public ResponseEntity<CurrencyCbRateRs> getCbCurrencyRateList(@NotNull @Valid @RequestParam(value = "literalIso") String literalIso,
                                                                  @NotNull @Valid @RequestParam(value = "startDate") String startDate,
                                                                  @NotNull @Valid @RequestParam(value = "endDate") String endDate) throws Exception {
        LocalDate start;
        LocalDate end;
        try {
            start = LocalDate.parse(startDate, FORMATTER);
            end = LocalDate.parse(endDate, FORMATTER);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
        Map<LocalDate, BigDecimal> cbRateMap = rateService.getCbRateByCurrencyIsoAndDateBetween(literalIso, start, end);
        if (cbRateMap.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        CurrencyCbRateRs rs = new CurrencyCbRateRs();
        cbRateMap.forEach(((date, rate) -> rs.addRatesItem(new CurrencyCbRateData(literalIso, date.format(FORMATTER), rate))));

        return ResponseEntity.ok(rs);
    }

    @Override
    public ResponseEntity<CurrencyRateData> getCurrencyById(@PathVariable("id") Long id) throws Exception {
        CurrencyRate currencyRate = rateService.findCurrencyRateById(id);
        if (currencyRate == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(convert(currencyRate));
    }

    @Override
    public ResponseEntity<Page<CurrencyRateDataForList>> getCurrencyRateList(@PageableDefault(value = 50) Pageable pageable) throws Exception {
        Page<CurrencyRate> currencyRatePage = rateService.findAll(pageable);
        return ResponseEntity.ok(currencyRatePage.map(CurrencyRateController::convertToList));
    }

    @Override
    public ResponseEntity<CurrencyRateSettings> getCurrencyRateSetting() throws Exception {
        CurrencyRateSettings settings = new CurrencyRateSettings();
        SettingEntity calculationTypeSetting = settingsService.get(CALCULATION_TYPE_SETTING);
        SettingEntity additionalPercentSetting = settingsService.get(ADDITIONAL_PERCENT_SETTING);
        String additionalPercentValue = StringUtils.isEmpty(additionalPercentSetting) ? "0" : additionalPercentSetting.getValue();
        settings.setAdditionalPercent(new BigDecimal(additionalPercentValue));
        settings.setCalculationType(calculationTypeSetting != null ?
                CalculationType.valueOf(calculationTypeSetting.getValue()) : CalculationType.CB_RF_RATE);
        return ResponseEntity.ok(settings);
    }

    @Override
    public ResponseEntity<Void> updateCurrencyRateSetting(@Valid @RequestBody CurrencyRateSettings updateCurrencyRateSetting) throws Exception {
        rateService.updateCurrencyRateSettings(updateCurrencyRateSetting.getCalculationType(), updateCurrencyRateSetting.getAdditionalPercent());
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<CurrencyRateData> updateCurrencyRate(@PathVariable("id") Long id,
                                                               @Valid @RequestBody CurrencyRateData updateRateRequest) throws Exception {
        CurrencyRate currencyRate = rateService.findCurrencyRateById(id);
        if (currencyRate == null) {
            return ResponseEntity.notFound().build();
        }
        currencyRate.setInnerRate(updateRateRequest.getInnerRate());
        currencyRate.setEdited(true);

        return ResponseEntity.ok(convert(rateService.save(currencyRate)));
    }

    private static ShortCurrencyRateData convertToShortData(CurrencyRate rate) {
        ShortCurrencyRateData data = new ShortCurrencyRateData();
        data.setId(rate.getId());
        data.setRate(rate.getRate().getValue());
        data.setCurrencyId(rate.getRate().getCurrency().getId());
        data.setInnerRate(rate.getInnerRate());
        return data;
    }

    private static CurrencyRateData convert(CurrencyRate rate) {
        CurrencyRateData data = new CurrencyRateData();
        data.setId(rate.getId());
        data.setRate(rate.getRate().getValue());
        data.setCurrencyId(rate.getRate().getCurrency().getId());
        data.setStartDate(rate.getStartDate().atOffset(OffsetDateTime.now(ZoneId.systemDefault()).getOffset()));
        data.setEndDate(rate.getEndDate() != null ? rate.getEndDate().atOffset(OffsetDateTime.now(ZoneId.systemDefault()).getOffset()) : null);
        data.setInnerRate(rate.getInnerRate());
        data.setActive(rate.getActive());
        data.setEdited(rate.getEdited());
        return data;
    }

    private static CurrencyRateDataForList convertToList(CurrencyRate rate) {
        CurrencyRateDataForList data = new CurrencyRateDataForList();
        data.setId(rate.getId());
        data.setRate(rate.getRate().getValue());
        data.setCurrencyId(rate.getRate().getCurrency().getId());
        data.setStartDate(rate.getStartDate().atOffset(OffsetDateTime.now(ZoneId.systemDefault()).getOffset()));
        data.setEndDate(rate.getEndDate() != null ? rate.getEndDate().atOffset(OffsetDateTime.now(ZoneId.systemDefault()).getOffset()) : null);
        data.setInnerRate(rate.getInnerRate());
        data.setActive(rate.getActive());
        data.setEdited(rate.getEdited());
        data.setCurrencyIso(rate.getRate().getCurrency().getLiteralISO());
        return data;
    }
}
