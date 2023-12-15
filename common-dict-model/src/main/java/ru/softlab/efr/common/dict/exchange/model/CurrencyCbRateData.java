package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Курс валюты ЦБ РФ
 */
@Validated
public class CurrencyCbRateData   {
    @JsonProperty("currencyIso")
    private String currencyIso = null;

    @JsonProperty("date")
    private String date = null;

    @JsonProperty("rate")
    private BigDecimal rate = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CurrencyCbRateData() {}

    /**
     * Создает экземпляр класса
     * @param currencyIso ISO-код валюты
     * @param date Дата действия курса. Формат ДД.ММ.ГГГГ
     * @param rate Курс ЦБ РФ
     */
    public CurrencyCbRateData(String currencyIso, String date, BigDecimal rate) {
        this.currencyIso = currencyIso;
        this.date = date;
        this.rate = rate;
    }

    /**
     * ISO-код валюты
    * @return ISO-код валюты
    **/
      @NotNull



    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }


    /**
     * Дата действия курса. Формат ДД.ММ.ГГГГ
    * @return Дата действия курса. Формат ДД.ММ.ГГГГ
    **/
      @NotNull



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    /**
     * Курс ЦБ РФ
    * @return Курс ЦБ РФ
    **/
      @NotNull

  @Valid


    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrencyCbRateData currencyCbRateData = (CurrencyCbRateData) o;
        return Objects.equals(this.currencyIso, currencyCbRateData.currencyIso) &&
            Objects.equals(this.date, currencyCbRateData.date) &&
            Objects.equals(this.rate, currencyCbRateData.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyIso, date, rate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyCbRateData {\n");
        
        sb.append("    currencyIso: ").append(toIndentedString(currencyIso)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

