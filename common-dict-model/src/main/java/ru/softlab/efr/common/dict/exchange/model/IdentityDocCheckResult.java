package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentityDocCheckResult
 */
@Validated
public class IdentityDocCheckResult   {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("isInvalidIdentityDoc")
    private Boolean isInvalidIdentityDoc = null;


    /**
     * Создает пустой экземпляр класса
     */
    public IdentityDocCheckResult() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи
     * @param isInvalidIdentityDoc Результат проверки
     */
    public IdentityDocCheckResult(String id, Boolean isInvalidIdentityDoc) {
        this.id = id;
        this.isInvalidIdentityDoc = isInvalidIdentityDoc;
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
    


    public Boolean isIsInvalidIdentityDoc() {
        return isInvalidIdentityDoc;
    }

    public void setIsInvalidIdentityDoc(Boolean isInvalidIdentityDoc) {
        this.isInvalidIdentityDoc = isInvalidIdentityDoc;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityDocCheckResult identityDocCheckResult = (IdentityDocCheckResult) o;
        return Objects.equals(this.id, identityDocCheckResult.id) &&
            Objects.equals(this.isInvalidIdentityDoc, identityDocCheckResult.isInvalidIdentityDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isInvalidIdentityDoc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityDocCheckResult {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isInvalidIdentityDoc: ").append(toIndentedString(isInvalidIdentityDoc)).append("\n");
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

