package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AbstractDictItem
 */
@Validated
public class AbstractDictItem   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;


    /**
     * Создает пустой экземпляр класса
     */
    public AbstractDictItem() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи
     * @param name Наименование элемента справочника
     */
    public AbstractDictItem(Long id, String name) {
        this.id = id;
        this.name = name;
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


    /**
     * Наименование элемента справочника
    * @return Наименование элемента справочника
    **/
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractDictItem abstractDictItem = (AbstractDictItem) o;
        return Objects.equals(this.id, abstractDictItem.id) &&
            Objects.equals(this.name, abstractDictItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractDictItem {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

