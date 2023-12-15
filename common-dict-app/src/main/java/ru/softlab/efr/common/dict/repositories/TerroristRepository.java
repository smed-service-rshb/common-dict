package ru.softlab.efr.common.dict.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.TerroristEntity;

import javax.persistence.QueryHint;
import java.util.Date;
import java.util.List;

/**
 * Репозиторий для работы с сущностью экстремистов/террористов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
public interface TerroristRepository extends JpaRepository<TerroristEntity, Long> {

    @QueryHints({@QueryHint(name = "org.hibernate.cacheable", value = "true")})
    List<TerroristEntity> findAll();

    Integer countByPassportSeriesAndPassportNumber(String passportSeries, String passportNumber);

    Integer countByLastNameAndFirstNameAndBirthDate(String lastName, String firstName, Date birthDate);

    Integer countByLastNameAndFirstNameAndMiddleNameAndBirthDate(String lastName, String firstName, String middleName, Date birthDate);

    Integer countByLastNameAndFirstNameAndBirthDateAndPassportSeriesAndPassportNumber(String lastName, String firstName, Date birthDate, String passportSeries, String passportNumber);

    Integer countByLastNameAndFirstNameAndMiddleNameAndBirthDateAndPassportSeriesAndPassportNumber(String lastName, String firstName, String middleName, Date birthDate, String passportSeries, String passportNumber);

    @Transactional
    void deleteAllByVersionIsNot(long version);
}
