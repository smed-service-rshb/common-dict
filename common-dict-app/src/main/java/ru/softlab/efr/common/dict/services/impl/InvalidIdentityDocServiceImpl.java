package ru.softlab.efr.common.dict.services.impl;


import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.exchange.model.*;
import ru.softlab.efr.common.dict.model.InvalidIdentityDocEntity;
import ru.softlab.efr.common.dict.model.enums.DictUpdateProcessNameEnum;
import ru.softlab.efr.common.dict.repositories.InvalidIdentityDocRepository;
import ru.softlab.efr.common.dict.services.AbstractDictUpdateService;
import ru.softlab.efr.common.dict.services.CurrentStateService;
import ru.softlab.efr.services.insurance.ClientsDataClient;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.nio.file.Files;

/**
 * Сервис работы со справочником недействительных паспортов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
@PropertySource("classpath:dict-update.properties")
@Service
public class InvalidIdentityDocServiceImpl extends AbstractDictUpdateService {
    private static final int MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD = 5;

    private final InvalidIdentityDocRepository invalidIdentityDocRepository;
    private final ClientsDataClient clientsCheckClient;
    private final CurrentStateService currentStateService;


    @Autowired
    public InvalidIdentityDocServiceImpl(InvalidIdentityDocRepository invalidIdentityDocRepository, ClientsDataClient clientsCheckClient, CurrentStateService currentStateService) {
        this.invalidIdentityDocRepository = invalidIdentityDocRepository;
        this.clientsCheckClient = clientsCheckClient;
        this.currentStateService = currentStateService;
    }

    @Override
    public String updateList() throws IOException {
        /*
         * http://сервисы.гувм.мвд.рф/info-service.htm?sid=2000
         * bz2 400MB -> csv 1400MB
         * */
        return super.updateList();
    }

    @Override
    protected DictUpdateProcessNameEnum getProcessName() {
        return DictUpdateProcessNameEnum.INVALID_IDENTITY_DOC;
    }

    /**
     * Сохранить новый элемент справочника
     */
    public void save(InvalidIdentityDocEntity invalidIdentityDocEntity) {
        invalidIdentityDocRepository.save(invalidIdentityDocEntity);
    }

    public CheckInvalidIdentityDocRs checkList(CheckInvalidIdentityDocRq checkInvalidIdentityDocRq) {
        if (CollectionUtils.isNotEmpty(checkInvalidIdentityDocRq.getIdentityDocs())
                && checkInvalidIdentityDocRq.getIdentityDocs().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
            LOGGER.info(String.format(receivedText, getProcessName().name(), "CHECK-LIST", checkInvalidIdentityDocRq.getIdentityDocs().toString()));
        }

        CheckInvalidIdentityDocRs response = new CheckInvalidIdentityDocRs(
                String.valueOf(currentStateService.getCurrentDictIdByName(getProcessName().toString())), new ArrayList<>());

        if (CollectionUtils.isNotEmpty(checkInvalidIdentityDocRq.getIdentityDocs())) {

            if (checkInvalidIdentityDocRq.getIdentityDocs().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
                checkInvalidIdentityDocRq.getIdentityDocs().parallelStream().forEach(element -> {

                    boolean isInvalidIdentityDoc = invalidIdentityDocRepository.countAllByPassportSeriesNumber(
                            mapRequest2InvalidIdentityDocEntity(element)) > 0;

                    response.addResultListItem(new IdentityDocCheckResult(element.getId(), isInvalidIdentityDoc));

                });
            } else {
                List<String> passports = checkInvalidIdentityDocRq.getIdentityDocs().stream()
                        .map(this::mapRequest2InvalidIdentityDocEntity).collect(Collectors.toList());

                Set<InvalidIdentityDocEntity> invalidPassportSet = new TreeSet<>(invalidIdentityDocRepository.findAllByPassportSeriesNumberIn(passports));
                checkInvalidIdentityDocRq.getIdentityDocs().forEach(element ->
                        response.addResultListItem(getCheckPassportResult(element, invalidPassportSet)));
            }
        }
        if (CollectionUtils.isNotEmpty(checkInvalidIdentityDocRq.getIdentityDocs())
                && checkInvalidIdentityDocRq.getIdentityDocs().size() < MAX_COUNT_CITIZENS_FOR_DATABASE_CHECK_METHOD) {
            LOGGER.info(String.format(respondedText, getProcessName().name(), "CHECK-LIST", response.getResultList().toString()));
        }
        return response;
    }

    private String mapRequest2InvalidIdentityDocEntity(IdentityDocRq m) {
        return String.format("%s,%s", ensureNotNull(m.getPassportSeries().toString()), ensureNotNull(m.getPassportNumber().toString()));
    }

    private String ensureNotNull(String inputString) {
        return StringUtils.isNotBlank(inputString) ? inputString : "";
    }

    private IdentityDocCheckResult getCheckPassportResult(IdentityDocRq request, Set<InvalidIdentityDocEntity> passports) {
        boolean isInvalid = passports.contains(new InvalidIdentityDocEntity(
                mapRequest2InvalidIdentityDocEntity(request)
        ));

        return new IdentityDocCheckResult(
                request.getId(),
                isInvalid
        );
    }

    @Override
    protected void parseAndSave(MultipartFile file) {
        invalidIdentityDocRepository.uploadNewDict(getPathOrDefault());
    }

    @Override
    protected void startCheck() throws Exception {
        currentStateService.setDictStatus(new DictStatus(null, DictType.INVALID_IDENTITY_DOC, DictOperation.CHECK, null, null));
        clientsCheckClient.checkAllClients(ru.softlab.efr.services.insurance.model.rest.DictType.INVALID_IDENTITY_DOC.name(), String.valueOf(currentStateService.getCurrentDictIdByName(getProcessName().toString())));
    }

    @Override
    protected long getNewDictVersion(MultipartFile frontFile) throws IOException {
        if (isExistStoredFile()) {
            File file = new File(getPathOrDefault());
            BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            return attr.creationTime().toInstant().toEpochMilli() + attr.size();
        }
        return -1L;
    }

    @Override
    protected LocalDate getNewDictDate(MultipartFile frontFile) throws IOException {
        if (isExistStoredFile()) {
            File file = new File(getPathOrDefault());
            BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            return LocalDateTime.ofInstant(attr.creationTime().toInstant(), ZoneId.systemDefault()).toLocalDate();
        }
        return LocalDate.now();
    }


    @Override
    protected void logCount() {
        super.logCount(invalidIdentityDocRepository.count());
    }

    @Scheduled(cron = "${invalid.identity.doc.update.schedule.cron}")
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
            LOGGER.info(String.format("Обновление справочника %s не требуется, т.к. данный файл (дата создания + размер) был загружен ранее.", getProcessName()));
            return;
        }
        startRunning(getNewDictVersion(null), null, getNewDictDate(null));
        super.runUpdate(null);
    }
}
