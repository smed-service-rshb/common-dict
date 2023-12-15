package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Хранимая сущность валюты
 *
 * @author Plaksiy
 * @since 30.08.2017
 */
@Entity
@Table(name = "currency")
public class CurrencyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "literal_iso")
    private String literalISO;
    @Column(name = "digital_iso")
    private Long digitalISO;
    @Column(name = "currency_name")
    private String currencyName;
    @Column(name = "full_currency_name")
    private String fullCurrencyName;
    @Column(name = "country_holder")
    private String countryHolder;

    public CurrencyEntity() {

    }

    public CurrencyEntity(String literalISO, Long digitalISO, String currencyName, String fullCurrencyName, String countryHolder) {
        this.literalISO = literalISO;
        this.digitalISO = digitalISO;
        this.currencyName = currencyName;
        this.fullCurrencyName = fullCurrencyName;
        this.countryHolder = countryHolder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLiteralISO() {
        return literalISO;
    }

    public void setLiteralISO(String literalISO) {
        this.literalISO = literalISO;
    }

    public Long getDigitalISO() {
        return digitalISO;
    }

    public void setDigitalISO(Long digitalISO) {
        this.digitalISO = digitalISO;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getFullCurrencyName() {
        return fullCurrencyName;
    }

    public void setFullCurrencyName(String fullCurrencyName) {
        this.fullCurrencyName = fullCurrencyName;
    }

    public String getCountryHolder() {
        return countryHolder;
    }

    public void setCountryHolder(String countryHolder) {
        this.countryHolder = countryHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrencyEntity that = (CurrencyEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (literalISO != null ? !literalISO.equals(that.literalISO) : that.literalISO != null) return false;
        if (digitalISO != null ? !digitalISO.equals(that.digitalISO) : that.digitalISO != null) return false;
        if (currencyName != null ? !currencyName.equals(that.currencyName) : that.currencyName != null) return false;
        if (fullCurrencyName != null ? !fullCurrencyName.equals(that.fullCurrencyName) : that.fullCurrencyName != null)
            return false;
        return countryHolder != null ? countryHolder.equals(that.countryHolder) : that.countryHolder == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (literalISO != null ? literalISO.hashCode() : 0);
        result = 31 * result + (digitalISO != null ? digitalISO.hashCode() : 0);
        result = 31 * result + (currencyName != null ? currencyName.hashCode() : 0);
        result = 31 * result + (fullCurrencyName != null ? fullCurrencyName.hashCode() : 0);
        result = 31 * result + (countryHolder != null ? countryHolder.hashCode() : 0);
        return result;
    }
}
