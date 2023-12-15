package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.OfficeEntity;

/**
 * Репозиторий для работы с офисами
 *
 * @author Plaksiy
 * @since 20.09.2017
 */
public interface OfficeRepository extends JpaRepository<OfficeEntity, Long> {

}
