package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.softlab.efr.common.dict.model.CurrencyEntity;
import ru.softlab.efr.common.dict.model.CurrencyRateCb;

import javax.persistence.LockModeType;
import java.time.LocalDate;
import java.util.List;

public interface CurrencyRateCbRepository extends JpaRepository<CurrencyRateCb, Long> {

    @Query("select r from CurrencyRateCb as r join r.currency as c where c.literalISO = :currencyIso and r.date between :startDate and :endDate")
    List<CurrencyRateCb> findAllByCurrencyIsoAndDateCbBetween(@Param("currencyIso") String literalIso,
                                                              @Param("startDate") LocalDate startDate,
                                                              @Param("endDate") LocalDate endDate,
                                                              Sort sort);

    @Lock(value = LockModeType.PESSIMISTIC_WRITE)
    CurrencyRateCb findByDateAndCurrency(LocalDate date, CurrencyEntity currency);
}
