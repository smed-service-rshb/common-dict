package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Офис
 */
@Validated
public class Office   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("rfId")
    private Long rfId = null;

    @JsonProperty("simpleName")
    private String simpleName = null;

    @JsonProperty("officialName")
    private String officialName = null;

    @JsonProperty("postAddress")
    private String postAddress = null;

    @JsonProperty("phone")
    private String phone = null;

    @JsonProperty("startTime")
    private String startTime = null;

    @JsonProperty("endTime")
    private String endTime = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Office() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param rfId Id региона
     * @param simpleName Сокращенное наименование
     * @param officialName Официальное наименование
     * @param postAddress Почтовый адрес
     * @param phone Телефон
     * @param startTime Время начала работы
     * @param endTime Время окончания работы
     */
    public Office(Long id, Long rfId, String simpleName, String officialName, String postAddress, String phone, String startTime, String endTime) {
        this.id = id;
        this.rfId = rfId;
        this.simpleName = simpleName;
        this.officialName = officialName;
        this.postAddress = postAddress;
        this.phone = phone;
        this.startTime = startTime;
        this.endTime = endTime;
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
     * Id региона
    * @return Id региона
    **/
    


    public Long getRfId() {
        return rfId;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }


    /**
     * Сокращенное наименование
    * @return Сокращенное наименование
    **/
    


    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }


    /**
     * Официальное наименование
    * @return Официальное наименование
    **/
    


    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }


    /**
     * Почтовый адрес
    * @return Почтовый адрес
    **/
    


    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }


    /**
     * Телефон
    * @return Телефон
    **/
    


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Время начала работы
    * @return Время начала работы
    **/
    


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * Время окончания работы
    * @return Время окончания работы
    **/
    


    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Office office = (Office) o;
        return Objects.equals(this.id, office.id) &&
            Objects.equals(this.rfId, office.rfId) &&
            Objects.equals(this.simpleName, office.simpleName) &&
            Objects.equals(this.officialName, office.officialName) &&
            Objects.equals(this.postAddress, office.postAddress) &&
            Objects.equals(this.phone, office.phone) &&
            Objects.equals(this.startTime, office.startTime) &&
            Objects.equals(this.endTime, office.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rfId, simpleName, officialName, postAddress, phone, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Office {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    rfId: ").append(toIndentedString(rfId)).append("\n");
        sb.append("    simpleName: ").append(toIndentedString(simpleName)).append("\n");
        sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
        sb.append("    postAddress: ").append(toIndentedString(postAddress)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

