package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Информация о регионе
 */
@Validated
public class Region   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("okato")
    private String okato = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Region() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param name Наименование
     * @param okato Код по классификатору ОКАТО
     */
    public Region(Long id, String name, String okato) {
        this.id = id;
        this.name = name;
        this.okato = okato;
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
     * Наименование
    * @return Наименование
    **/
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Код по классификатору ОКАТО
    * @return Код по классификатору ОКАТО
    **/
    


    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Region region = (Region) o;
        return Objects.equals(this.id, region.id) &&
            Objects.equals(this.name, region.name) &&
            Objects.equals(this.okato, region.okato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, okato);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    okato: ").append(toIndentedString(okato)).append("\n");
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

