package ru.softlab.efr.common.dict.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.model.ForeignPublicOfficialEntity;
import ru.softlab.efr.common.dict.repositories.ForeignPublicOfficialRepository;

import java.util.List;

/**
 * Сервис работы со справочником видов иностранных публичных должностных лиц (ИПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Service
public class ForeignPublicOfficialService {

    private static final Sort SORT_BY_NAME = new Sort(Sort.Direction.ASC, "name");

    @Autowired
    private ForeignPublicOfficialRepository foreignPublicOfficialRepository;

    /**
     * Получить список всех элементов справочника
     *
     * @return список элементов справочника
     */
    public List<ForeignPublicOfficialEntity> getAll() {
        return foreignPublicOfficialRepository.findAll(SORT_BY_NAME);
    }

}
