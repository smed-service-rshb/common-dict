package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import ru.softlab.efr.common.dict.exchange.model.CalculationType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Настройки расчета курса валюты
 */
@Validated
public class CurrencyRateSettings   {
    @JsonProperty("calculationType")
    private CalculationType calculationType = null;

    @JsonProperty("additionalPercent")
    private BigDecimal additionalPercent = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CurrencyRateSettings() {}

    /**
     * Создает экземпляр класса
     * @param calculationType Способ расчета курса валюты Организации
     * @param additionalPercent Добавочный процент для расчета курса валюты организации
     */
    public CurrencyRateSettings(CalculationType calculationType, BigDecimal additionalPercent) {
        this.calculationType = calculationType;
        this.additionalPercent = additionalPercent;
    }

    /**
     * Способ расчета курса валюты Организации
    * @return Способ расчета курса валюты Организации
    **/
    
  @Valid


    public CalculationType getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(CalculationType calculationType) {
        this.calculationType = calculationType;
    }


    /**
     * Добавочный процент для расчета курса валюты организации
    * @return Добавочный процент для расчета курса валюты организации
    **/
    
  @Valid


    public BigDecimal getAdditionalPercent() {
        return additionalPercent;
    }

    public void setAdditionalPercent(BigDecimal additionalPercent) {
        this.additionalPercent = additionalPercent;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrencyRateSettings currencyRateSettings = (CurrencyRateSettings) o;
        return Objects.equals(this.calculationType, currencyRateSettings.calculationType) &&
            Objects.equals(this.additionalPercent, currencyRateSettings.additionalPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculationType, additionalPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyRateSettings {\n");
        
        sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
        sb.append("    additionalPercent: ").append(toIndentedString(additionalPercent)).append("\n");
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

