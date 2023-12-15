package ru.softlab.efr.common.dict.tools.bank.replicator;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFReader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import ru.softlab.efr.common.dict.model.BankEntity;
import ru.softlab.efr.common.dict.services.BankService;
import ru.softlab.efr.common.dict.tools.ReplicatorException;
import ru.softlab.efr.common.dict.utils.DBFUtils;
import ru.softlab.efr.common.dict.utils.DBFUtilsException;
import ru.softlab.efr.common.dict.utils.bank.replicator.BankReplicationUtils;
import ru.softlab.efr.common.dict.utils.dict.DictLoaderException;
import ru.softlab.efr.common.dict.utils.dict.RegLoader;
import ru.softlab.efr.common.dict.utils.dict.TnpLoader;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Репликатор справочника банвов
 *
 * @author egorov
 * @since 19.04.2017.
 */
public class BankReplicatorDBF {

    private static final Log LOG = LogFactory.getLog(BankReplicatorDBF.class);

    private BankService bankService;

    private SettingsService settingsService;

    private Map<String, String> tnpDict;
    private Map<String, String> regDict;
    private String fileDir;

    public BankReplicatorDBF(BankService bankService, SettingsService settingsService) {
        this.bankService = bankService;
        this.settingsService = settingsService;
    }

    /**
     * Выполнить репликацию справочника банков
     *
     * @throws ReplicatorException в случае ошибки репликации
     */
    public void replicate() throws ReplicatorException {
        loadData();
        Collection<String> activeBankBics = getActiveBankBics();
        markBanksAsDeleted(activeBankBics);
    }

    /**
     * Загрузить необходимые данные (путь к директории с файлами, данные о регионах и типах населённых пунктах)
     *
     * @throws ReplicatorException в случае ошибки репликации
     */
    private void loadData() throws ReplicatorException {
        SettingEntity bankDictDirPathSetting = settingsService.get(BankReplicatorConstants.BANK_DICT_DIR_PATH);
        if (bankDictDirPathSetting == null) {
            LOG.error(String.format(BankReplicatorConstants.SETTING_NOT_FOUND, BankReplicatorConstants.BANK_DICT_DIR_PATH));
            throw new ReplicatorException(String.format(BankReplicatorConstants.SETTING_NOT_FOUND, BankReplicatorConstants.BANK_DICT_DIR_PATH));
        }
        fileDir = bankDictDirPathSetting.getValue();
        try {
            tnpDict = new TnpLoader().load(fileDir);
            regDict = new RegLoader().load(fileDir);
        } catch (DictLoaderException e) {
            throw new ReplicatorException(e.getMessage());
        }
    }

    /**
     * Обновить данные о банках и получить список БИК активных банков
     *
     * @return список БИК активных банков
     * @throws ReplicatorException в случае ошибки репликации
     */
    private Collection<String> getActiveBankBics() throws ReplicatorException {
        try {
            Collection<String> activeBankBics = new HashSet<>();
            DBFReader reader = DBFUtils.getReader(fileDir, BankReplicatorConstants.BNKSEEK_FILE);
            for (int i = 0; i < reader.getRecordCount(); i++) {
                Object[] record = reader.nextRecord();
                Map<String, Object> values = DBFUtils.getValuesMap(reader, record);
                BankEntity bankEntity = insertOrUpdateBank(values);
                if (bankEntity != null) {
                    if (!bankEntity.isDeleted() && !StringUtils.isEmpty(bankEntity.getBic())) {
                        activeBankBics.add(bankEntity.getBic());
                    }
                }
            }
            return activeBankBics;
        } catch (DBFException e) {
            LOG.error(String.format(BankReplicatorConstants.ERROR_FILE_READ_MESSAGE, BankReplicatorConstants.BNKSEEK_FILE));
            throw new ReplicatorException(String.format(BankReplicatorConstants.ERROR_FILE_READ_MESSAGE, BankReplicatorConstants.BNKSEEK_FILE));
        } catch (DBFUtilsException e) {
            throw new ReplicatorException(e.getMessage());
        }
    }


    /**
     * Отметить неактивные на данный момент банки как удаленные.
     *
     * @param activeBankBics - список БИК активных банков
     */
    private void markBanksAsDeleted(Collection<String> activeBankBics) {
        List<BankEntity> activeBanksInDB = bankService.findActiveBanks();
        List<BankEntity> actualDeletedBanks = activeBanksInDB.stream().filter(bank -> !activeBankBics.contains(bank.getBic())).collect(Collectors.toList());
        //Банки, БИК которых нет в списке БИК активных банков помечаем как удаленные
        for (BankEntity bankEntity : actualDeletedBanks) {
            bankEntity.setDeleted(true);
            bankService.update(bankEntity);
        }
    }


    /**
     * Обновить или добавить данные о банке
     *
     * @param values - мапа <имя_поля, значение_поля> для конкретного банка
     * @return запись о банке в БД
     */
    private BankEntity insertOrUpdateBank(Map<String, Object> values) {
        String bic = (String) values.get(BankReplicatorConstants.BIC_FIELD_NAME);
        String bicRcc = (String) values.get(BankReplicatorConstants.BIC_RCC_FIELD_NAME);
        String corAcc = (String) values.get(BankReplicatorConstants.COR_ACC_FIELD_NAME);
        String name = (String) values.get(BankReplicatorConstants.NAME_FIELD_NAME);
        String shortName = (String) values.get(BankReplicatorConstants.SHORT_NAME_FIELD_NAME);
        String address = BankReplicationUtils.getAddress(values, regDict, tnpDict);
        boolean isDeleted = BankReplicationUtils.isDeleted(values);

        BankEntity bankEntity = bankService.findByBIC(bic);

        if (isDeleted) {
            if (bankEntity == null) {
                return null;
            } else {
                bankEntity.setDeleted(true);
                return bankService.update(bankEntity);
            }
        }

        boolean isNew = false;
        if (bankEntity == null) {
            bankEntity = new BankEntity();
            bankEntity.setBic(bic);
            bankEntity.setCountry(BankReplicatorConstants.CODE_COUNTRY_RUSSIA);
            bankEntity.setResident(true);
            isNew = true;
        } else {
            //Если карточка банка найдена, то обновляем информациию о банке при условии, что карточка банка не изменялась вручную
            if (!StringUtils.isEmpty(bankEntity.isChangedByHand())) {
                return bankEntity;
            }
        }

        bankEntity.setBicRcc(bicRcc);
        bankEntity.setAddress(address);
        bankEntity.setCorrAccount(corAcc);
        bankEntity.setName(name);
        bankEntity.setShortName(shortName);
        bankEntity.setDeleted(false);
        if (isNew) {
            return bankService.create(bankEntity);
        } else {
            return bankService.update(bankEntity);
        }
    }

}
