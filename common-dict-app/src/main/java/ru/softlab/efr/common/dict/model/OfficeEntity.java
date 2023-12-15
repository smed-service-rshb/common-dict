package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Хранимая сущность офиса
 *
 * @author Plaksiy
 * @since 20.09.2017
 */
@Entity
@Table(name = "office")
public class OfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "rf_id")
    private Long rfId;
    @Column(name = "simple_name")
    private String simpleName;
    @Column(name = "official_name")
    private String officialName;
    @Column(name = "post_address")
    private String postAddress;
    private String phone;
    @Column(name = "start_time")
    private String startTime;
    @Column(name = "end_time")
    private String endTime;

    public OfficeEntity() {

    }

    public OfficeEntity(Long rfId, String simpleName, String officialName, String postAddress, String phone, String startTime, String endTime) {
        this.rfId = rfId;
        this.simpleName = simpleName;
        this.officialName = officialName;
        this.postAddress = postAddress;
        this.phone = phone;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRfId() {
        return rfId;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficeEntity that = (OfficeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (rfId != null ? !rfId.equals(that.rfId) : that.rfId != null) return false;
        if (simpleName != null ? !simpleName.equals(that.simpleName) : that.simpleName != null) return false;
        if (officialName != null ? !officialName.equals(that.officialName) : that.officialName != null) return false;
        if (postAddress != null ? !postAddress.equals(that.postAddress) : that.postAddress != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        return endTime != null ? endTime.equals(that.endTime) : that.endTime == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rfId != null ? rfId.hashCode() : 0);
        result = 31 * result + (simpleName != null ? simpleName.hashCode() : 0);
        result = 31 * result + (officialName != null ? officialName.hashCode() : 0);
        result = 31 * result + (postAddress != null ? postAddress.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }
}
