package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Валюта
 */
@Validated
public class Currency   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("literalISO")
    private String literalISO = null;

    @JsonProperty("digitalISO")
    private Long digitalISO = null;

    @JsonProperty("currencyName")
    private String currencyName = null;

    @JsonProperty("fullCurrencyName")
    private String fullCurrencyName = null;

    @JsonProperty("countryHolder")
    private String countryHolder = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Currency() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param literalISO ISO код
     * @param digitalISO Цифровой код
     * @param currencyName Наименование
     * @param fullCurrencyName Полное наименование
     * @param countryHolder Страна-эмиссионер
     */
    public Currency(Long id, String literalISO, Long digitalISO, String currencyName, String fullCurrencyName, String countryHolder) {
        this.id = id;
        this.literalISO = literalISO;
        this.digitalISO = digitalISO;
        this.currencyName = currencyName;
        this.fullCurrencyName = fullCurrencyName;
        this.countryHolder = countryHolder;
    }

    /**
     * Id записи
    * @return Id записи
    **/
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * ISO код
    * @return ISO код
    **/
    


    public String getLiteralISO() {
        return literalISO;
    }

    public void setLiteralISO(String literalISO) {
        this.literalISO = literalISO;
    }


    /**
     * Цифровой код
    * @return Цифровой код
    **/
    


    public Long getDigitalISO() {
        return digitalISO;
    }

    public void setDigitalISO(Long digitalISO) {
        this.digitalISO = digitalISO;
    }


    /**
     * Наименование
    * @return Наименование
    **/
    


    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Полное наименование
    * @return Полное наименование
    **/
    


    public String getFullCurrencyName() {
        return fullCurrencyName;
    }

    public void setFullCurrencyName(String fullCurrencyName) {
        this.fullCurrencyName = fullCurrencyName;
    }


    /**
     * Страна-эмиссионер
    * @return Страна-эмиссионер
    **/
    


    public String getCountryHolder() {
        return countryHolder;
    }

    public void setCountryHolder(String countryHolder) {
        this.countryHolder = countryHolder;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Currency currency = (Currency) o;
        return Objects.equals(this.id, currency.id) &&
            Objects.equals(this.literalISO, currency.literalISO) &&
            Objects.equals(this.digitalISO, currency.digitalISO) &&
            Objects.equals(this.currencyName, currency.currencyName) &&
            Objects.equals(this.fullCurrencyName, currency.fullCurrencyName) &&
            Objects.equals(this.countryHolder, currency.countryHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, literalISO, digitalISO, currencyName, fullCurrencyName, countryHolder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Currency {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    literalISO: ").append(toIndentedString(literalISO)).append("\n");
        sb.append("    digitalISO: ").append(toIndentedString(digitalISO)).append("\n");
        sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
        sb.append("    fullCurrencyName: ").append(toIndentedString(fullCurrencyName)).append("\n");
        sb.append("    countryHolder: ").append(toIndentedString(countryHolder)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

