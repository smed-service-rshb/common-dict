package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentityDocRq
 */
@Validated
public class IdentityDocRq   {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("passportSeries")
    private Integer passportSeries = null;

    @JsonProperty("passportNumber")
    private Integer passportNumber = null;


    /**
     * Создает пустой экземпляр класса
     */
    public IdentityDocRq() {}

    /**
     * Создает экземпляр класса
     * @param id Уникальный идентификатор (в рамках запроса) для обратной связи
     * @param passportSeries Серия паспорта
     * @param passportNumber Номер паспорта
     */
    public IdentityDocRq(String id, Integer passportSeries, Integer passportNumber) {
        this.id = id;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    /**
     * Уникальный идентификатор (в рамках запроса) для обратной связи
    * @return Уникальный идентификатор (в рамках запроса) для обратной связи
    **/
      @NotNull



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * Серия паспорта
    * @return Серия паспорта
    **/
    


    public Integer getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(Integer passportSeries) {
        this.passportSeries = passportSeries;
    }


    /**
     * Номер паспорта
    * @return Номер паспорта
    **/
    


    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityDocRq identityDocRq = (IdentityDocRq) o;
        return Objects.equals(this.id, identityDocRq.id) &&
            Objects.equals(this.passportSeries, identityDocRq.passportSeries) &&
            Objects.equals(this.passportNumber, identityDocRq.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passportSeries, passportNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityDocRq {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
        sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

