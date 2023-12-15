package ru.softlab.efr.common.stubs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.repositories.TerroristRepository;
import ru.softlab.efr.common.dict.services.CurrentStateService;
import ru.softlab.efr.common.dict.services.DictUpdateService;
import ru.softlab.efr.common.dict.services.impl.TerroristServiceImpl;
import ru.softlab.efr.services.insurance.ClientsDataClient;

/**
 * Заглушечная реализация интеграции сервиса работы со списком террористов
 *
 * @author olshansky
 * @since 24.01.2019.
 */

@Primary
@Service
public class TerroristServiceStub extends TerroristServiceImpl implements DictUpdateService {


    public TerroristServiceStub(TerroristRepository terroristRepository, ClientsDataClient clientsCheckClient, CurrentStateService currentStateService) {
        super(terroristRepository, clientsCheckClient, currentStateService);
    }

    @Override
    public String getDatabaseSettingFilePath() {
        return TerroristServiceStub.class.getResource("/22.03.2018.dbf").getPath();
    }

    @Override
    public String updateList() {
        try {
            runUpdate();
            return startUpdateOk;
        } catch (Exception ex) {
            LOGGER.error("Во время обновления справочника террористов произошла ошибка, причина: ", ex);
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
            LOGGER.error("Во время обновления справочника террористов произошла ошибка, причина: ", ex);
            LOGGER.info(String.format(respondedText, getProcessName().name(), "UPDATE-LIST", startUpdateFail));
            return startUpdateFail;
        }
    }
}
