package ru.softlab.efr.common.dict.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.BlockageEntity;
import ru.softlab.efr.common.dict.model.TerroristEntity;

import javax.persistence.QueryHint;
import java.time.LocalDate;
import java.util.List;

/**
 * Репозиторий для работы с сущностью блокировок/заморозок
 *
 * @author olshansky
 * @since 17.09.2018.
 */
public interface BlockagesRepository extends JpaRepository<BlockageEntity, Long> {

    @QueryHints({@QueryHint(name = "org.hibernate.cacheable", value = "true")})
    List<BlockageEntity> findAll();

    Integer countByPassportSeriesAndPassportNumber(String passportSeries, String passportNumber);

    Integer countByLastNameAndFirstNameAndBirthDate(String lastName, String firstName, LocalDate birthDate);

    Integer countByLastNameAndFirstNameAndMiddleNameAndBirthDate(String lastName, String firstName, String middleName, LocalDate birthDate);

    Integer countByLastNameAndFirstNameAndBirthDateAndPassportSeriesAndPassportNumber(String lastName, String firstName, LocalDate birthDate, String passportSeries, String passportNumber);

    Integer countByLastNameAndFirstNameAndMiddleNameAndBirthDateAndPassportSeriesAndPassportNumber(String lastName, String firstName, String middleName, LocalDate birthDate, String passportSeries, String passportNumber);

    @Transactional
    void deleteAllByVersionIsNot(long version);
}
