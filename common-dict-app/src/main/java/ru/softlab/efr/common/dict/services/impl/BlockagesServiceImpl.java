package ru.softlab.efr.common.dict.services.impl;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.exchange.model.*;
import ru.softlab.efr.common.dict.exchange.model.blockages.DecisionsXml;
import ru.softlab.efr.common.dict.model.BlockageEntity;
import ru.softlab.efr.common.dict.model.enums.DictUpdateProcessNameEnum;
import ru.softlab.efr.common.dict.repositories.BlockagesRepository;
import ru.softlab.efr.common.dict.services.AbstractDictUpdateService;
import ru.softlab.efr.common.dict.services.CurrentStateService;
import ru.softlab.efr.common.dict.services.DictUpdateService;
import ru.softlab.efr.common.dict.utils.AppUtils;
import ru.softlab.efr.common.dict.utils.dict.BlockagesXMLReader;
import ru.softlab.efr.common.utilities.rest.client.RestClientException;
import ru.softlab.efr.services.insurance.ClientsDataClient;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Реализация интеграции сервиса работы со списком блокировок/заморозок
 *
 * @author olshansky
 * @since 17.09.2018.
 */
@PropertySource("classpath:dict-update.properties")
@Service
public class BlockagesServiceImpl extends AbstractDictUpdateService implements DictUpdateService {

    private static final int MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD = 5;
    private final CurrentStateService currentStateService;
    private final BlockagesRepository blockagesRepository;
    private final ClientsDataClient clientsCheckClient;

    private BlockagesXMLReader blockagesReader = new BlockagesXMLReader();

    @Autowired
    public BlockagesServiceImpl(CurrentStateService currentStateService, BlockagesRepository blockagesRepository, ClientsDataClient clientsCheckClient) {
        this.currentStateService = currentStateService;
        this.blockagesRepository = blockagesRepository;
        this.clientsCheckClient = clientsCheckClient;
    }

    @Override
    protected DictUpdateProcessNameEnum getProcessName() {
        return DictUpdateProcessNameEnum.BLOCKAGE;
    }

    @Override
    public String updateList() throws IOException {
        return super.updateList();
    }

    /**
     * Получить статус процесса обновления справочника
     *
     * @return статус процесса обновления справочника
     */
    public String getStatus() {
        return currentStateService.getStatus(DictUpdateProcessNameEnum.BLOCKAGE.toString());
    }

    public CheckBlockagesRs checkList(CheckBlockagesRq checkBlockagesRq) {
        if (CollectionUtils.isNotEmpty(checkBlockagesRq.getCitizens())
                && checkBlockagesRq.getCitizens().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
            LOGGER.info(String.format(receivedText, getProcessName().name(), "CHECK-LIST", checkBlockagesRq.getCitizens().toString()));
        }
        CheckBlockagesRs response = new CheckBlockagesRs(String.valueOf(currentStateService.getCurrentDictIdByName(getProcessName().toString())),
                new ArrayList<>());

        if (CollectionUtils.isNotEmpty(checkBlockagesRq.getCitizens())) {

            if (checkBlockagesRq.getCitizens().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
                checkBlockagesRq.getCitizens().parallelStream().forEach(element ->
                        response.addCitizensItem(getCheckBlockagesResultFromDatabase(element)));
            } else {
                TreeSet<BlockageEntity> blockageTreeSet = new TreeSet<>(blockagesRepository.findAll());
                checkBlockagesRq.getCitizens().forEach(element ->
                        response.addCitizensItem(getCheckBlockagesResultFromTreeSet(element, blockageTreeSet)));
            }
        }
        if (CollectionUtils.isNotEmpty(checkBlockagesRq.getCitizens())
                && checkBlockagesRq.getCitizens().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
            LOGGER.info(String.format(respondedText, getProcessName().name(), "CHECK-LIST", response));
        }
        return response;
    }

    private CheckBlockagesResult getCheckBlockagesResultFromTreeSet(PersonnelData request, TreeSet<BlockageEntity> blockages) {
        if (blockages.contains(new BlockageEntity(AppUtils.harmonizationString(request.getLastName()),
                AppUtils.harmonizationString(request.getFirstName()),
                AppUtils.harmonizationString(request.getMiddleName()),
                request.getBirthDate(),
                AppUtils.harmonizationString(request.getPassportSeries()),
                AppUtils.harmonizationString(request.getPassportNumber())))) {

            return new CheckBlockagesResult(
                    request.getId(),
                    true,
                    ""
            );
        } else {
            return new CheckBlockagesResult(
                    request.getId(),
                    false,
                    ""
            );
        }
    }

