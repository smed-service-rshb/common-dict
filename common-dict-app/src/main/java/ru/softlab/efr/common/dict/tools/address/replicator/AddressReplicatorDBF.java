package ru.softlab.efr.common.dict.tools.address.replicator;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFReader;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.softlab.efr.common.dict.exchange.model.AddressLevel;
import ru.softlab.efr.common.dict.exchange.model.HouseType;
import ru.softlab.efr.common.dict.model.AddressEntity;
import ru.softlab.efr.common.dict.model.HouseEntity;
import ru.softlab.efr.common.dict.services.AddressService;
import ru.softlab.efr.common.dict.services.HouseService;
import ru.softlab.efr.common.dict.tools.ReplicatorException;
import ru.softlab.efr.common.dict.tools.ReplicatorHelper;
import ru.softlab.efr.common.dict.utils.DBFUtils;
import ru.softlab.efr.common.dict.utils.DBFUtilsException;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ru.softlab.efr.common.dict.tools.address.replicator.AddressReplicatorConstants.*;

/**
 * Репликатор адресов
 *
 * @author gladishev
 * @since 17.10.2017
 */
@SuppressWarnings("Duplicates")
@Component
public class AddressReplicatorDBF {

    //соответствие типов адресов справочника SOCRBASE.DBF и наших типов объектов
    private static final Map<Integer, AddressLevel> ADDRESS_LEVEL_MAP = new HashMap<>();
    private static final Log LOG = LogFactory.getLog(AddressReplicatorDBF.class);
    private static final Set<Integer> ADDRESS_ADD_OPERSTATUS_VALUES = new HashSet<>();
    private static final Set<Integer> ADDRESS_CHANGE_OPERSTATUS_VALUES = new HashSet<>();
    private static final Set<Integer> ADDRESS_DELETE_OPERSTATUS_VALUES = new HashSet<>();
    private static final String DICT_DIR_EMPTY_ERROR = String.format("Не указана настройка [%s]", AddressReplicatorConstants.ADDRESS_DICT_DIR_PATH);
    private static final String ERROR_DIR_READ_MESSAGE = String.format("Неверно указана директория [%s]", AddressReplicatorConstants.ADDRESS_DICT_DIR_PATH);
    private static final String ERROR_FILE_READ_TEMPLATE = "Ошибка чтения файла [%s]";
    private static final int PACK_SIZE = 1000;
    private static final int FILL_FULL_ADDRESSES_PACK_SIZE = 10000;
    private static final String ENDDATE = "ENDDATE";
    private static final String ESTSTATUS = "ESTSTATUS";
    private static final String HOUSENUM = "HOUSENUM";
    private static final String BUILDNUM = "BUILDNUM";
    private static final String STRUCNUM = "STRUCNUM";
    private static final String HOUSEID = "HOUSEID";
    private static final String HOUSEGUID = "HOUSEGUID";
    private static final String STRSTATUS = "STRSTATUS";
    private static final String OPERSTATUS = "OPERSTATUS";
    private static final String AOGUID = "AOGUID";
    private static final String OFFNAME = "OFFNAME";
    private static final String POSTALCODE = "POSTALCODE";
    private static final String SHORTNAME = "SHORTNAME";
    private static final String PARENTGUID = "PARENTGUID";
    private static final String AOID = "AOID";
    private static final String ACTSTATUS = "ACTSTATUS";
    private static final String CURRSTATUS = "CURRSTATUS";
    private static final String LIVESTATUS = "LIVESTATUS";
    private static final String AOLEVEL = "AOLEVEL";
    private static final String OKATO = "OKATO";
    private static final String UPDATE_ADDRESSES_CHANGE_ERROR = "Ошибка при обновлении адреса. Файл [%s]. OPERSTATUS: [%s]. Адрес в БД не найден. Адрес из справочника: [%s]";
    private static final String UPDATE_ADDRESSES_DELETE_ERROR = "Ошибка при удалении адреса. Файл [%s]. OPERSTATUS: [%s]. Адрес в БД не найден. Адрес из справочника: [%s]";
    private static final String ADD_ADDRESS_MESSAGE = "Добавлен адрес [%s]";
    private static final String CHANGE_ADDRESS_MESSAGE = "Изменен адрес [%s]";
    private static final String DELETE_ADDRESS_MESSAGE = "Удален адрес [%s]";
    private static final String UNKNOWN_OPERSTATUS_ERROR = "Неподдерживаемый OPERSTATUS: [%s]. Адрес: [%s]";
    private static final String UPDATE_HOUSES_CHANGE_MESSAGE = "Обновлено строение [%s]";
    private static final String UPDATE_HOUSES_ADD_MESSAGE = "Добавлено строение [%s]";
    private static final String RECORDS_FILL = "Обработаны записи с id %s-%s";
    private static final String UNKNOWN_ADDRESS_LEVEL = "Неизвестный уровень иерархии адреса [%s]";
    private static final String RECORDS_COUNT = "Количество записей: %s";
    private static final String UPDATE_ADDRESSES_INFO = "Обновление адресов. Получаем адреса из файла ";
    private static final String UPDATE_HOUSES_INFO = "Обновление строений. Получаем строения из файла ";
    private static final String RECORD_DELETED_INFO = "Удалена запись строения [%s]";
    private static final String FILL_FULL_ADDRESS_INFO = "Заполнение поля fullAdrress таблицы addresses";
    private static final String HOUSES_REPLICATION_INFO = "Репликация строений. Получаем строения из файла %s";
    private static final String RECORD_ADDED_INFO = "Добавлена запись [%s]";
    private static final String DELETE_ADDRESSES_INFO = "Удаление адресов. Получаем адреса из файла %s";
    private static final String DELETE_HOUSES_INFO = "Удаление строений. Получаем адреса из файла %s";
    private static final String REPLICATION_ADDRESSES_INFO = "Репликация адресов. Получаем адреса из файла %s";

    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static final int LEVEL_35 = 35;
    private static final int LEVEL_4 = 4;
    private static final int LEVEL_5 = 5;
    private static final int LEVEL_6 = 6;
    private static final int LEVEL_65 = 65;
    private static final int LEVEL_7 = 7;
    private static final int LEVEL_75 = 75;
    private static final int LEVEL_90 = 90;
    private static final int OPERSTATUS_1 = 1;
    private static final int OPERSTATUS_10 = 10;
    private static final int OPERSTATUS_43 = 43;
    private static final int OPERSTATUS_61 = 61;
    private static final int OPERSTATUS_70 = 70;
    private static final int OPERSTATUS_20 = 20;
    private static final int OPERSTATUS_21 = 21;
    private static final int OPERSTATUS_40 = 40;
    private static final int OPERSTATUS_41 = 41;
    private static final int OPERSTATUS_50 = 50;
    private static final int OPERSTATUS_51 = 51;
    private static final int OPERSTATUS_30 = 30;
    private static final int OPERSTATUS_31 = 31;
    private static final int OPERSTATUS_42 = 42;
    private static final int OPERSTATUS_60 = 60;
    private static final int ESTSTATUS_4 = 4;
    private static final int CURRSTATUS_0 = 0;
    private static final int CURRSTATUS_51 = 51;
    private static final int HOUSETYPE_1 = 1;
    private static final int HOUSETYPE_2 = 2;
    private static final int HOUSETYPE_3 = 3;

