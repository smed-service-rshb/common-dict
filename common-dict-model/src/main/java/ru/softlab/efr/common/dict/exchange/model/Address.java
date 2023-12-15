package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ru.softlab.efr.common.dict.exchange.model.AddressLevel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Адрес
 */
@Validated
public class Address   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("offname")
    private String offname = null;

    @JsonProperty("shortname")
    private String shortname = null;

    @JsonProperty("level")
    private AddressLevel level = null;

    @JsonProperty("fulladdress")
    private String fulladdress = null;

    @JsonProperty("postalcode")
    private String postalcode = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Address() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param offname Официальное название
     * @param shortname Сокращенное наименование
     * @param level Уровень адресной иерархии
     * @param fulladdress Полный адрес
     * @param postalcode Почтовый адрес
     */
    public Address(Long id, String offname, String shortname, AddressLevel level, String fulladdress, String postalcode) {
        this.id = id;
        this.offname = offname;
        this.shortname = shortname;
        this.level = level;
        this.fulladdress = fulladdress;
        this.postalcode = postalcode;
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
     * Официальное название
    * @return Официальное название
    **/
    


    public String getOffname() {
        return offname;
    }

    public void setOffname(String offname) {
        this.offname = offname;
    }


    /**
     * Сокращенное наименование
    * @return Сокращенное наименование
    **/
    


    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }


    /**
     * Уровень адресной иерархии
    * @return Уровень адресной иерархии
    **/
    
  @Valid


    public AddressLevel getLevel() {
        return level;
    }

    public void setLevel(AddressLevel level) {
        this.level = level;
    }


    /**
     * Полный адрес
    * @return Полный адрес
    **/
    


    public String getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(String fulladdress) {
        this.fulladdress = fulladdress;
    }


    /**
     * Почтовый адрес
    * @return Почтовый адрес
    **/
    


    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.id, address.id) &&
            Objects.equals(this.offname, address.offname) &&
            Objects.equals(this.shortname, address.shortname) &&
            Objects.equals(this.level, address.level) &&
            Objects.equals(this.fulladdress, address.fulladdress) &&
            Objects.equals(this.postalcode, address.postalcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, offname, shortname, level, fulladdress, postalcode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    offname: ").append(toIndentedString(offname)).append("\n");
        sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fulladdress: ").append(toIndentedString(fulladdress)).append("\n");
        sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
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

