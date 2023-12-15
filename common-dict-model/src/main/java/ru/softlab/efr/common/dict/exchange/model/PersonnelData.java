package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonnelData
 */
@Validated
public class PersonnelData   {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("middleName")
    private String middleName = null;

    @JsonProperty("birthDate")
    private LocalDate birthDate = null;

    @JsonProperty("passportSeries")
    private String passportSeries = null;

    @JsonProperty("passportNumber")
    private String passportNumber = null;


    /**
     * Создает пустой экземпляр класса
     */
    public PersonnelData() {}

    /**
     * Создает экземпляр класса
     * @param id Уникальный (в рамках запроса) идентификатор для обратной взаимосвязи
     * @param lastName Фамилия
     * @param firstName Имя
     * @param middleName Отчество
     * @param birthDate Дата рождения
     * @param passportSeries Серия паспорта
     * @param passportNumber Номер паспорта
     */
    public PersonnelData(String id, String lastName, String firstName, String middleName, LocalDate birthDate, String passportSeries, String passportNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    /**
     * Уникальный (в рамках запроса) идентификатор для обратной взаимосвязи
    * @return Уникальный (в рамках запроса) идентификатор для обратной взаимосвязи
    **/
    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * Фамилия
    * @return Фамилия
    **/
    


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Имя
    * @return Имя
    **/
    


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Отчество
    * @return Отчество
    **/
    


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    /**
     * Дата рождения
    * @return Дата рождения
    **/
    
  @Valid


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Серия паспорта
    * @return Серия паспорта
    **/
    


    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }


    /**
     * Номер паспорта
    * @return Номер паспорта
    **/
    


    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonnelData personnelData = (PersonnelData) o;
        return Objects.equals(this.id, personnelData.id) &&
            Objects.equals(this.lastName, personnelData.lastName) &&
            Objects.equals(this.firstName, personnelData.firstName) &&
            Objects.equals(this.middleName, personnelData.middleName) &&
            Objects.equals(this.birthDate, personnelData.birthDate) &&
            Objects.equals(this.passportSeries, personnelData.passportSeries) &&
            Objects.equals(this.passportNumber, personnelData.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, middleName, birthDate, passportSeries, passportNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonnelData {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
        sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

