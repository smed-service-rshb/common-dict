package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.CurrencyCbRateData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ответ на запрос получения курсов валют ЦБ РФ
 */
@Validated
public class CurrencyCbRateRs   {
    @JsonProperty("rates")
    @Valid
    private List<CurrencyCbRateData> rates = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CurrencyCbRateRs() {}

    /**
     * Создает экземпляр класса
     * @param rates 
     */
    public CurrencyCbRateRs(List<CurrencyCbRateData> rates) {
        this.rates = rates;
    }

    public CurrencyCbRateRs addRatesItem(CurrencyCbRateData ratesItem) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.add(ratesItem);
        return this;
    }

    /**
    * Get rates
    * @return 
    **/
    
  @Valid


    public List<CurrencyCbRateData> getRates() {
        return rates;
    }

    public void setRates(List<CurrencyCbRateData> rates) {
        this.rates = rates;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrencyCbRateRs currencyCbRateRs = (CurrencyCbRateRs) o;
        return Objects.equals(this.rates, currencyCbRateRs.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyCbRateRs {\n");
        
        sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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