    static {
        ADDRESS_ADD_OPERSTATUS_VALUES.add(OPERSTATUS_1);
        ADDRESS_ADD_OPERSTATUS_VALUES.add(OPERSTATUS_10);
        ADDRESS_ADD_OPERSTATUS_VALUES.add(OPERSTATUS_43);
        ADDRESS_ADD_OPERSTATUS_VALUES.add(OPERSTATUS_61);
        ADDRESS_ADD_OPERSTATUS_VALUES.add(OPERSTATUS_70);

        ADDRESS_CHANGE_OPERSTATUS_VALUES.add(OPERSTATUS_20);
        ADDRESS_CHANGE_OPERSTATUS_VALUES.add(OPERSTATUS_21);
        ADDRESS_CHANGE_OPERSTATUS_VALUES.add(OPERSTATUS_40);
        ADDRESS_CHANGE_OPERSTATUS_VALUES.add(OPERSTATUS_41);
        ADDRESS_CHANGE_OPERSTATUS_VALUES.add(OPERSTATUS_50);
        ADDRESS_CHANGE_OPERSTATUS_VALUES.add(OPERSTATUS_51);

        ADDRESS_DELETE_OPERSTATUS_VALUES.add(OPERSTATUS_30);
        ADDRESS_DELETE_OPERSTATUS_VALUES.add(OPERSTATUS_31);
        ADDRESS_DELETE_OPERSTATUS_VALUES.add(OPERSTATUS_42);
        ADDRESS_DELETE_OPERSTATUS_VALUES.add(OPERSTATUS_60);

        ADDRESS_LEVEL_MAP.put(LEVEL_1, AddressLevel.REGION);
        ADDRESS_LEVEL_MAP.put(LEVEL_2, AddressLevel.REGION);
        ADDRESS_LEVEL_MAP.put(LEVEL_3, AddressLevel.AREA);
        ADDRESS_LEVEL_MAP.put(LEVEL_35, AddressLevel.LOCALITY);
        ADDRESS_LEVEL_MAP.put(LEVEL_4, AddressLevel.CITY);
        ADDRESS_LEVEL_MAP.put(LEVEL_5, AddressLevel.LOCALITY);
        ADDRESS_LEVEL_MAP.put(LEVEL_6, AddressLevel.LOCALITY);
        ADDRESS_LEVEL_MAP.put(LEVEL_65, AddressLevel.STREET);
        ADDRESS_LEVEL_MAP.put(LEVEL_7, AddressLevel.STREET);
        ADDRESS_LEVEL_MAP.put(LEVEL_75, AddressLevel.STREET);
        ADDRESS_LEVEL_MAP.put(LEVEL_90, AddressLevel.LOCALITY);
    }

