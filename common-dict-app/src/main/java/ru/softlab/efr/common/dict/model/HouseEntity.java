package ru.softlab.efr.common.dict.model;

import ru.softlab.efr.common.dict.exchange.model.House;
import ru.softlab.efr.common.dict.exchange.model.HouseType;

import javax.persistence.*;

/**
 * Хранимая сущность строения
 *
 * @author gladishev
 * @since 26.10.2017
 */
@Entity
@Table(name = "houses")
public class HouseEntity implements Comparable<HouseEntity> {

    /* id адреса */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Почтовый индекс */
    @Column
    private String postalcode;

    /* Номер дома */
    @Column
    private String housenum;

    /* Номер корпуса */
    @Column
    private String buildnum;

    /* Номер строения */
    @Column
    private String strucnum;

    /* Уникальный идентификатор записи дома */
    @Column
    private String houseid;

    /* Глобальный уникальный идентификатор дома */
    @Column
    private String houseguid;

    /* HOUSETYPE */
    @Column
    @Enumerated(value = EnumType.STRING)
    private HouseType houseType;

    /* Guid записи родительского объекта (улицы, города, населенного пункта и т.п.) */
    @Column
    private String aoguid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getHousenum() {
        return housenum;
    }

    public void setHousenum(String housenum) {
        this.housenum = housenum;
    }

    public String getBuildnum() {
        return buildnum;
    }

    public void setBuildnum(String buildnum) {
        this.buildnum = buildnum;
    }

    public String getStrucnum() {
        return strucnum;
    }

    public void setStrucnum(String strucnum) {
        this.strucnum = strucnum;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getHouseguid() {
        return houseguid;
    }

    public void setHouseguid(String houseguid) {
        this.houseguid = houseguid;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public String getAoguid() {
        return aoguid;
    }

    public void setAoguid(String aoguid) {
        this.aoguid = aoguid;
    }

    public static House toHouse(HouseEntity houseEntity) {
        House house = new House();
        house.setId(houseEntity.getId());
        house.setHousenum(houseEntity.getHousenum());
        house.setBuildnum(houseEntity.getBuildnum());
        house.setHouseType(houseEntity.getHouseType());
        house.setPostalcode(houseEntity.getPostalcode());
        house.setStrucnum(houseEntity.getStrucnum());
        return house;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HouseEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
        sb.append("    housenum: ").append(toIndentedString(housenum)).append("\n");
        sb.append("    buildnum: ").append(toIndentedString(buildnum)).append("\n");
        sb.append("    strucnum: ").append(toIndentedString(strucnum)).append("\n");
        sb.append("    houseid: ").append(toIndentedString(houseid)).append("\n");
        sb.append("    houseguid: ").append(toIndentedString(houseguid)).append("\n");
        sb.append("    houseType: ").append(toIndentedString(houseType.name())).append("\n");
        sb.append("    aoguid: ").append(toIndentedString(aoguid)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public int compareTo(HouseEntity o) {
        if (o.getHouseid().equalsIgnoreCase(this.getHouseid())) {
            return 0;
        } else {
            return o.getHouseid().compareTo(this.getHouseid());
        }
    }
}
