package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import ru.softlab.efr.common.dict.model.CurrencyRate;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {

    @Query("select r from CurrencyRate as r join r.rate as cbr join cbr.currency as c where c.id = :currencyId and r.endDate is null")
    @QueryHints({@QueryHint(name = "org.hibernate.cacheable", value = "true")})
    CurrencyRate findActiveCurrencyRateByCurrencyId(@Param("currencyId") Long currencyId);

    @Query("select r from CurrencyRate as r join r.rate as cbr join cbr.currency as c where c.id = :currencyId and r.endDate is null")
    @Lock(value = LockModeType.PESSIMISTIC_WRITE)
    CurrencyRate findActiveRateByCurrencyIdWithLock(@Param("currencyId") Long currencyId);

    CurrencyRate findById(Long id);
}
