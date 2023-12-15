package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.softlab.efr.common.dict.model.HouseEntity;

import java.util.List;

/**
 * Репозиторий для работы со строениями
 *
 * @author gladishev
 * @since 26.10.2017
 */
public interface HouseRepository extends JpaRepository<HouseEntity, Long> {

    /**
     * Удалить запись о строении по идентификатору
     *
     * @param houseIds идентификатор строения
     */
    @Modifying
    @Query("delete from HouseEntity h where h.houseid in :houseIds")
    void deleteByHouseid(@Param("houseIds") List<String> houseIds);


    /**
     * Найти строение по идентификатору
     *
     * @param houseids идентификаторы строения
     * @return хранимые сущности строения
     */
    List<HouseEntity> findAllByHouseidIn(List<String> houseids);

    /**
     * Найти строение по идентификатору
     *
     * @param houseid идентификатор строения
     * @return хранимая сущность строения
     */
    HouseEntity findByHouseid(String houseid);

    /**
     * Найти строения по глобальному идентификатору
     *
     * @param aoguid глобальный идентификатор строения
     * @return список хранимых сущностей строений
     */
    List<HouseEntity> findByAoguidOrderByBuildnum(String aoguid);

    /**
     * Найти строения по глобальному идентификатору и названию
     *
     * @param aoguid   глобальный идентификатор
     * @param housenum название
     * @return список хранимых сущностей строений
     */
    List<HouseEntity> findByAoguidAndHousenumIgnoreCaseContainingOrderByBuildnum(String aoguid, String housenum);
}
