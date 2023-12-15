package ru.softlab.efr.common.dict.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "currency_rate")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CurrencyRate {

    /**
     * Идентификатор записи
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Дата начала действия внутреннего курса
     */
    @CreationTimestamp
    @Column(name = "start_date")
    private LocalDateTime startDate;

    /**
     * Дата окончания действия внутреннего курса
     */
    @Column(name="end_date")
    private LocalDateTime endDate;

    /**
     * Курс ЦБ
     */
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rate_id", nullable = false)
    private CurrencyRateCb rate;

    /**
     * Значение курса организации
     */
    @Column(name = "inner_rate")
    private BigDecimal innerRate;

    /**
     * Признак активного курса
     */
    @Column
    private Boolean active;

    /**
     * Признак ручного редактирования
     */
    @Column
    private Boolean edited;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getInnerRate() {
        return innerRate;
    }

    public void setInnerRate(BigDecimal innerRate) {
        this.innerRate = innerRate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public CurrencyRateCb getRate() {
        return rate;
    }

    public void setRate(CurrencyRateCb rate) {
        this.rate = rate;
    }
}
