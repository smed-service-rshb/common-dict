package ru.softlab.efr.common.dict.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.model.PublicOfficialEntity;
import ru.softlab.efr.common.dict.repositories.PublicOfficialRepository;

import java.util.List;

/**
 * Сервис работы со справочником видов публичных должностных лиц (ПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Service
public class PublicOfficialService {

    private static final Sort SORT_BY_NAME = new Sort(Sort.Direction.ASC, "name");


    @Autowired
    private PublicOfficialRepository publicOfficialRepository;

    /**
     * Получить список всех элементов справочника
     *
     * @return список элементов справочника
     */
    public List<PublicOfficialEntity> getAll() {
        return publicOfficialRepository.findAll(SORT_BY_NAME);
    }

}