    private AddressService addressService;
    private SettingsService settingsService;
    private HouseService houseService;
    private ReplicatorHelper replicatorHelper;

    /**
     * Конструктор
     *
     * @param addressService  сервис для работы с записями адресов
     * @param houseService    сервис для работы с записями о сроениях
     * @param settingsService сервис для работы с записями настроек
     */
    @Autowired
    public AddressReplicatorDBF(AddressService addressService, HouseService houseService,
                                SettingsService settingsService, ReplicatorHelper replicatorHelper) {
        this.addressService = addressService;
        this.settingsService = settingsService;
        this.houseService = houseService;
        this.replicatorHelper = replicatorHelper;
    }

    /**
     * Выполнить репликацию справочников адресов
     *
     * @throws ReplicatorException в случае ошибки репликации
     */
    public void replicateAddresses() throws ReplicatorException {
        long countAddresses = houseService.count();
        try (Stream<Path> paths = Files.walk(Paths.get(getDictionaryDirPath()))) {
            paths
                    .filter(AddressReplicatorDBF::isAddObjFile)
                    .sorted(Comparator.naturalOrder())
                    .forEach(this::replicateAddressesInner);
        } catch (NoSuchFileException nsfe) {
            LOG.error(ERROR_DIR_READ_MESSAGE, nsfe);
        } catch (IOException e) {
            LOG.error(e);
        } finally {
            LOG.info(String.format("Процесс репликации адресов завершён. Было загружено: %s шт.",
                    addressService.count() - countAddresses));
        }

        fillFullAddresses();
    }

    /**
     * Выполнить репликацию справочников строений
     *
     * @throws ReplicatorException в случае ошибки репликации
     */
    public void replicateHouses() throws ReplicatorException {
        long countHouses = houseService.count();
        try (Stream<Path> paths = Files.walk(Paths.get(getDictionaryDirPath()))) {
            paths
                    .filter(AddressReplicatorDBF::isHouseObjFile)
                    .sorted(Comparator.naturalOrder())
                    .forEach(this::replicateHousesInner);
        } catch (NoSuchFileException nsfe) {
            LOG.error(ERROR_DIR_READ_MESSAGE, nsfe);
        } catch (IOException e) {
            LOG.error(e);
        } finally {
            LOG.info(String.format("Процесс репликации домов завершён. Было загружено: %s шт.",
                    houseService.count() - countHouses));
        }
    }

