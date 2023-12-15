package ru.softlab.efr.common.dict.services;

import org.apache.commons.lang.NotImplementedException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.model.enums.DictUpdateProcessNameEnum;
import ru.softlab.efr.common.dict.utils.AppUtils;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;

/**
 * Базовый класс сервисов обновления справочников
 *
 * @author olshansky
 * @since 04.10.2018.
 */
@PropertySource("classpath:dict-update.properties")
public abstract class AbstractDictUpdateService {

    protected static final Logger LOGGER = Logger.getLogger(AbstractDictUpdateService.class);

    @Value("${list.update.start.ok}")
    protected String startUpdateOk;

    @Value("${dict.message.received}")
    protected String receivedText;

    @Value("${dict.message.responded}")
    protected String respondedText;

    @Value("${list.update.start.fail}")
    protected String startUpdateFail;

    @Value("${list.update.versions.equal}")
    protected String alreadyLoaded;

    @Value("${list.update.start.cancelled}")
    private String startCancelled;

    @Value("${list.update.finished}")
    private String updateFinished;

    @Value("${list.update.start.already}")
    private String startUpdateAlready;

    @Value("${list.update.status.running}")
    private String statusIsRunning;

    @Value("${list.update.status.stop}")
    private String statusIsNotRunning;

    @Value("${invalid.identity.doc.filepath}")
    private String invalidIdentityDocFilepath;

    @Value("${blockages.filepath}")
    private String blockageFilepath;

    @Value("${terrorist.filepath}")
    private String terroristFilepath;

    @Value("${list.update.count.result}")
    private String countLoaded;

    @Autowired
    private CurrentStateService currentStateService;

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private SettingsService settingsService;

    /**
     * Обновить список из источника
     * (загрузкой актуальных с последующей очисткой ранее созданных данных)
     *
     * @return execute status
     */
    public String updateList(MultipartFile frontFile) {

        LOGGER.info(String.format(receivedText, getProcessName().name(),
                "UPDATE-LIST", frontFile == null ? "empty" : frontFile));

        if (currentStateService.isRunning(getProcessName().toString())) {
            return startUpdateAlready;
        }
        try {
            if (isAlreadyLoaded(getNewDictVersion(frontFile))) {
                return alreadyLoaded;
            }
            //Проверяем существует ли файл
            if (frontFile == null && isNotExistStoredFile()) {
                LOGGER.error(String.format("Не удалось загрузить файл справочника %s - %s т.к. файл не существует",
                        getProcessName(), getPathOrDefault()));
                return startUpdateFail;
            }
            startRunning(getNewDictVersion(frontFile), frontFile, getNewDictDate(frontFile));
            taskExecutor.execute(() -> runUpdate(frontFile));
            return startUpdateOk;
        } catch (Exception ex) {
            LOGGER.error(String.format("Во время обновления справочника %s произошла ошибка, причина: ", getProcessName().name()), ex);
            LOGGER.info(String.format(respondedText, getProcessName().name(), "UPDATE-LIST", startUpdateFail));
            stopAndLogSomethingWrong(ex.getMessage());
            return startUpdateFail;
        }
    }

    /**
     * Обновить список из источника
     * (загрузкой актуальных с последующей очисткой ранее созданных данных)
     */
    public String updateList() throws IOException {
        return updateList(null);
    }

    protected abstract DictUpdateProcessNameEnum getProcessName();

    /**
     * Получить статус процесса обновления справочника
     *
     * @return статус процесса обновления справочника
     */
    public String getStatus() {
        LOGGER.info(String.format(receivedText, getProcessName().name(), "GET-STATUS", "empty"));
        String result = currentStateService.getStatus(getProcessName().toString());
        LOGGER.info(String.format(respondedText, getProcessName().name(), "GET-STATUS", result));
        return result;
    }

    protected boolean isRunning() {
        return currentStateService.isRunning(getProcessName().toString());
    }

    protected void logAlreadyRun() {
        LOGGER.info(String.format(startCancelled, getProcessName().toString()));
    }


    protected void startRunning(long version, MultipartFile frontFile, LocalDate fileDate) throws IOException {
        String fileName = null;
        long fileSize = 0;

        if (frontFile != null) {
            fileName = frontFile.getOriginalFilename();
            fileSize = frontFile.getSize();
        } else {
            if (isExistStoredFile()) {
                File file = new File(getPathOrDefault());
                fileName = file.getName();
                fileSize = Files.size(file.toPath());
            }
        }
        currentStateService.start(getProcessName().toString(), startUpdateOk, version, fileDate, fileName, fileSize);
        LOGGER.info(String.format(respondedText, getProcessName().name(), "UPDATE-LIST", startUpdateOk));
    }

    protected boolean isExistStoredFile() {
        File f = new File(getPathOrDefault());
        return f.exists() && !f.isDirectory();
    }

    protected boolean isNotExistStoredFile() {
        return !isExistStoredFile();
    }

    protected abstract void parseAndSave(MultipartFile file) throws Exception;

    protected abstract void startCheck() throws Exception;

    protected boolean isAlreadyLoaded(long version) {
        return currentStateService.isAlreadyLoadedVersion(getProcessName().toString(), version);
    }

    protected abstract long getNewDictVersion(MultipartFile frontFile) throws IOException;

    protected abstract LocalDate getNewDictDate(MultipartFile frontFile) throws IOException;

    private void successUploading() {
        currentStateService.successUploading(getProcessName().toString(), String.format(updateFinished, getProcessName().name()));
    }

    private void stopAndLogSomethingWrong(Throwable e) {
        LOGGER.error(String.format("Во время обновления справочника %s произошла ошибка, причина: ", getProcessName().name()), e);
        currentStateService.stopFail(getProcessName().toString(), e.toString());
    }

    private void stopAndLogSomethingWrong(String errorMessage) {
        LOGGER.error(errorMessage);
        currentStateService.stopFail(getProcessName().toString(), errorMessage);
    }

    protected abstract void logCount();

    protected void logCount(long count) {
        LOGGER.info(String.format(countLoaded, getProcessName().name(), count));
    }

    protected synchronized void runUpdate(MultipartFile frontFile) {
        try {
            try {
                parseAndSave(frontFile);
                successUploading();
                startCheck();
            } catch (Exception e) {
                stopAndLogSomethingWrong(e);
            }
        } catch (Exception e) {
            LOGGER.error(String.format("Не удалось загрузить файл справочника %s - %s, причина: ", getProcessName(), getPathOrDefault()), e);
        }
        logCount();
    }

    protected String getPathOrDefault() {
        String databaseSettingFilePath = getDatabaseSettingFilePath();
        if (AppUtils.isNullOrWhitespace(databaseSettingFilePath)) {
            switch (getProcessName()) {
                case BLOCKAGE:
                    return blockageFilepath;
                case TERRORIST:
                    return terroristFilepath;
                case INVALID_IDENTITY_DOC:
                    return invalidIdentityDocFilepath;
                default:
                    throw new NotImplementedException(String.format("Не указан путь файлу-справочнику для данного enums: %s", getProcessName().name()));
            }
        } else {
            return databaseSettingFilePath;
        }
    }

    public String getDatabaseSettingFilePath() {
        SettingEntity settingEntity = settingsService.get(getProcessName().name().concat("_FILE"));
        if (settingEntity != null) {
            return settingEntity.getValue();
        } else {
            return "";
        }
    }
}
