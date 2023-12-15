package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Банк
 */
@Validated
public class Bank   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("shortName")
    private String shortName = null;

    @JsonProperty("bic")
    private String bic = null;

    @JsonProperty("swift")
    private String swift = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("corrAccount")
    private String corrAccount = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("changedByHand")
    private Boolean changedByHand = null;

    @JsonProperty("resident")
    private Boolean resident = null;

    @JsonProperty("deleted")
    private Boolean deleted = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Bank() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param name Наименование
     * @param shortName Краткое наименование
     * @param bic БИК
     * @param swift SWIFT
     * @param description Описание
     * @param corrAccount Корр. счет
     * @param address Адрес
     * @param changedByHand Признак изменение данных вручную
     * @param resident Признак резидент РФ
     * @param deleted Признак удален
     */
    public Bank(Long id, String name, String shortName, String bic, String swift, String description, String corrAccount, String address, Boolean changedByHand, Boolean resident, Boolean deleted) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.bic = bic;
        this.swift = swift;
        this.description = description;
        this.corrAccount = corrAccount;
        this.address = address;
        this.changedByHand = changedByHand;
        this.resident = resident;
        this.deleted = deleted;
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
     * БИК
    * @return БИК
    **/
    


    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }


    /**
     * SWIFT
    * @return SWIFT
    **/
    


    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }


    /**
     * Описание
    * @return Описание
    **/
    


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Корр. счет
    * @return Корр. счет
    **/
    


    public String getCorrAccount() {
        return corrAccount;
    }

    public void setCorrAccount(String corrAccount) {
        this.corrAccount = corrAccount;
    }


    /**
     * Адрес
    * @return Адрес
    **/
    


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Признак изменение данных вручную
    * @return Признак изменение данных вручную
    **/
    


    public Boolean isChangedByHand() {
        return changedByHand;
    }

    public void setChangedByHand(Boolean changedByHand) {
        this.changedByHand = changedByHand;
    }


    /**
     * Признак резидент РФ
    * @return Признак резидент РФ
    **/
    


    public Boolean isResident() {
        return resident;
    }

    public void setResident(Boolean resident) {
        this.resident = resident;
    }


    /**
     * Признак удален
    * @return Признак удален
    **/
    


    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bank bank = (Bank) o;
        return Objects.equals(this.id, bank.id) &&
            Objects.equals(this.name, bank.name) &&
            Objects.equals(this.shortName, bank.shortName) &&
            Objects.equals(this.bic, bank.bic) &&
            Objects.equals(this.swift, bank.swift) &&
            Objects.equals(this.description, bank.description) &&
            Objects.equals(this.corrAccount, bank.corrAccount) &&
            Objects.equals(this.address, bank.address) &&
            Objects.equals(this.changedByHand, bank.changedByHand) &&
            Objects.equals(this.resident, bank.resident) &&
            Objects.equals(this.deleted, bank.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName, bic, swift, description, corrAccount, address, changedByHand, resident, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bank {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
        sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
        sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    corrAccount: ").append(toIndentedString(corrAccount)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    changedByHand: ").append(toIndentedString(changedByHand)).append("\n");
        sb.append("    resident: ").append(toIndentedString(resident)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

