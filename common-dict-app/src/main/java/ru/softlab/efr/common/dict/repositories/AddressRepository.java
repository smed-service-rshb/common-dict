package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.softlab.efr.common.dict.model.AddressEntity;

import java.util.List;

/**
 * Репозиторий для работы с адресами
 *
 * @author gladishev
 * @since 17.10.2017
 */
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    /**
     * Найти адрес по уникальному идентификатору
     *
     * @param aoid уникальный идентификатор
     * @return хранимая сущность адреса
     */
    AddressEntity findByAoid(String aoid);

    /**
     * Найти адрес по официальному наименованию
     *
     * @param name официальное наименование
     * @return хранимая сущность адреса
     */
    List<AddressEntity> findByOffname(String name);

    /**
     * Найти адрес по глобальному идентификатору
     *
     * @param aoguid глобальный идентификатор
     * @return хранимая сущность адреса
     */
    AddressEntity findByAoguid(String aoguid);

    /**
     * Найти адрес по глобальному идентификатору
     *
     * @param aoguid глобальный идентификатор
     * @return хранимая сущность адреса
     */
    List<AddressEntity> findAllByAoguidIn(List<String> aoguid);

    /**
     * Удалить запись по уникальному идентификатору
     *
     * @param aoids уникальный идентификатор
     */
    @Modifying
    @Query("delete from AddressEntity a where a.aoid in :aoids")
    void deleteByAoids(@Param("aoids") List<String> aoids);

    /**
     * Обновить запись по идентификатору
     *
     * @param ids идентификатор
     */
    @Modifying
    @Query(nativeQuery = true,
            value = "update common_dict.addresses set fulladdress = common_dict.get_full_address(aoguid, false) where id in (:ids)")
    void fillFulladdresses(@Param("ids") List<Long> ids);

    /**
     * Возвращает список адресов с незаполненным полем fulladdress
     *
     * @param pageable - размер возвращаемого пакета записей
     * @param id       - минимальный id (записи адресов с id меньше указанного minId игнорируются)
     * @return пакет из списка адресов
     */
    List<AddressEntity> findByFulladdressIsNullAndIdGreaterThan(long id, Pageable pageable);

    @Query("from AddressEntity where originalLevel = 1")
    List<AddressEntity> findAllRegion();
}
