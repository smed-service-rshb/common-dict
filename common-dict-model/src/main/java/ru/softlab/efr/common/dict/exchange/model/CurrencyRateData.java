package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Курс валюты
 */
@Validated
public class CurrencyRateData   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("currencyId")
    private Long currencyId = null;

    @JsonProperty("rate")
    private BigDecimal rate = null;

    @JsonProperty("innerRate")
    private BigDecimal innerRate = null;

    @JsonProperty("startDate")
    private OffsetDateTime startDate = null;

    @JsonProperty("endDate")
    private OffsetDateTime endDate = null;

    @JsonProperty("active")
    private Boolean active = null;

    @JsonProperty("edited")
    private Boolean edited = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CurrencyRateData() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи справочника
     * @param currencyId Идентификатор валюты
     * @param rate Курс ЦБ РФ
     * @param innerRate Курс Организации
     * @param startDate Дата начала действия курса
     * @param endDate Дата окончания действия курса
     * @param active Признак действующего курса валюты
     * @param edited Признак ручного редактирования
     */
    public CurrencyRateData(Long id, Long currencyId, BigDecimal rate, BigDecimal innerRate, OffsetDateTime startDate, OffsetDateTime endDate, Boolean active, Boolean edited) {
        this.id = id;
        this.currencyId = currencyId;
        this.rate = rate;
        this.innerRate = innerRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
        this.edited = edited;
    }

    /**
     * Идентификатор записи справочника
    * @return Идентификатор записи справочника
    **/
    


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


    /**
     * Дата начала действия курса
    * @return Дата начала действия курса
    **/
    
  @Valid


    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }


    /**
     * Дата окончания действия курса
    * @return Дата окончания действия курса
    **/
    
  @Valid


    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }


    /**
     * Признак действующего курса валюты
    * @return Признак действующего курса валюты
    **/
    


    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    /**
     * Признак ручного редактирования
    * @return Признак ручного редактирования
    **/
    


    public Boolean isEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrencyRateData currencyRateData = (CurrencyRateData) o;
        return Objects.equals(this.id, currencyRateData.id) &&
            Objects.equals(this.currencyId, currencyRateData.currencyId) &&
            Objects.equals(this.rate, currencyRateData.rate) &&
            Objects.equals(this.innerRate, currencyRateData.innerRate) &&
            Objects.equals(this.startDate, currencyRateData.startDate) &&
            Objects.equals(this.endDate, currencyRateData.endDate) &&
            Objects.equals(this.active, currencyRateData.active) &&
            Objects.equals(this.edited, currencyRateData.edited);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currencyId, rate, innerRate, startDate, endDate, active, edited);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyRateData {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    innerRate: ").append(toIndentedString(innerRate)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
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

