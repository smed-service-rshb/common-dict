package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentityDocType
 */
@Validated
public class IdentityDocType   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("schema")
    private String schema = null;


    /**
     * Создает пустой экземпляр класса
     */
    public IdentityDocType() {}

    /**
     * Создает экземпляр класса
     * @param id Идентификатор записи
     * @param name Наименование типа документа
     * @param schema Схема полей
     */
    public IdentityDocType(Long id, String name, String schema) {
        this.id = id;
        this.name = name;
        this.schema = schema;
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
     * Наименование типа документа
    * @return Наименование типа документа
    **/
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Схема полей
    * @return Схема полей
    **/
    


    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityDocType identityDocType = (IdentityDocType) o;
        return Objects.equals(this.id, identityDocType.id) &&
            Objects.equals(this.name, identityDocType.name) &&
            Objects.equals(this.schema, identityDocType.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityDocType {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

