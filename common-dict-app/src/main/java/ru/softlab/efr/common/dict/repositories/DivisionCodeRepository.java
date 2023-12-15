package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.DivisionCodeEntity;

/**
 * Репозиторий для работы с подразделениями
 *
 * @author basharin
 * @since 07.12.2017
 */
public interface DivisionCodeRepository extends JpaRepository<DivisionCodeEntity, Long> {

    /**
     * Найти подразделение по коду
     *
     * @param key код подразделения
     * @return хранимая сущность подразделения
     */
    DivisionCodeEntity findByCode(String key);
}
