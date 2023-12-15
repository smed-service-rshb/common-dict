package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckTerroristResult
 */
@Validated
public class CheckTerroristResult   {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("isTerrorist")
    private Boolean isTerrorist = null;

    @JsonProperty("additionalInf")
    private String additionalInf = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CheckTerroristResult() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи
     * @param isTerrorist Результат проверки
     * @param additionalInf Подробности
     */
    public CheckTerroristResult(String id, Boolean isTerrorist, String additionalInf) {
        this.id = id;
        this.isTerrorist = isTerrorist;
        this.additionalInf = additionalInf;
    }

    /**
     * Идентификатор записи
    * @return Идентификатор записи
    **/
    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * Результат проверки
    * @return Результат проверки
    **/
    


    public Boolean isIsTerrorist() {
        return isTerrorist;
    }

    public void setIsTerrorist(Boolean isTerrorist) {
        this.isTerrorist = isTerrorist;
    }


    /**
     * Подробности
    * @return Подробности
    **/
    


    public String getAdditionalInf() {
        return additionalInf;
    }

    public void setAdditionalInf(String additionalInf) {
        this.additionalInf = additionalInf;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckTerroristResult checkTerroristResult = (CheckTerroristResult) o;
        return Objects.equals(this.id, checkTerroristResult.id) &&
            Objects.equals(this.isTerrorist, checkTerroristResult.isTerrorist) &&
            Objects.equals(this.additionalInf, checkTerroristResult.additionalInf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isTerrorist, additionalInf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTerroristResult {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isTerrorist: ").append(toIndentedString(isTerrorist)).append("\n");
        sb.append("    additionalInf: ").append(toIndentedString(additionalInf)).append("\n");
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

