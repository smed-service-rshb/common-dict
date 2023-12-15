package ru.softlab.efr.common.dict.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import ru.softlab.efr.common.dict.exchange.model.Address;
import ru.softlab.efr.common.dict.exchange.model.House;
import ru.softlab.efr.common.dict.exchange.model.RegionRs;
import ru.softlab.efr.common.dict.model.AddressEntity;
import ru.softlab.efr.common.dict.model.HouseEntity;
import ru.softlab.efr.common.dict.services.AddressService;
import ru.softlab.efr.common.dict.services.HouseService;
import ru.softlab.efr.common.dict.tools.ReplicatorException;
import ru.softlab.efr.common.dict.tools.address.replicator.AddressReplicatorDBF;
import ru.softlab.efr.common.permissions.AddressesPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * Контроллер адресов
 *
 * @author gladishev
 * @since 16.10.2017
 */
@RestController
@RequestMapping("/dictionaries/addresses")
@PropertySource("classpath:dict-update.properties")
public class AddressesController implements AddressesApi {

    private static final Log LOG = LogFactory.getLog(AddressesController.class);
    private static final int SEARCH_WORDS_MIN_LENGTH = 3;

    private final AddressService addressService;

    private final HouseService houseService;

    private final AddressReplicatorDBF addressReplicatorDBF;

    /**
     * Конструктор
     *
     * @param addressService       сервис адресов
     * @param houseService         сервис строений
     * @param addressReplicatorDBF репликатор адресов и строений
     */
    @Autowired
    public AddressesController(AddressService addressService, HouseService houseService, AddressReplicatorDBF addressReplicatorDBF) {
        this.addressService = addressService;
        this.houseService = houseService;
        this.addressReplicatorDBF = addressReplicatorDBF;
    }

    /**
     * Проверка контроллера
     *
     * @return результат проверки
     */
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public ResponseEntity<Void> ping() {
        return ResponseEntity.noContent().build();
    }

    /**
     * Поиск адресов.
     *
     * @param words    - слова для поиска. Не менее 3х символов
     * @param parentId - слова для поиска
     * @return список найденных совпадений
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Address>> listAddresses(
            @RequestParam(value = "words", required = true) String words,
            @RequestParam(value = "parentId", required = false) Long parentId) {
        String searchWords = words.trim();
        if (searchWords.length() < SEARCH_WORDS_MIN_LENGTH) {
            return ResponseEntity.badRequest().build();
        }

        if (parentId != null) {
            AddressEntity parent = addressService.get(parentId);
            if (parent == null) {
                return ResponseEntity.badRequest().build();
            }
        }

        List<AddressEntity> result = addressService.search(words, parentId);

        if (CollectionUtils.isEmpty(result)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result.stream().map(AddressEntity::toAddress).collect(Collectors.toList()));
    }

    /**
     * Возвращает список родительских адресов
     *
     * @param id - идентификатор адреса
     * @return список родительских адресов
     */
    @RequestMapping(path = "/{id}/parents", method = RequestMethod.GET)
    public ResponseEntity<List<Address>> getParents(@PathVariable(value = "id") Long id) {
        AddressEntity address = addressService.get(id);
        if (address == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(addressService.getAddressTree(address.getAoguid()));
    }

    @Override
    @RequestMapping(path = "/region/list", method = RequestMethod.GET)
    public ResponseEntity<RegionRs> getRegionList() throws Exception {
        List<AddressEntity> result = addressService.getRegionList();
        return ResponseEntity.ok(new RegionRs(result.stream()
                .map(AddressEntity::toRegion).collect(Collectors.toList())));
    }

    /**
     * Получение адреса по идентификатору
     *
     * @param id - идентификатор адреса
     * @return - адрес
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Address> getAddress(@PathVariable("id") Long id) {
        AddressEntity address;
        try {
            address = addressService.findById(id);
        } catch (EntityNotFoundException e) {
            LOG.error(e.getMessage(), e);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(AddressEntity.toAddress(address));
    }

    /**
     * Получение списка домов для адреса
     *
     * @param addressId - идентификатор адреса
     * @return - список домов
     */
    @RequestMapping(value = "/{id}/houses", method = RequestMethod.GET)
    public ResponseEntity<List<House>> listHouses(@PathVariable("id") Long addressId,
                                                  @RequestParam("house") String house) {
        AddressEntity address;
        try {
            address = addressService.findById(addressId);
        } catch (EntityNotFoundException e) {
            LOG.error(e.getMessage(), e);
            return ResponseEntity.badRequest().build();
        }

        List<HouseEntity> result = houseService.findByAoguidAndHousenum(address.getAoguid(), house);
        if (CollectionUtils.isEmpty(result)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result.stream().map(HouseEntity::toHouse).collect(Collectors.toList()));
    }

    /**
     * Запуск механизма репликации справочников адресов и строений
     *
     * @return статус операции
     */
    @RequestMapping(value = "/replication", method = RequestMethod.POST)
    public ResponseEntity<Void> replicationAddresses() {
        try {
            addressReplicatorDBF.replicateAddresses();
            addressReplicatorDBF.replicateHouses();
            return ResponseEntity.noContent().build();
        } catch (ReplicatorException e) {
            LOG.error(e.getMessage(), e);
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * Запуск механизма обновления записей справочников адресов и строений
     *
     * @return статус операции
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<Void> updateAddresses() {
        if (addressService.count() == 0 || houseService.count() == 0) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        try {
            addressReplicatorDBF.update();
            return ResponseEntity.noContent().build();
        } catch (ReplicatorException e) {
            LOG.error(e.getMessage(), e);
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).build();
        }
    }
}
