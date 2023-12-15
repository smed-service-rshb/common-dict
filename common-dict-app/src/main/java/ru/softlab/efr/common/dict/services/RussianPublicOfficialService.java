package ru.softlab.efr.common.dict.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.model.RussianPublicOfficialEntity;
import ru.softlab.efr.common.dict.repositories.RussianPublicOfficialRepository;

import java.util.List;

/**
 * Сервис работы со справочником видов российских публичных должностных лиц (РПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Service
public class RussianPublicOfficialService {

    private static final Sort SORT_BY_NAME = new Sort(Sort.Direction.ASC, "name");

    @Autowired
    private RussianPublicOfficialRepository russianPublicOfficialRepository;

    /**
     * Получить список всех элементов справочника
     *
     * @return список элементов справочника
     */
    public List<RussianPublicOfficialEntity> getAll() {
        return russianPublicOfficialRepository.findAll(SORT_BY_NAME);
    }

}
