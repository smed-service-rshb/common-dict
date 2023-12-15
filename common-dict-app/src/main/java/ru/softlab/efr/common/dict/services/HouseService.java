package ru.softlab.efr.common.dict.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import ru.softlab.efr.common.dict.model.HouseEntity;
import ru.softlab.efr.common.dict.repositories.HouseRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Сервис для работы с записями о сроениях
 *
 * @author gladishev
 * @since 26.10.2017
 */
@Service
@Transactional(readOnly = true)
public class HouseService {

    @Resource
    private HouseRepository houseRepository;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Void save(HouseEntity house) {
        houseRepository.save(house);
        return null;
    }

    /**
     * Возвращает общее кол-во записей строений в БД
     *
     * @return кол-во строений в БД
     */
    public long count() {
        return houseRepository.count();
    }

    /**
     * Удаление списка строений
     *
     * @param deletedHouses - список строений
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void delete(List<HouseEntity> deletedHouses) {
        houseRepository.delete(deletedHouses);
    }

    /**
     * Поиск строений по houseid
     *
     * @param houseids - houseid строений
     * @return строение
     */
    public List<HouseEntity> findAllByHouseid(List<String> houseids) {
        return houseRepository.findAllByHouseidIn(houseids);
    }
    /**
     * Поиск строения по houseid
     *
     * @param houseid - houseid строения
     * @return строение
     */
    public HouseEntity findByHouseid(String houseid) {
        return houseRepository.findByHouseid(houseid);
    }

    public List<HouseEntity> findByAoguidAndHousenum(String aoguid, String house) {
        if (StringUtils.isEmpty(house))
            return houseRepository.findByAoguidOrderByBuildnum(aoguid);

        return houseRepository.findByAoguidAndHousenumIgnoreCaseContainingOrderByBuildnum(aoguid, house);
    }

    /**
     * Удаление строений по houseids
     *
     * @param houseids - houseid строений
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteByHouseid(List<String> houseids) {
        houseRepository.deleteByHouseid(houseids);
    }

    /**
     * Сохранение списка строений
     * @param houses - список строений
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Void saveAll(List<HouseEntity> houses) {
        houseRepository.save(houses);
        return null;
    }
}
