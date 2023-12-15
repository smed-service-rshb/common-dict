package ru.softlab.efr.common.dict.services.impl;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.exchange.model.*;
import ru.softlab.efr.common.dict.model.TerroristEntity;
import ru.softlab.efr.common.dict.model.enums.DictUpdateProcessNameEnum;
import ru.softlab.efr.common.dict.repositories.TerroristRepository;
import ru.softlab.efr.common.dict.services.AbstractDictUpdateService;
import ru.softlab.efr.common.dict.services.CurrentStateService;
import ru.softlab.efr.common.dict.services.DictUpdateService;
import ru.softlab.efr.common.dict.utils.AppUtils;
import ru.softlab.efr.common.dict.utils.dict.TerroristDBFReader;
import ru.softlab.efr.common.utilities.rest.client.RestClientException;
import ru.softlab.efr.services.insurance.ClientsDataClient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

/**
 * Реализация интеграции сервиса работы со списком экстремистов/террористов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
@PropertySource("classpath:dict-update.properties")
@Service
public class TerroristServiceImpl extends AbstractDictUpdateService implements DictUpdateService {

    private static final int MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD = 5;
    private TerroristDBFReader terroristDBFReader = new TerroristDBFReader();
    private final ClientsDataClient clientsCheckClient;
    private final TerroristRepository terroristRepository;
    private final CurrentStateService currentStateService;

    @Autowired
    public TerroristServiceImpl(TerroristRepository terroristRepository, ClientsDataClient clientsCheckClient, CurrentStateService currentStateService) {
        this.terroristRepository = terroristRepository;
        this.clientsCheckClient = clientsCheckClient;
        this.currentStateService = currentStateService;
    }

    @Override
    public String updateList() throws IOException {
        return super.updateList();
    }

    @Override
    protected DictUpdateProcessNameEnum getProcessName() {
        return DictUpdateProcessNameEnum.TERRORIST;
    }

    public CheckTerroristRs checkList(CheckTerroristRq checkTerroristRq) {
        if (CollectionUtils.isNotEmpty(checkTerroristRq.getCitizens())
                && checkTerroristRq.getCitizens().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
            LOGGER.info(String.format(receivedText, getProcessName().name(), "CHECK-LIST", checkTerroristRq.getCitizens().toString()));
        }

        CheckTerroristRs response = new CheckTerroristRs(String.valueOf(currentStateService.getCurrentDictIdByName(getProcessName().toString())), new ArrayList<>());

        if (CollectionUtils.isNotEmpty(checkTerroristRq.getCitizens())) {

            if (checkTerroristRq.getCitizens().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
                checkTerroristRq.getCitizens().parallelStream().forEach(element ->
                        response.addCitizensItem(getCheckTerroristResultDatabase(element)));
            } else {
                TreeSet<TerroristEntity> terroristsTreeSet = new TreeSet<>(terroristRepository.findAll());
                checkTerroristRq.getCitizens().forEach(element ->
                        response.addCitizensItem(getCheckTerroristResultTreeSet(element, terroristsTreeSet)));
            }

        }
        if (CollectionUtils.isNotEmpty(checkTerroristRq.getCitizens())
                && checkTerroristRq.getCitizens().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
            LOGGER.info(String.format(respondedText, getProcessName().name(), "CHECK-LIST", response.getCitizens().toString()));
        }
        return response;
    }

    private CheckTerroristResult getCheckTerroristResultTreeSet(PersonnelData request, TreeSet<TerroristEntity> terrorists) {
        Date birthDate = null;
        if (request.getBirthDate() != null) {
            birthDate = Date.from(request.getBirthDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        }
        if (terrorists.contains(new TerroristEntity(AppUtils.harmonizationString(request.getLastName()),
                AppUtils.harmonizationString(request.getFirstName()),
                AppUtils.harmonizationString(request.getMiddleName()),
                birthDate,
                AppUtils.harmonizationString(request.getPassportSeries()),
                AppUtils.harmonizationString(request.getPassportNumber())))) {

            return new CheckTerroristResult(
                    request.getId(),
                    true,
                    ""
            );
        } else {
            return new CheckTerroristResult(
                    request.getId(),
                    false,
                    ""
            );
        }
    }


    private CheckTerroristResult getCheckTerroristResultDatabase(PersonnelData request) {
        Integer countFound = 0;
        Date birthDate = null;
        String additionalInf = "";

        if (request.getBirthDate() != null) {
            birthDate = Date.from(request.getBirthDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        }

        if (AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getMiddleName(),
                request.getPassportSeries(), request.getPassportNumber())
                && request.getBirthDate() != null) {

            countFound = terroristRepository.countByLastNameAndFirstNameAndMiddleNameAndBirthDateAndPassportSeriesAndPassportNumber(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    request.getMiddleName().trim().toUpperCase(),
                    birthDate,
                    request.getPassportSeries().trim().toUpperCase(),
                    request.getPassportNumber().trim().toUpperCase());

            additionalInf = String.format("Count of found terrorists by lastName+firstName+middleName+birthDate+passportSeries+passportNumber: %s", countFound);
        }

        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getPassportSeries(), request.getPassportNumber())
                && StringUtils.isBlank(request.getMiddleName())
                && request.getBirthDate() != null) {

            countFound = terroristRepository.countByLastNameAndFirstNameAndBirthDateAndPassportSeriesAndPassportNumber(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    birthDate,
                    request.getPassportSeries().trim().toUpperCase(),
                    request.getPassportNumber().trim().toUpperCase());
            additionalInf = String.format("Count of found terrorists by lastName+firstName+birthDate+passportSeries+passportNumber: %s", countFound);
        }

        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getMiddleName())
                && request.getBirthDate() != null
                && AppUtils.isNullOrWhitespace(request.getPassportNumber(), request.getPassportSeries())) {

            countFound = terroristRepository.countByLastNameAndFirstNameAndMiddleNameAndBirthDate(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    request.getMiddleName().trim().toUpperCase(),
                    birthDate);
            additionalInf = String.format("Count of found terrorists by lastName+firstName+middleName+birthDate: %s", countFound);

        }

        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName())
                && request.getBirthDate() != null
                && AppUtils.isNullOrWhitespace(request.getMiddleName(), request.getPassportNumber(), request.getPassportSeries())) {

            countFound = terroristRepository.countByLastNameAndFirstNameAndBirthDate(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    birthDate);
            additionalInf = String.format("Count of found terrorists by lastName+firstName+birthDate: %s", countFound);

        }

        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getPassportSeries(), request.getPassportNumber())
                && AppUtils.isNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getMiddleName(),
                request.getPassportNumber(), request.getPassportSeries())) {

            countFound = terroristRepository.countByPassportSeriesAndPassportNumber(request.getPassportSeries(), request.getPassportNumber());
            additionalInf = String.format("Count of found terrorists by passportSeries+passportNumber: %s", countFound);
        }

        if (countFound == 0) {
            additionalInf = "Count of found terrorists by provided information: 0";
        }

        boolean isTerrorist = countFound > 0;
        return new CheckTerroristResult(
                request.getId(),
                isTerrorist,
                additionalInf
        );
    }

    @Override
    protected void parseAndSave(MultipartFile frontFile) throws IOException {
        List<TerroristEntity> parsedEntities;
        long newDictVersion = getNewDictVersion(frontFile);
        parsedEntities = terroristDBFReader.getTerroristFromDBF(getPathOrDefault(), frontFile, newDictVersion);
        terroristRepository.save(parsedEntities);
        terroristRepository.deleteAllByVersionIsNot(newDictVersion);
    }

    @Override
    protected long getNewDictVersion(MultipartFile frontFile) {
        if (frontFile != null && StringUtils.isNotBlank(frontFile.getOriginalFilename())) {
            return getMillisFromDate(parseDateFromString(frontFile.getOriginalFilename().replace(".dbf", "")))
                    + frontFile.getSize();
        }
        return getMillisFromDate(parseDateFromString(new File(getPathOrDefault()).getName().replace(".dbf", "")));
    }

    private LocalDate parseDateFromString(String localDate) {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(localDate, formatters);
    }

    private long getMillisFromDate(LocalDate localDate) {
        return localDate.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    @Override
    protected LocalDate getNewDictDate(MultipartFile frontFile) {
        if (frontFile != null && StringUtils.isNotBlank(frontFile.getOriginalFilename())) {
            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(frontFile.getOriginalFilename().replace(".dbf", ""), formatters);
        }
        return LocalDate.now();
    }

    @Override
    protected void startCheck() throws RestClientException {
        currentStateService.setDictStatus(new DictStatus(null, DictType.TERRORIST, DictOperation.CHECK, null, null));
        clientsCheckClient.checkAllClients(ru.softlab.efr.services.insurance.model.rest.DictType.TERRORIST.name(), String.valueOf(currentStateService.getCurrentDictIdByName(getProcessName().toString())));
    }

    @Override
    protected void logCount() {
        super.logCount(terroristRepository.count());
    }

    //@Scheduled(cron = "${terrorist.update.schedule.cron}")
    protected void runUpdate() throws IOException {
        if (isRunning()) {
            logAlreadyRun();
            LOGGER.warn(String.format("Обновление справочника %s уже идёт, повторный запуск отменён.", getProcessName()));
            return;
        }
        if (isNotExistStoredFile()) {
            LOGGER.warn(String.format("Не удалось загрузить файл справочника %s - %s т.к. файл не существует", getProcessName(), getPathOrDefault()));
            return;
        }
        if (isAlreadyLoaded(getNewDictVersion(null))) {
            LOGGER.info(String.format("Обновление справочника %s не требуется, т.к. данный файл (дата из имени файла в формате дд.мм.гггг.dbf) был загружен ранее.", getProcessName()));
            return;
        }
        startRunning(getNewDictVersion(null), null, getNewDictDate(null));
        super.runUpdate(null);
    }
}
