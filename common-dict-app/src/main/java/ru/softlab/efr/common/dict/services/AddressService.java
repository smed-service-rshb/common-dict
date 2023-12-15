package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import ru.softlab.efr.common.dict.exchange.model.Address;
import ru.softlab.efr.common.dict.exchange.model.AddressLevel;
import ru.softlab.efr.common.dict.model.AddressEntity;
import ru.softlab.efr.common.dict.repositories.AddressRepository;

import javax.annotation.Resource;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис для работы с записями адресов
 *
 * @author gladishev
 * @since 17.10.2017
 */
@Service
@Transactional(readOnly = true)
public class AddressService {

    private static final String GET_ADDRESS_TREE = "common_dict.get_address_tree";
    private static final String WORDS_STR = "wordsStr";
    private static final String PARENT_ID = "parentId";
    private static final String SEARCH_QUERY_PREFIX = "select addr.id, addr.aoguid, addr.offname, addr.postalcode, " +
            "addr.shortname, addr.level, addr.orig_level, addr.parentguid, addr.aoid, addr.okato, common_dict.get_full_address(addr.aoguid, true) as fulladdress " +
            "from common_dict.addresses addr where addr.fulladdress ilike :wordsStr ";
    private static final String SEARCH_QUERY_PARENT_ID = " and :parentId in (select address_id from common_dict.get_address_tree(addr.aoguid)) ";
    private static final String SEARCH_QUERY_ORDER_LIMIT = " order by addr.level limit 10";
    private static final String PERCENTAGES = "%";

    @PersistenceContext
    private EntityManager manager;

    @Resource
    private AddressRepository addressRepository;

    /**
     * Поиск адреса по id
     *
     * @param id - id адреса
     * @return адрес
     */
    public AddressEntity findById(long id) {
        AddressEntity addressEntity = addressRepository.findOne(id);
        if (addressEntity == null) {
            throw new EntityNotFoundException();
        }
        return addressEntity;
    }

    /**
     * Возвращает полную ветку адресного дерева для адреса с указанным guid
     *
     * @param guid - guid адреса, для которого строим ветку
     * @return список родительских записей для адреса
     */
    public List<Address> getAddressTree(String guid) {
        StoredProcedureQuery storedProcedureQuery = manager.createStoredProcedureQuery(GET_ADDRESS_TREE)
                .registerStoredProcedureParameter(0, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(0, guid);
        List<Object[]> resultList = storedProcedureQuery.getResultList();
        return resultList.stream().map(AddressService::toAddress).collect(Collectors.toList());
    }

    /**
     * Поиск адреса по id
     *
     * @param id - идентификатор адреса
     * @return адрес
     */
    public AddressEntity get(Long id) {
        return addressRepository.findOne(id);
    }

    /**
     * Поиск адресов
     *
     * @param wordsStr - строка поиска
     * @param parentId - id родительской записи
     * @return список найденных адресов
     */
    public List<AddressEntity> search(String wordsStr, Long parentId) {
        String procWords = wordsStr.trim().toLowerCase().replaceAll("\\s+", PERCENTAGES);
        Query query = manager.createNativeQuery(buildSearchQuery(parentId), AddressEntity.class);
        query.setParameter(WORDS_STR, PERCENTAGES + procWords + PERCENTAGES);
        if (parentId != null)
            query.setParameter(PARENT_ID, parentId);

        return query.getResultList();
    }

    /**
     * Поиск всех элементов адреса соответствующих уровню региона
     * @return список регионов
     */
    public List<AddressEntity> getRegionList() {
        return addressRepository.findAllRegion();
    }

    /**
     * Создать запись адреса в БД
     *
     * @param entity - адрес
     * @return сохраненный адрес
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public AddressEntity create(AddressEntity entity) {
        if (entity.getId() != null && addressRepository.findOne(entity.getId()) != null) {
            throw new EntityExistsException();
        }
        return addressRepository.save(entity);
    }

    /**
     * Возвращает общее кол-во записей адресов в БД
     *
     * @return кол-во адресов в БД
     */
    public long count() {
        return addressRepository.count();
    }

    /**
     * Заполнение поля fulladdress
     *
     * @param ids - идентификаторы записей
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void fillFullAddresses(List<Long> ids) {
        addressRepository.fillFulladdresses(ids);
    }

    /**
     * Сохранение адреса
     *
     * @param address - адрес
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Void save(AddressEntity address) {
        addressRepository.save(address);
        return null;
    }

    public AddressEntity findByAoid(String aoid) {
        return addressRepository.findByAoid(aoid);
    }

    /**
     * Удаление списка адресов
     *
     * @param deletedAddresses - список адресов
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void delete(List<AddressEntity> deletedAddresses) {
        addressRepository.delete(deletedAddresses);
    }

    /**
     * Поиск адреса по guid
     *
     * @param aoguid - guid адреса
     * @return адрес
     */
    public AddressEntity findByAoguid(String aoguid) {
        return addressRepository.findByAoguid(aoguid);
    }

    /**
     * Поиск адресов по guids
     *
     * @param aoguids - Список guid адреса
     * @return адреса
     */
    public List<AddressEntity> findByAoguids(List<String> aoguids) {
        return addressRepository.findAllByAoguidIn(aoguids);
    }

    /**
     * Удаление адресов по aoids
     *
     * @param aoids - aoid адресов
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteByAoids(List<String> aoids) {
        addressRepository.deleteByAoids(aoids);
    }

    /**
     * Возвращает список адресов с незаполненным полем fulladdress
     *
     * @param pageSize - размер возвращаемого пакета записей
     * @param minId    - минимальный id (записи адресов с id меньше указанного minId игнорируются)
     * @return пакет из списка адресов
     */
    public List<AddressEntity> getEmptyFulladdresses(int pageSize, long minId) {
        return addressRepository.findByFulladdressIsNullAndIdGreaterThan(minId, new PageRequest(0, pageSize, Sort.Direction.ASC, "id"));
    }

    /**
     * Сохранение списка адресов
     * @param addresses - список адресов
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Void saveAll(List<AddressEntity> addresses) {
        addressRepository.save(addresses);
        return null;
    }

    private String buildSearchQuery(Long parentId) {
        StringBuilder builder = new StringBuilder(SEARCH_QUERY_PREFIX);
        if (!StringUtils.isEmpty(parentId))
            builder.append(SEARCH_QUERY_PARENT_ID);

        builder.append(SEARCH_QUERY_ORDER_LIMIT);
        return builder.toString();
    }

    private static Address toAddress(Object[] rec) {
        Address address = new Address();
        address.setId(((BigInteger) rec[0]).longValue());
        address.setOffname((String) rec[1]);
        address.setShortname((String) rec[2]);
        address.setLevel(parseAddressLevel((Integer) rec[3]));
        address.setFulladdress((String) rec[4]);
        address.setPostalcode((String) rec[5]);
        return address;
    }

    private static AddressLevel parseAddressLevel(int value) {
        for (AddressLevel item : AddressLevel.values()) {
            if (item.ordinal() == value)
                return item;
        }
        return null;
    }
}