    private CheckBlockagesResult getCheckBlockagesResultFromDatabase(PersonnelData request) {
        Integer countFound = 0;
        String additionalInf = "";

        if (AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getMiddleName(),
                request.getPassportSeries(), request.getPassportNumber())
                && request.getBirthDate() != null) {

            countFound = blockagesRepository.countByLastNameAndFirstNameAndMiddleNameAndBirthDateAndPassportSeriesAndPassportNumber(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    request.getMiddleName().trim().toUpperCase(),
                    request.getBirthDate(),
                    request.getPassportSeries().trim().toUpperCase(),
                    request.getPassportNumber().trim().toUpperCase());
            additionalInf = String.format("Count of found blockages by lastName+firstName+middleName+birthDate+passportSeries+passportNumber: %s", countFound);
        }

        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName(),
                request.getPassportSeries(), request.getPassportNumber())
                && AppUtils.isNullOrWhitespace(request.getMiddleName())
                && request.getBirthDate() != null) {

            countFound = blockagesRepository.countByLastNameAndFirstNameAndBirthDateAndPassportSeriesAndPassportNumber(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    request.getBirthDate(),
                    request.getPassportSeries().trim().toUpperCase(),
                    request.getPassportNumber().trim().toUpperCase());
            additionalInf = String.format("Count of found blockages by lastName+firstName+birthDate+passportSeries+passportNumber: %s", countFound);
        }


        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getMiddleName())
                && AppUtils.isNullOrWhitespace(request.getPassportSeries(), request.getPassportNumber())
                && request.getBirthDate() != null) {

            countFound = blockagesRepository.countByLastNameAndFirstNameAndMiddleNameAndBirthDate(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    request.getMiddleName().trim().toUpperCase(),
                    request.getBirthDate());
            additionalInf = String.format("Count of found blockages by lastName+firstName+middleName+birthDate: %s", countFound);
        }

        if (countFound == 0
                && AppUtils.isNotNullOrWhitespace(request.getLastName(), request.getFirstName())
                && AppUtils.isNullOrWhitespace(request.getMiddleName(), request.getPassportNumber(), request.getPassportSeries())
                && request.getBirthDate() != null) {

            countFound = blockagesRepository.countByLastNameAndFirstNameAndBirthDate(
                    request.getLastName().trim().toUpperCase(),
                    request.getFirstName().trim().toUpperCase(),
                    request.getBirthDate());
            additionalInf = String.format("Count of found blockages by lastName+firstName+birthDate: %s", countFound);
        }



        if (countFound == 0
                && AppUtils.isNullOrWhitespace(request.getLastName(), request.getFirstName(), request.getMiddleName())
                && AppUtils.isNotNullOrWhitespace(request.getPassportSeries(), request.getPassportNumber())
                && request.getBirthDate() == null) {

            countFound = blockagesRepository.countByPassportSeriesAndPassportNumber(request.getPassportSeries(), request.getPassportNumber());
            additionalInf = String.format("Count of found blockages by passportSeries+passportNumber: %s", countFound);
        }

        if (countFound == 0) {
            additionalInf = "Count of found blockages by provided information: 0";
        }

        boolean isBlocked = countFound > 0;
        return new CheckBlockagesResult(
                request.getId(),
                isBlocked,
                additionalInf
        );
    }

    @Override
    protected void parseAndSave(MultipartFile frontFile) throws Exception {
        List<BlockageEntity> parsedEntities;
        DecisionsXml decisionsXml = blockagesReader.parseBlockageFromXml(getPathOrDefault(), frontFile);
        long newDictVersion = getNewDictVersion(frontFile);
        if (!decisionsXml.getFormatVersion().equals("1.0")) {
            LOGGER.warn(getProcessName().toString().concat(" - Версия формата файла отличается от версии, поддерживаемой загрузчиком"));
        }
        parsedEntities = blockagesReader.getBlockageListFromFile(newDictVersion, decisionsXml);
        blockagesRepository.save(parsedEntities);
        blockagesRepository.deleteAllByVersionIsNot(newDictVersion);
    }

    @Override
    protected long getNewDictVersion(MultipartFile frontFile) throws IOException {
        return getNewDictVersion(blockagesReader.parseBlockageFromXml(getPathOrDefault(), frontFile));
    }

    private long getNewDictVersion(DecisionsXml decisionsXml) {
        return decisionsXml.getListDate().toGregorianCalendar().getTimeInMillis();
    }

    protected LocalDate getNewDictDate(MultipartFile frontFile) throws IOException {
        return blockagesReader.parseBlockageFromXml(getPathOrDefault(), frontFile)
                .getListDate().toGregorianCalendar().toZonedDateTime().toLocalDate();
    }

    @Override
    protected void startCheck() throws RestClientException {
        currentStateService.setDictStatus(new DictStatus(null, DictType.BLOCKAGE, DictOperation.CHECK, null, null));
        clientsCheckClient.checkAllClients(ru.softlab.efr.services.insurance.model.rest.DictType.BLOCKAGE.name(), String.valueOf(currentStateService.getCurrentDictIdByName(getProcessName().toString())));
    }

    @Override
    protected void logCount() {
        super.logCount(blockagesRepository.count());
    }

    //@Scheduled(cron = "${blockages.update.schedule.cron}")
    protected void runUpdate() throws IOException {
        MultipartFile file = null;
        if (isRunning()) {
            logAlreadyRun();
            LOGGER.warn(String.format("Обновление справочника %s уже идёт, повторный запуск отменён.", getProcessName()));
            return;
        }
        if (isNotExistStoredFile()) {
            LOGGER.warn(String.format("Не удалось загрузить файл справочника %s - %s т.к. файл не существует", getProcessName(), getPathOrDefault()));
            return;
        }
        if (isAlreadyLoaded(getNewDictVersion(file))) {
            LOGGER.info(String.format("Обновление справочника %s не требуется, т.к. данный файл (дата из тега ДатаСписка) был загружен ранее.", getProcessName()));
            return;
        }
        startRunning(getNewDictVersion(file), file, getNewDictDate(file));
        super.runUpdate(null);
    }
}
