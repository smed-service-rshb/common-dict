package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.ExternalSystemErrorEntity;

/**
 * Репозиторий для работы с ошибками внешних систем
 *
 * @author Plaksiy
 * @since 13.09.2017
 */
public interface ExternalSystemErrorRepository extends JpaRepository<ExternalSystemErrorEntity, Long> {

}
