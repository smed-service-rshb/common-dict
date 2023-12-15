package ru.softlab.efr.common.dict.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.model.IdentityDocTypeEntity;
import ru.softlab.efr.common.dict.repositories.IdentityDocTypeRepository;

import java.util.List;

/**
 * Сервис работы со справочником типов документов
 *
 * @author olshansky
 * @since 18.09.2018.
 */
@Service
public class IdentityDocTypeService {

    private static final Sort SORT_BY_NAME = new Sort(Sort.Direction.ASC, "name");

    @Autowired
    private IdentityDocTypeRepository identityDocTypeRepository;

    /**
     * Получить список всех типов документов
     *
     * @return список типов документов
     */
    public List<IdentityDocTypeEntity> getAll() {
        return identityDocTypeRepository.findAll(SORT_BY_NAME);
    }

    /**
     * Сохранить элемент справочника
     */
    public void save(IdentityDocTypeEntity identityDocTypeEntity) {
        identityDocTypeRepository.saveAndFlush(identityDocTypeEntity);
    }

    /**
     * Удалить элемент справочника
     */
    public void delete(IdentityDocTypeEntity identityDocTypeEntity) {
        if (identityDocTypeRepository.findOne(identityDocTypeEntity.getId()) != null) {
            identityDocTypeRepository.delete(identityDocTypeEntity);
        }
    }

    /**
     * Получить элемент справочника по id
     */
    public IdentityDocTypeEntity findById(Long id) {
        return identityDocTypeRepository.findOne(id);
    }

}
