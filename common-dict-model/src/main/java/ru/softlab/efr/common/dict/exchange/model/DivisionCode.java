package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Коды подразделений
 */
@Validated
public class DivisionCode   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("description")
    private String description = null;


    /**
     * Создает пустой экземпляр класса
     */
    public DivisionCode() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param code код
     * @param description описание
     */
    public DivisionCode(Long id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
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
     * код
    * @return код
    **/
    


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    /**
     * описание
    * @return описание
    **/
    


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DivisionCode divisionCode = (DivisionCode) o;
        return Objects.equals(this.id, divisionCode.id) &&
            Objects.equals(this.code, divisionCode.code) &&
            Objects.equals(this.description, divisionCode.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DivisionCode {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

