package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentDictRs
 */
@Validated
public class CurrentDictRs   {
    @JsonProperty("id")
    private Long id = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CurrentDictRs() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи
     */
    public CurrentDictRs(Long id) {
        this.id = id;
    }

    /**
     * Идентификатор записи
    * @return Идентификатор записи
    **/
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentDictRs currentDictRs = (CurrentDictRs) o;
        return Objects.equals(this.id, currentDictRs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentDictRs {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

