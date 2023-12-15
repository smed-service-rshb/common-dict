package ru.softlab.efr.common.dict.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.model.KinshipTypeEntity;
import ru.softlab.efr.common.dict.repositories.KinshipTypeRepository;

import java.util.List;

/**
 * Сервис работы со справочником видов степеней родства
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Service
public class KinshipTypeService {
    private static final Sort SORT_BY_NAME = new Sort(Sort.Direction.ASC, "name");


    @Autowired
    private KinshipTypeRepository kinshipTypeRepository;

    /**
     * Получить список всех типов документов
     *
     * @return список типов документов
     */
    public List<KinshipTypeEntity> getAll() {
        return kinshipTypeRepository.findAll(SORT_BY_NAME);
    }

}
