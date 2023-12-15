package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckBlockagesResult
 */
@Validated
public class CheckBlockagesResult   {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("isBlock")
    private Boolean isBlock = null;

    @JsonProperty("additionalInf")
    private String additionalInf = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CheckBlockagesResult() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи
     * @param isBlock Результат проверки
     * @param additionalInf Подробности
     */
    public CheckBlockagesResult(String id, Boolean isBlock, String additionalInf) {
        this.id = id;
        this.isBlock = isBlock;
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
    


    public Boolean isIsBlock() {
        return isBlock;
    }

    public void setIsBlock(Boolean isBlock) {
        this.isBlock = isBlock;
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
        CheckBlockagesResult checkBlockagesResult = (CheckBlockagesResult) o;
        return Objects.equals(this.id, checkBlockagesResult.id) &&
            Objects.equals(this.isBlock, checkBlockagesResult.isBlock) &&
            Objects.equals(this.additionalInf, checkBlockagesResult.additionalInf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isBlock, additionalInf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckBlockagesResult {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isBlock: ").append(toIndentedString(isBlock)).append("\n");
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