    /**
     * Выполнить обновление справочников адресов и строений
     *
     * @throws ReplicatorException в случае ошибки репликации
     */
    public void update() throws ReplicatorException {
        SettingEntity dictDirPathSetting = settingsService.get(AddressReplicatorConstants.ADDRESS_DELTA_DIR_PATH);
        if (dictDirPathSetting == null) {
            LOG.error(DICT_DIR_EMPTY_ERROR);
            throw new ReplicatorException(DICT_DIR_EMPTY_ERROR);
        }

        //обновляем адреса
        try (Stream<Path> paths = Files.walk(Paths.get(dictDirPathSetting.getValue()))) {
            paths
                    .filter(AddressReplicatorDBF::isAddObjFile)
                    .sorted(Comparator.naturalOrder())
                    .forEach(this::updateAddresses);
        } catch (NoSuchFileException nsfe) {
            LOG.error(ERROR_DIR_READ_MESSAGE, nsfe);
        } catch (IOException e) {
            LOG.error(e);
        }

        //обновляем строения
        try (Stream<Path> paths = Files.walk(Paths.get(dictDirPathSetting.getValue()))) {
            paths
                    .filter(AddressReplicatorDBF::isHouseObjFile)
                    .sorted(Comparator.naturalOrder())
                    .forEach(this::updateHouses);
        } catch (NoSuchFileException nsfe) {
            LOG.error(ERROR_DIR_READ_MESSAGE, nsfe);
        } catch (IOException e) {
            LOG.error(e);
        }

        //удаляем адреса
        try (Stream<Path> paths = Files.walk(Paths.get(dictDirPathSetting.getValue()))) {
            paths
                    .filter(AddressReplicatorDBF::isDAddObjFile)
                    .sorted(Comparator.naturalOrder())
                    .forEach(this::removeAddresses);
        } catch (NoSuchFileException nsfe) {
            LOG.error(ERROR_DIR_READ_MESSAGE, nsfe);
        } catch (IOException e) {
            LOG.error(e);
        }

        //удаляем строения
        try (Stream<Path> paths = Files.walk(Paths.get(dictDirPathSetting.getValue()))) {
            paths
                    .filter(AddressReplicatorDBF::isDHouseObjFile)
                    .sorted(Comparator.naturalOrder())
                    .forEach(this::removeHouses);
        } catch (NoSuchFileException nsfe) {
            LOG.error(ERROR_DIR_READ_MESSAGE, nsfe);
        } catch (IOException e) {
            LOG.error(e);
        }
    }

    private String getDictionaryDirPath() throws ReplicatorException {
        SettingEntity dictDirPathSetting = settingsService.get(AddressReplicatorConstants.ADDRESS_DICT_DIR_PATH);
        if (dictDirPathSetting == null) {
            LOG.error(DICT_DIR_EMPTY_ERROR);
            throw new ReplicatorException(DICT_DIR_EMPTY_ERROR);
        }
        return dictDirPathSetting.getValue();
    }

