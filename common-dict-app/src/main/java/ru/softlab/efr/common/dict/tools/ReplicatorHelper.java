package ru.softlab.efr.common.dict.tools;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.model.AddressEntity;
import ru.softlab.efr.common.dict.model.HouseEntity;
import ru.softlab.efr.common.dict.services.AddressService;
import ru.softlab.efr.common.dict.services.HouseService;
import ru.softlab.efr.common.dict.tools.address.replicator.AddressReplicatorConstants;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Вспомогательный сервис обработки ошибок при сохранении адресов и домов
 *
 * @author olshansky
 * @since 18.04.2019
 */
@Service
public class ReplicatorHelper {


    private static final String DICT_FILENAMES_EMPTY_ERROR = String.format("Не указана настройка [%s]",
            AddressReplicatorConstants.NEED_STRICT_CHECK_FILES);
    private static final String ERROR_SAVE_HOUSES = "Произошли ошибки при сохранении домов: [%s]";
    private static final String ERROR_SAVE_ADDRESSES = "Произошли ошибки при сохранении адресов: [%s]";
    private static final String ERROR_SAVE_DUPLICATE_HOUSEID = "В исходном файле ФИАС дублируются дома с houseId = [%s]!";
    private static final String ERROR_SAVE_DUPLICATE_AOGUIDS = "В исходном файле ФИАС дублируются адреса с aoguid = [%s]!";

    private static final Log LOG = LogFactory.getLog(ReplicatorHelper.class);

    private AddressService addressService;
    private SettingsService settingsService;
    private HouseService houseService;

    @Autowired
    public ReplicatorHelper(AddressService addressService, SettingsService settingsService, HouseService houseService) {
        this.addressService = addressService;
        this.settingsService = settingsService;
        this.houseService = houseService;
    }

    public void saveAddresses(List<AddressEntity> addressEntities, String fileName) {
        saveObjects(addressEntities, fileName, this::getAddressesWithoutErrs,
                addressService::saveAll, addressService::save);
    }

    public void saveHouses(List<HouseEntity> houses, String fileName) {
        saveObjects(houses, fileName, this::getHousesWithoutErrs,
                houseService::saveAll, houseService::save);
    }

    private List<HouseEntity> getHousesWithoutErrs(List<HouseEntity> houses) {
        return getObjectsWithoutErrs(houses, HouseEntity::getHouseid, houseService::findAllByHouseid,
                ERROR_SAVE_DUPLICATE_HOUSEID, ERROR_SAVE_HOUSES);
    }

    private List<AddressEntity> getAddressesWithoutErrs(List<AddressEntity> addresses) {
        return getObjectsWithoutErrs(addresses, AddressEntity::getAoguid, addressService::findByAoguids,
                ERROR_SAVE_DUPLICATE_AOGUIDS, ERROR_SAVE_ADDRESSES);
    }

    private <T> void saveObjects(List<T> objects, String fileName, Function<List<T>, List<T>> filter,
                                 Function<List<T>, Void> saveAll, Function<T, Void> saveOne) {
        if (objects.isEmpty()) {
            return;
        }

        if (needStrictCheck(fileName)) {
            objects = filter.apply(objects);
        }
        try {
            saveAll.apply(objects);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            objects.forEach(entity -> save(entity, saveOne));
        }
    }

    private <T> void save(T entity, Function<T, Void> saveOne) {
        try {
            saveOne.apply(entity);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }

    private <T> List<String> getErrorList(List<T> objects, TreeSet<T> existsObjects, String errorMessage,
                                          String objectIds) {
        List<String> result = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(existsObjects) && objects.stream().anyMatch(existsObjects::contains)) {
            result.add(String.format(errorMessage, objectIds));
        }
        return result;
    }

    private <T> String getObjectFieldListByFilter(List<T> houses, Function<T, String> mapper, Predicate<T> filter) {
        return houses.stream()
                .filter(filter)
                .map(mapper)
                .collect(Collectors.joining(", "));
    }

    private <T> TreeSet<T> getExistsInDBByField(List<T> houseEntities, Function<T, String> mapper,
                                                Function<List<String>, List<T>> findAllByField) {
        List<String> houseIds;

        if (CollectionUtils.isNotEmpty(houseEntities)) {
            houseIds = houseEntities.stream().map(mapper).collect(Collectors.toList());
            return new TreeSet<>(findAllByField.apply(houseIds));
        }

        return null;
    }

    private boolean needStrictCheck(String fileName) {
        SettingEntity needStrictCheckFilesSetting =
                settingsService.get(AddressReplicatorConstants.NEED_STRICT_CHECK_FILES);
        if (needStrictCheckFilesSetting == null || StringUtils.isBlank(needStrictCheckFilesSetting.getValue())) {
            LOG.error(DICT_FILENAMES_EMPTY_ERROR);
            return false;
        }

        List<String> NEED_CHECK_FILE_NAMES = Arrays.stream(
                needStrictCheckFilesSetting.getValue().replaceAll("\\s", "").split("[,;]"))
                .filter(StringUtils::isNotBlank).collect(Collectors.toList());
        return NEED_CHECK_FILE_NAMES.contains(fileName);
    }

    private <T> List<T> getObjectsWithoutErrs(List<T> inputObjects, Function<T, String> mapper,
                                              Function<List<String>, List<T>> findAllByFieldFoo,
                                              String errorMessageContainer, String errorSaveMessage) {
        TreeSet<T> existsObjects = getExistsInDBByField(inputObjects, mapper, findAllByFieldFoo);

        if (CollectionUtils.isNotEmpty(existsObjects)) {
            List<String> errorList = getErrorList(inputObjects, existsObjects, errorSaveMessage,
                    getObjectFieldListByFilter(inputObjects, mapper, existsObjects::contains));
            LOG.error(String.format(errorMessageContainer, String.join("; ", errorList)));
            return inputObjects.stream()
                    .filter(houseEntity -> !existsObjects.contains(houseEntity))
                    .collect(Collectors.toList());
        } else {
            return inputObjects;
        }
    }
}
