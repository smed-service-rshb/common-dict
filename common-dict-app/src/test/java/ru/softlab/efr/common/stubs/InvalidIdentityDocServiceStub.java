package ru.softlab.efr.common.stubs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.repositories.InvalidIdentityDocRepository;
import ru.softlab.efr.common.dict.services.CurrentStateService;
import ru.softlab.efr.common.dict.services.DictUpdateService;
import ru.softlab.efr.common.dict.services.impl.InvalidIdentityDocServiceImpl;
import ru.softlab.efr.services.insurance.ClientsDataClient;

/**
 * Заглушечная реализация интеграции сервиса работы со списком недействительных паспортов
 *
 * @author olshansky
 * @since 24.01.2019.
 */

@Primary
@Service
public class InvalidIdentityDocServiceStub extends InvalidIdentityDocServiceImpl implements DictUpdateService {


    public InvalidIdentityDocServiceStub(InvalidIdentityDocRepository invalidIdentityDocRepository, ClientsDataClient clientsCheckClient, CurrentStateService currentStateService) {
        super(invalidIdentityDocRepository, clientsCheckClient, currentStateService);
    }

    @Override
    public String getDatabaseSettingFilePath() {
        return InvalidIdentityDocServiceStub.class.getResource("/list_of_expired_passports.csv").getPath();
    }

    @Override
    public String updateList() {
        try {
            runUpdate();
            return startUpdateOk;
        } catch (Exception ex) {
            LOGGER.error("Во время обновления справочника паспортов произошла ошибка, причина: ", ex);
            LOGGER.info(String.format(respondedText, getProcessName().name(), "UPDATE-LIST", startUpdateFail));
            return startUpdateFail;
        }
    }

    @Override
    public String updateList(MultipartFile frontFile) {
        try {
            startRunning(getNewDictVersion(frontFile), frontFile, getNewDictDate(frontFile));
            runUpdate(frontFile);
            return startUpdateOk;
        } catch (Exception ex) {
            LOGGER.error("Во время обновления справочника паспортов произошла ошибка, причина: ", ex);
            LOGGER.info(String.format(respondedText, getProcessName().name(), "UPDATE-LIST", startUpdateFail));
            return startUpdateFail;
        }
    }
}
