package ru.softlab.efr.common.dict.tools.bank.replicator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.softlab.efr.common.dict.model.BankEntity;
import ru.softlab.efr.common.dict.services.BankService;
import ru.softlab.efr.common.dict.tools.ReplicatorException;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import java.util.ArrayList;
import java.util.List;

import static ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorConstants.*;

/**
 * @author egorov
 * @since 20.04.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class BankReplicatorDBFTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private BankService bankService;

    @Mock
    private SettingsService settingsService;

    private BankReplicatorDBF bankReplicatorDBF;

    @Before
    public void setUp() {
        bankReplicatorDBF = new BankReplicatorDBF(bankService, settingsService);
    }

    /* Репликация прошла успешно - создан новый банк */
    @Test
    public void replication_success_createNewBank() throws Exception {
        setPathSetting("../common-dict-app/src/test/resources/mockDictionariesCreate/");

        BankEntity newBank1 = buildBankEntity(
                null,
                "040147781",
                "659322, АЛТАЙСКИЙ КРАЙ, Г. БИЙСК, УЛ.СОЦИАЛИСТИЧЕСКАЯ,1",
                false,
                null);

        List<BankEntity> bankList = new ArrayList<>();
        bankList.add(newBank1);

        Mockito.when(bankService.create(newBank1)).thenReturn(newBank1);
        Mockito.when(bankService.findActiveBanks()).thenReturn(bankList);

        bankReplicatorDBF.replicate();

        Mockito.verify(bankService).create(newBank1);
    }

    /* Репликация прошла успешно - обновлены данные о банке */
    @Test
    public void replication_success_updateBank() throws Exception {
        setPathSetting("../common-dict-app/src/test/resources/mockDictionariesUpdate/");

        BankEntity bankOld = buildBankEntity(
                1L,
                "040147781",
                "659322, МОСКВА, Г. МОСКВА, УЛ.БОЛЬШАЯ ЛУБЯНКА,1/3",
                false,
                null);

        BankEntity bankNew = buildBankEntity(
                1L,
                "040147781",
                "659322, АЛТАЙСКИЙ КРАЙ, Г. БИЙСК, УЛ.СОЦИАЛИСТИЧЕСКАЯ,1",
                false,
                null);

        List<BankEntity> bankList = new ArrayList<>();
        bankList.add(bankNew);

        Mockito.when(bankService.findByBIC("040147781")).thenReturn(bankOld);
        Mockito.when(bankService.update(bankNew)).thenReturn(bankNew);
        Mockito.when(bankService.findActiveBanks()).thenReturn(bankList);

        bankReplicatorDBF.replicate();

        Mockito.verify(bankService).update(bankNew);
    }

    /* Репликация прошла успешно - данные о банке не обновлены, т.к. были изменены вручную */
    @Test
    public void replication_success_notUpdateBank() throws Exception {
        setPathSetting("../common-dict-app/src/test/resources/mockDictionariesUpdate/");

        BankEntity bankOld = buildBankEntity(
                1L,
                "040147781",
                "659322, МОСКВА, Г. МОСКВА, УЛ.БОЛЬШАЯ ЛУБЯНКА,1/3",
                false,
                "Гай Юлий Цезарь 15.03.45 12:00:00");

        List<BankEntity> bankList = new ArrayList<>();
        bankList.add(bankOld);

        Mockito.when(bankService.findByBIC("040147781")).thenReturn(bankOld);
        Mockito.when(bankService.findActiveBanks()).thenReturn(bankList);

        bankReplicatorDBF.replicate();

        Mockito.verify(bankService, Mockito.never()).update(ArgumentMatchers.any());
    }

    /* Репликация прошла успешно - банк удален */
    @Test
    public void replication_success_deleteBank() throws Exception {
        setPathSetting("../common-dict-app/src/test/resources/mockDictionariesDelete/");

        BankEntity bankOld = buildBankEntity(
                1L,
                "040147781",
                "659322, МОСКВА, Г. МОСКВА, УЛ.БОЛЬШАЯ ЛУБЯНКА,1/3",
                false,
                null);

        BankEntity bankNew = buildBankEntity(
                1L,
                "040147781",
                "659322, МОСКВА, Г. МОСКВА, УЛ.БОЛЬШАЯ ЛУБЯНКА,1/3",
                true,
                null);

        Mockito.when(bankService.findByBIC("040147781")).thenReturn(bankOld);
        Mockito.when(bankService.update(bankNew)).thenReturn(bankNew);

        bankReplicatorDBF.replicate();

        Mockito.verify(bankService).update(bankNew);
    }

    /* Некорректно указан путь к файлам с данными */
    @Test
    public void replication_incorrectPathToDictionaries() throws Exception {
        setPathSetting("../incorrect_path");
        expectedException.expect(ReplicatorException.class);
        expectedException.expectMessage(String.format(FILE_NOT_FOUND_MESSAGE, TNP_FILE));
        bankReplicatorDBF.replicate();
    }

    /* Неверный формат файла с данными */
    @Test
    public void replication_incorrectFormatFiles() throws Exception {
        setPathSetting("../common-dict-app/src/test/resources/mockDictionariesFormat/");
        expectedException.expect(ReplicatorException.class);
        expectedException.expectMessage(String.format(ERROR_FILE_READ_MESSAGE, BNKSEEK_FILE));
        bankReplicatorDBF.replicate();
    }

    /* В файле не найдено нужное поле */
    @Test
    public void replication_fieldNotExist() throws Exception {
        setPathSetting("../common-dict-app/src/test/resources/mockDictionariesField/");
        expectedException.expect(ReplicatorException.class);
        expectedException.expectMessage(String.format(FIELD_NOT_FOUND_MESSAGE, TNP_KEY_FIELD_NAME, TNP_FILE));
        bankReplicatorDBF.replicate();
    }

    /* Не найдена настройка с путем к файлам */
    @Test
    public void replication_settingNotFound() throws Exception {
        expectedException.expect(ReplicatorException.class);
        expectedException.expectMessage(String.format(SETTING_NOT_FOUND, BANK_DICT_DIR_PATH));
        bankReplicatorDBF.replicate();
    }

    private void setPathSetting(String path) {
        Mockito.when(settingsService.get(BANK_DICT_DIR_PATH))
                .thenReturn(new SettingEntity(BANK_DICT_DIR_PATH, path, "Path to dictionaries"));

    }


    private BankEntity buildBankEntity(Long id, String bic, String address, boolean deleted, String changedByHand) {
        return new BankEntity(
                id, "", "", bic, "", null, null, "RUS",
                "", address, changedByHand, true, deleted);
    }

}
