package ru.softlab.efr.common.dict.model;

import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.persistence.*;

/**
 * Хранимая сущность банка
 *
 * @author levin
 * @since 06.04.2017
 */
@Entity
@Table(name = "bank")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;
    @Column(name = "short_name")
    private String shortName;
    private String bic;
    @Column(name = "bic_rcc")
    private String bicRcc;
    private String swift;
    private String description;
    private String country;

    @Column(name = "corr_account")
    private String corrAccount;
    private String address;
    @Column(name = "changed_by_hand")
    private String changedByHand;
    private boolean resident;
    private boolean deleted;

    public BankEntity() {

    }

    public BankEntity(String name,
                      String shortName,
                      String bic,
                      String bicRcc,
                      String swift,
                      String description,
                      String country,
                      String corrAccount,
                      String address,
                      String changedByHand,
                      boolean resident,
                      boolean deleted) {
        this.name = name;
        this.shortName = shortName;
        this.bic = bic;
        this.bicRcc = bicRcc;
        this.swift = swift;
        this.description = description;
        this.country = country;
        this.corrAccount = corrAccount;
        this.address = address;
        this.changedByHand = changedByHand;
        this.resident = resident;
        this.deleted = deleted;
    }

    public BankEntity(Long id,
                      String name,
                      String shortName,
                      String bic,
                      String bicRcc,
                      String swift,
                      String description,
                      String country,
                      String corrAccount,
                      String address,
                      String changedByHand,
                      boolean resident,
                      boolean deleted) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.bic = bic;
        this.bicRcc = bicRcc;
        this.swift = swift;
        this.description = description;
        this.country = country;
        this.corrAccount = corrAccount;
        this.address = address;
        this.changedByHand = changedByHand;
        this.resident = resident;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBicRcc() {
        return this.bicRcc;
    }

    public void setBicRcc(String bicRcc) {
        this.bicRcc = bicRcc;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCorrAccount() {
        return corrAccount;
    }

    public void setCorrAccount(String corrAccount) {
        this.corrAccount = corrAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String isChangedByHand() {
        return changedByHand;
    }

    public void setChangedByHand(String changedByHand) {
        this.changedByHand = changedByHand;
    }

    public boolean isResident() {
        return resident;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        return new EqualsBuilder()
                .append(this.id, ((BankEntity) o).id)
                .append(this.name, ((BankEntity) o).name)
                .append(this.shortName, ((BankEntity) o).shortName)
                .append(this.bic, ((BankEntity) o).bic)
                .append(this.bicRcc, ((BankEntity) o).bicRcc)
                .append(this.swift, ((BankEntity) o).swift)
                .append(this.description, ((BankEntity) o).description)
                .append(this.country, ((BankEntity) o).country)
                .append(this.corrAccount, ((BankEntity) o).corrAccount)
                .append(this.address, ((BankEntity) o).address)
                .append(this.changedByHand, ((BankEntity) o).changedByHand)
                .append(this.resident, ((BankEntity) o).resident)
                .append(this.deleted, ((BankEntity) o).deleted)
                .isEquals();
    }

    @Override
    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        result = 31 * result + (this.shortName != null ? this.shortName.hashCode() : 0);
        result = 31 * result + (this.bic != null ? this.bic.hashCode() : 0);
        result = 31 * result + (this.bicRcc != null ? this.bicRcc.hashCode() : 0);
        result = 31 * result + (this.swift != null ? this.swift.hashCode() : 0);
        result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
        result = 31 * result + (this.country != null ? this.country.hashCode() : 0);
        result = 31 * result + (this.corrAccount != null ? this.corrAccount.hashCode() : 0);
        result = 31 * result + (this.address != null ? this.address.hashCode() : 0);
        result = 31 * result + (this.changedByHand != null ? this.changedByHand.hashCode() : 0);
        result = 31 * result + Boolean.hashCode(this.resident);
        result = 31 * result + Boolean.hashCode(this.deleted);
        return result;
    }

}
