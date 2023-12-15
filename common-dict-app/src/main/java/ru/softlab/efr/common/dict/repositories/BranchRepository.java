package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.BranchEntity;

/**
 * Репозиторий для работы с подразделениями
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
public interface BranchRepository extends JpaRepository<BranchEntity, Long> {
    /**
     * Найти подразделение по коду
     *
     * @param code код подразделения
     * @return хранимая сущность подразделения
     */
    BranchEntity findByCode(String code);
}