    private void removeAddresses(Path path) {
        try {
            LOG.info(String.format(DELETE_ADDRESSES_INFO, path.getFileName()));
            DBFReader reader = DBFUtils.getReader(path.toFile());
            Map<String, Integer> fieldsIndexes = fillFieldNamesMap(reader);
            int recordCount = reader.getRecordCount();
            LOG.info(String.format(RECORDS_COUNT, recordCount));
            List<String> aoids = new ArrayList<>(PACK_SIZE);
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();
                aoids.add(toString(toString(record[fieldsIndexes.get(AOID)])));
            }
            if (!aoids.isEmpty()) {
                addressService.deleteByAoids(aoids);
            }
        } catch (DBFUtilsException | DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_TEMPLATE, path.toFile().getName()), e);
        }
    }

    private void removeHouses(Path path) {
        try {
            LOG.info(String.format(DELETE_HOUSES_INFO, path.getFileName()));
            DBFReader reader = DBFUtils.getReader(path.toFile());
            Map<String, Integer> fieldsIndexes = fillFieldNamesMap(reader);
            int recordCount = reader.getRecordCount();
            LOG.info(String.format(RECORDS_COUNT, recordCount));
            List<String> houseids = new ArrayList<>(PACK_SIZE);
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();
                houseids.add(toString(toString(record[fieldsIndexes.get(HOUSEID)])));
            }
            if (!houseids.isEmpty()) {
                houseService.deleteByHouseid(houseids);
            }
        } catch (DBFUtilsException | DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_TEMPLATE, path.toFile().getName()), e);
        }
    }

    private void replicateAddressesInner(Path path) {
        try {
            LOG.info(String.format(REPLICATION_ADDRESSES_INFO, path.getFileName()));
            DBFReader reader = DBFUtils.getReader(path.toFile());
            Map<String, Integer> fieldsIndexes = fillFieldNamesMap(reader);
            int recordCount = reader.getRecordCount();
            LOG.info(String.format(RECORDS_COUNT, recordCount));
            List<AddressEntity> addresses = new ArrayList<>(PACK_SIZE);
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();

                //исключаем неактуальные записи
                if (!isActualAddressRecord(record, fieldsIndexes)) {
                    continue;
                }

                AddressLevel addressLevel = ADDRESS_LEVEL_MAP.get(doubleToInt(record[fieldsIndexes.get(AOLEVEL)]));
                if (addressLevel == null) {
                    addressLevel = AddressLevel.UNKNOWN;
                    LOG.error(String.format(UNKNOWN_ADDRESS_LEVEL, record[fieldsIndexes.get(AOLEVEL)]));
                }

                AddressEntity address = toAddressEntity(addressLevel, record, fieldsIndexes);
                addresses.add(address);
                LOG.trace(String.format(RECORD_ADDED_INFO, address));
                if (addresses.size() == PACK_SIZE) {
                    replicatorHelper.saveAddresses(addresses, path.getFileName().toString());
                    addresses = new ArrayList<>(PACK_SIZE);
                }
            }
            if (!addresses.isEmpty()) {
                replicatorHelper.saveAddresses(addresses, path.getFileName().toString());
            }
        } catch (DBFUtilsException | DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_TEMPLATE, path.toFile().getName()), e);
        }
    }

    private void replicateHousesInner(Path path) {
        try {
            LOG.info(String.format(HOUSES_REPLICATION_INFO, path.getFileName()));
            DBFReader reader = DBFUtils.getReader(path.toFile());
            Map<String, Integer> fieldsIndexes = fillFieldNamesMap(reader);
            int recordCount = reader.getRecordCount();
            LOG.info(String.format(RECORDS_COUNT, recordCount));
            List<HouseEntity> houses = new ArrayList<>(PACK_SIZE);
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();
                //исключаем неактуальные записи и гаражи
                if (!isActualRecord(toDate(record[fieldsIndexes.get(ENDDATE)])) || doubleToInt(record[fieldsIndexes.get(ESTSTATUS)]) == ESTSTATUS_4) {
                    continue;
                }

                HouseEntity house = toHouse(record, fieldsIndexes);
                houses.add(house);
                LOG.trace(String.format(RECORD_ADDED_INFO, house));
                if (houses.size() == PACK_SIZE) {
                    replicatorHelper.saveHouses(houses, path.getFileName().toString());
                    houses = new ArrayList<>(PACK_SIZE);
                }
            }
            if (!houses.isEmpty()) {
                replicatorHelper.saveHouses(houses, path.getFileName().toString());
            }
        } catch (DBFUtilsException | DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_TEMPLATE, path.toFile().getName()), e);
        }
    }

    private void updateAddresses(Path path) {
        try {
            Path fileName = path.getFileName();
            LOG.info(UPDATE_ADDRESSES_INFO + fileName);
            DBFReader reader = DBFUtils.getReader(path.toFile());
            Map<String, Integer> fieldsIndexes = fillFieldNamesMap(reader);
            int recordCount = reader.getRecordCount();
            LOG.info(String.format(RECORDS_COUNT, recordCount));
            List<AddressEntity> addedAddresses = new ArrayList<>();
            List<AddressEntity> changedAddresses = new ArrayList<>();
            List<AddressEntity> deletedAddresses = new ArrayList<>();
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();
                if (doubleToInt(record[fieldsIndexes.get(ACTSTATUS)]) != 1) {
                    continue;
                }

                int operStatus = doubleToInt(record[fieldsIndexes.get(OPERSTATUS)]);
                AddressEntity address = toAddressEntity(null, record, fieldsIndexes);
                if (ADDRESS_ADD_OPERSTATUS_VALUES.contains(operStatus)) {
                    processAddAddress(address, addedAddresses, changedAddresses);
                } else if (ADDRESS_CHANGE_OPERSTATUS_VALUES.contains(operStatus)) {
                    processChangeAddress(address, changedAddresses, fileName, operStatus);
                } else if (ADDRESS_DELETE_OPERSTATUS_VALUES.contains(operStatus)) {
                    processDeleteAddress(address, deletedAddresses, fileName, record, fieldsIndexes, operStatus);
                } else {
                    LOG.error(String.format(UNKNOWN_OPERSTATUS_ERROR, operStatus, toAddressEntity(null, record, fieldsIndexes)));
                }
            }
            if (!addedAddresses.isEmpty()) {
                addressService.saveAll(addedAddresses);
            }
            if (!changedAddresses.isEmpty()) {
                addressService.saveAll(changedAddresses);
            }
            if (!deletedAddresses.isEmpty()) {
                addressService.delete(deletedAddresses);
            }

            fillFullAddresses();
        } catch (DBFUtilsException | DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_TEMPLATE, path.toFile().getName()), e);
        }
    }

    private void processAddAddress(AddressEntity address, List<AddressEntity> addedAddresses, List<AddressEntity> changedAddresses) {
        AddressEntity savedAddress = addressService.findByAoid(address.getAoid());
        if (savedAddress == null) {
            addedAddresses.add(address);
            LOG.trace(String.format(ADD_ADDRESS_MESSAGE, address));
        } else {
            address.setId(savedAddress.getId());
            address.setFulladdress(null);
            changedAddresses.add(address);
            LOG.trace(String.format(CHANGE_ADDRESS_MESSAGE, address));
        }
    }

    private void processChangeAddress(AddressEntity address, List<AddressEntity> changedAddresses, Path fileName, int operStatus) {
        AddressEntity savedAddress = addressService.findByAoguid(address.getAoguid());
        if (savedAddress != null) {
            address.setId(savedAddress.getId());
            changedAddresses.add(address);
            LOG.trace(String.format(CHANGE_ADDRESS_MESSAGE, address));
        } else {
            LOG.warn(String.format(UPDATE_ADDRESSES_CHANGE_ERROR, fileName, operStatus, address));
        }
    }

    private void processDeleteAddress(AddressEntity address, List<AddressEntity> deletedAddresses,
                                      Path fileName, Object[] record, Map<String, Integer> fieldsIndexes, int operStatus) {
        AddressEntity savedAddress = addressService.findByAoid(address.getAoid());
        if (savedAddress != null) {
            address.setId(savedAddress.getId());
            deletedAddresses.add(address);
            LOG.trace(String.format(DELETE_ADDRESS_MESSAGE, address));
        } else if (doubleToInt(record[fieldsIndexes.get(LIVESTATUS)]) != 0) {
            LOG.error(String.format(UPDATE_ADDRESSES_DELETE_ERROR, fileName, operStatus, address));
        }
    }

    private void updateHouses(Path path) {
        try {
            LOG.info(UPDATE_HOUSES_INFO + path.getFileName());
            DBFReader reader = DBFUtils.getReader(path.toFile());
            Map<String, Integer> fieldsIndexes = fillFieldNamesMap(reader);
            int recordCount = reader.getRecordCount();
            LOG.info(String.format(RECORDS_COUNT, recordCount));
            List<HouseEntity> addedHouses = new ArrayList<>();
            List<HouseEntity> changedHouses = new ArrayList<>();
            List<String> deletedHousesByHouseid = new ArrayList<>();
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();
                HouseEntity houseEntity = toHouse(record, fieldsIndexes);
                if (!isActualRecord(toDate(record[fieldsIndexes.get(ENDDATE)]))) {
                    deletedHousesByHouseid.add(houseEntity.getHouseid());
                    LOG.trace(String.format(RECORD_DELETED_INFO, houseEntity));
                    continue;
                }

                HouseEntity savedHouse = houseService.findByHouseid(houseEntity.getHouseid());
                if (savedHouse == null) {
                    addedHouses.add(houseEntity);
                    LOG.trace(String.format(UPDATE_HOUSES_ADD_MESSAGE, houseEntity));
                } else {
                    houseEntity.setId(savedHouse.getId());
                    changedHouses.add(houseEntity);
                    LOG.trace(String.format(UPDATE_HOUSES_CHANGE_MESSAGE, houseEntity));
                }

            }
            if (!addedHouses.isEmpty()) {
                houseService.saveAll(addedHouses);
            }
            if (!changedHouses.isEmpty()) {
                houseService.saveAll(changedHouses);
            }
            if (!deletedHousesByHouseid.isEmpty()) {
                houseService.deleteByHouseid(deletedHousesByHouseid);
            }
        } catch (DBFUtilsException | DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_TEMPLATE, path.toFile().getName()), e);
        }
    }

    private void fillFullAddresses() {
        LOG.info(FILL_FULL_ADDRESS_INFO);
        long lastId = 0;
        do {
            List<AddressEntity> emptyFulladdresses = addressService.getEmptyFulladdresses(FILL_FULL_ADDRESSES_PACK_SIZE, lastId);
            if (emptyFulladdresses.isEmpty()) {
                break;
            }

            List<Long> ids = emptyFulladdresses.stream().map(AddressEntity::getId).collect(Collectors.toList());
            addressService.fillFullAddresses(ids);
            lastId = ids.get(ids.size() - 1);
            LOG.info(String.format(RECORDS_FILL, ids.get(0), lastId));
        } while (true);
    }

    private static boolean isAddObjFile(Path path) {
        return path.toFile().getName().startsWith(ADDROB_FILE_PREFIX);
    }

    private static boolean isDAddObjFile(Path path) {
        return path.toFile().getName().startsWith(DADDROB_FILE_PREFIX);
    }

    private static boolean isHouseObjFile(Path path) {
        return path.toFile().getName().startsWith(HOUSE_FILE_PREFIX);
    }

    private static boolean isDHouseObjFile(Path path) {
        return path.toFile().getName().startsWith(DHOUSE_FILE_PREFIX);
    }

    private static boolean isActualAddressRecord(Object[] record, Map<String, Integer> fieldsIndexes) {
        int currState = doubleToInt(record[fieldsIndexes.get(CURRSTATUS)]);
        if (currState != CURRSTATUS_0 && currState != CURRSTATUS_51) {
            return false;
        }

        return doubleToInt(record[fieldsIndexes.get(ACTSTATUS)]) == 1
                && (doubleToInt(record[fieldsIndexes.get(LIVESTATUS)])) == 1
                && isActualRecord(toDate(record[fieldsIndexes.get(ENDDATE)]));
    }

    private static boolean isActualRecord(Date date) {
        return new Date().before(date);
    }

    private static HouseEntity toHouse(Object[] record, Map<String, Integer> fieldsIndexes) {
        HouseEntity house = new HouseEntity();
        house.setPostalcode(toString(record[fieldsIndexes.get(POSTALCODE)]));
        house.setHousenum(toString(record[fieldsIndexes.get(HOUSENUM)]));
        house.setBuildnum(toString(record[fieldsIndexes.get(BUILDNUM)]));
        house.setStrucnum(toString(record[fieldsIndexes.get(STRUCNUM)]));
        house.setHouseid(toString(record[fieldsIndexes.get(HOUSEID)]));
        house.setHouseguid(toString(record[fieldsIndexes.get(HOUSEGUID)]));
        house.setHouseType(toHouseType(doubleToInt(record[fieldsIndexes.get(STRSTATUS)])));
        house.setAoguid(toString(record[fieldsIndexes.get(AOGUID)]));
        return house;
    }

    private static AddressEntity toAddressEntity(AddressLevel addressLevel, Object[] record, Map<String, Integer> fieldsIndexes) {
        AddressEntity address = new AddressEntity();
        address.setLevel(addressLevel);
        address.setOriginalLevel(doubleToInt(record[fieldsIndexes.get(AOLEVEL)]));
        address.setAoguid(toString(record[fieldsIndexes.get(AOGUID)]));
        address.setOffname(toString(record[fieldsIndexes.get(OFFNAME)]));
        address.setPostalcode(toString(record[fieldsIndexes.get(POSTALCODE)]));
        address.setShortname(toString(record[fieldsIndexes.get(SHORTNAME)]));
        address.setParentguid(toString(record[fieldsIndexes.get(PARENTGUID)]));
        address.setAoid(toString(record[fieldsIndexes.get(AOID)]));
        address.setOkato(toString(record[fieldsIndexes.get(OKATO)]));
        return address;
    }

    private static String toString(Object rec) {
        return ((String) rec).trim();
    }

    private static Date toDate(Object rec) {
        return (Date) rec;
    }

    private static int doubleToInt(Object rec) {
        return ((Double) rec).intValue();
    }

    private static Map<String, Integer> fillFieldNamesMap(DBFReader reader) throws DBFException {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < reader.getFieldCount(); i++) {
            result.put(reader.getField(i).getName(), i);
        }
        return result;
    }

    private static HouseType toHouseType(int type) {
        switch (type) {
            case HOUSETYPE_1:
                return HouseType.BUILDING;
            case HOUSETYPE_2:
                return HouseType.CONSTRUCTION;
            case HOUSETYPE_3:
                return HouseType.LETTER;
            default:
                return HouseType.UNKNOWN;
        }
    }
}
