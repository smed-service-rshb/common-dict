package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Курс валюты
 */
@Validated
public class ShortCurrencyRateData   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("currencyId")
    private Long currencyId = null;

    @JsonProperty("rate")
    private BigDecimal rate = null;

    @JsonProperty("innerRate")
    private BigDecimal innerRate = null;


    /**
     * Создает пустой экземпляр класса
     */
    public ShortCurrencyRateData() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи справочника
     * @param currencyId Идентификатор валюты
     * @param rate Курс ЦБ РФ
     * @param innerRate Курс Организации
     */
    public ShortCurrencyRateData(Long id, Long currencyId, BigDecimal rate, BigDecimal innerRate) {
        this.id = id;
        this.currencyId = currencyId;
        this.rate = rate;
        this.innerRate = innerRate;
    }

    /**
     * Идентификатор записи справочника
    * @return Идентификатор записи справочника
    **/
      @NotNull



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Идентификатор валюты
    * @return Идентификатор валюты
    **/
      @NotNull



    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
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


    /**
     * Курс Организации
    * @return Курс Организации
    **/
    
  @Valid


    public BigDecimal getInnerRate() {
        return innerRate;
    }

    public void setInnerRate(BigDecimal innerRate) {
        this.innerRate = innerRate;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShortCurrencyRateData shortCurrencyRateData = (ShortCurrencyRateData) o;
        return Objects.equals(this.id, shortCurrencyRateData.id) &&
            Objects.equals(this.currencyId, shortCurrencyRateData.currencyId) &&
            Objects.equals(this.rate, shortCurrencyRateData.rate) &&
            Objects.equals(this.innerRate, shortCurrencyRateData.innerRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currencyId, rate, innerRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShortCurrencyRateData {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    innerRate: ").append(toIndentedString(innerRate)).append("\n");
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

