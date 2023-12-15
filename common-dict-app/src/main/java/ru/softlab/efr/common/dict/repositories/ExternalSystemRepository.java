package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.ExternalSystemEntity;

/**
 * Репозиторий для работы с внешними системами
 *
 * @author Plaksiy
 * @since 12.09.2017
 */
public interface ExternalSystemRepository extends JpaRepository<ExternalSystemEntity, Long> {
    ExternalSystemEntity findBySystemId(String systemId);

}
