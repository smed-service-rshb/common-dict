package ru.softlab.efr.common.stubs;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.repositories.BlockagesRepository;
import ru.softlab.efr.common.dict.services.CurrentStateService;
import ru.softlab.efr.common.dict.services.DictUpdateService;
import ru.softlab.efr.common.dict.services.impl.BlockagesServiceImpl;
import ru.softlab.efr.services.insurance.ClientsDataClient;

/**
 * Заглушечная реализация интеграции сервиса работы со списком блокировок/заморозок
 *
 * @author olshansky
 * @since 24.01.2019.
 */

@Primary
@Service
public class BlockagesServiceStub extends BlockagesServiceImpl implements DictUpdateService {

    public BlockagesServiceStub(CurrentStateService currentStateService, BlockagesRepository blockagesRepository, ClientsDataClient clientsCheckClient) {
        super(currentStateService, blockagesRepository, clientsCheckClient);
    }

    @Override
    public String getDatabaseSettingFilePath() {
        return BlockagesServiceStub.class.getResource("/blockages_example.xml").getPath();
    }

    @Override
    public String updateList() {
        try {
            runUpdate();
            return startUpdateOk;
        } catch (Exception ex) {
            LOGGER.error("Во время обновления справочника блокировок произошла ошибка, причина: ", ex);
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
            LOGGER.error("Во время обновления справочника блокировок произошла ошибка, причина: ", ex);
            LOGGER.info(String.format(respondedText, getProcessName().name(), "UPDATE-LIST", startUpdateFail));
            return startUpdateFail;
        }
    }
}
