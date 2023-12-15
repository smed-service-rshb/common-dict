package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Канал
 */
@Validated
public class Channel   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("shortName")
    private String shortName = null;

    @JsonProperty("fullName")
    private String fullName = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Channel() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param shortName Краткое наименование
     * @param fullName Полное наименование
     */
    public Channel(Long id, String shortName, String fullName) {
        this.id = id;
        this.shortName = shortName;
        this.fullName = fullName;
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
     * Краткое наименование
    * @return Краткое наименование
    **/
    


    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    /**
     * Полное наименование
    * @return Полное наименование
    **/
    


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Channel channel = (Channel) o;
        return Objects.equals(this.id, channel.id) &&
            Objects.equals(this.shortName, channel.shortName) &&
            Objects.equals(this.fullName, channel.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName, fullName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Channel {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

