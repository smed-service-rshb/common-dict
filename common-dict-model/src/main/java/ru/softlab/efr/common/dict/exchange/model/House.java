package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ru.softlab.efr.common.dict.exchange.model.HouseType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Строение
 */
@Validated
public class House   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("housenum")
    private String housenum = null;

    @JsonProperty("buildnum")
    private String buildnum = null;

    @JsonProperty("strucnum")
    private String strucnum = null;

    @JsonProperty("postalcode")
    private String postalcode = null;

    @JsonProperty("houseType")
    private HouseType houseType = null;


    /**
     * Создает пустой экземпляр класса
     */
    public House() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param housenum Номер дома
     * @param buildnum Номер корпуса
     * @param strucnum Номер строения
     * @param postalcode Почтовый индекс
     * @param houseType Тип строения
     */
    public House(Long id, String housenum, String buildnum, String strucnum, String postalcode, HouseType houseType) {
        this.id = id;
        this.housenum = housenum;
        this.buildnum = buildnum;
        this.strucnum = strucnum;
        this.postalcode = postalcode;
        this.houseType = houseType;
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
     * Номер дома
    * @return Номер дома
    **/
    


    public String getHousenum() {
        return housenum;
    }

    public void setHousenum(String housenum) {
        this.housenum = housenum;
    }


    /**
     * Номер корпуса
    * @return Номер корпуса
    **/
    


    public String getBuildnum() {
        return buildnum;
    }

    public void setBuildnum(String buildnum) {
        this.buildnum = buildnum;
    }


    /**
     * Номер строения
    * @return Номер строения
    **/
    


    public String getStrucnum() {
        return strucnum;
    }

    public void setStrucnum(String strucnum) {
        this.strucnum = strucnum;
    }


    /**
     * Почтовый индекс
    * @return Почтовый индекс
    **/
    


    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }


    /**
     * Тип строения
    * @return Тип строения
    **/
    
  @Valid


    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        House house = (House) o;
        return Objects.equals(this.id, house.id) &&
            Objects.equals(this.housenum, house.housenum) &&
            Objects.equals(this.buildnum, house.buildnum) &&
            Objects.equals(this.strucnum, house.strucnum) &&
            Objects.equals(this.postalcode, house.postalcode) &&
            Objects.equals(this.houseType, house.houseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, housenum, buildnum, strucnum, postalcode, houseType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class House {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    housenum: ").append(toIndentedString(housenum)).append("\n");
        sb.append("    buildnum: ").append(toIndentedString(buildnum)).append("\n");
        sb.append("    strucnum: ").append(toIndentedString(strucnum)).append("\n");
        sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
        sb.append("    houseType: ").append(toIndentedString(houseType)).append("\n");
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

