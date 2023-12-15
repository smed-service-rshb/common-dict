package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.RussianPublicOfficialEntity;

/**
 * Репозиторий для работы с сущностью видов российских публичных должностных лиц (РПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
public interface RussianPublicOfficialRepository extends JpaRepository<RussianPublicOfficialEntity, Long> {

}
