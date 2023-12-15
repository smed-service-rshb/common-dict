package ru.softlab.efr.common.dict.model;

import ru.softlab.efr.common.dict.exchange.model.Address;
import ru.softlab.efr.common.dict.exchange.model.AddressLevel;
import ru.softlab.efr.common.dict.exchange.model.Region;

import javax.persistence.*;

/**
 * Хранимая сущность адреса
 *
 * @author gladishev
 * @since 17.10.2017
 */
@Entity
@Table(name = "addresses")
public class AddressEntity implements Comparable<AddressEntity> {

    /* id адреса */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* Глобальный уникальный идентификатор адресного объекта */
    @Column
    private String aoguid;

    /* Официальное наименование */
    @Column
    private String offname;

    /* Почтовый индекс */
    @Column
    private String postalcode;

    /* Краткое наименование типа объекта */
    @Column
    private String shortname;

    /* Уровень иерархии */
    @Column
    private AddressLevel level;

    /* Оригинальное значение уровня иерархии */
    @Column(name = "orig_level")
    private int originalLevel;

    /* Идентификатор объекта родительского объекта */
    @Column
    private String parentguid;

    /* Уникальный идентификатор записи. Ключевое поле. */
    @Column
    private String aoid;

    /* Полный адрес объекта (запись вида Область Район Город ...) */
    @Column
    private String fulladdress;

    /* Код по классификатору ОКАТО */
    @Column
    private String okato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAoguid() {
        return aoguid;
    }

    public void setAoguid(String aoguid) {
        this.aoguid = aoguid;
    }

    public String getOffname() {
        return offname;
    }

    public void setOffname(String offname) {
        this.offname = offname;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public AddressLevel getLevel() {
        return level;
    }

    public void setLevel(AddressLevel level) {
        this.level = level;
    }

    public int getOriginalLevel() {
        return originalLevel;
    }

    public void setOriginalLevel(int originalLevel) {
        this.originalLevel = originalLevel;
    }

    public String getParentguid() {
        return parentguid;
    }

    public void setParentguid(String parentguid) {
        this.parentguid = parentguid;
    }

    public String getAoid() {
        return aoid;
    }

    public void setAoid(String aoid) {
        this.aoid = aoid;
    }

    public String getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(String fulladdress) {
        this.fulladdress = fulladdress;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public static Address toAddress(AddressEntity addressEntity) {
        Address address = new Address();
        address.setId(addressEntity.getId());
        address.setOffname(addressEntity.getOffname());
        address.setShortname(addressEntity.getShortname());
        address.setLevel(addressEntity.getLevel());
        address.setFulladdress(addressEntity.getFulladdress());
        address.setPostalcode(addressEntity.getPostalcode());
        return address;
    }

    public static Region toRegion(AddressEntity addressEntity) {
        Region region = new Region();
        region.setId(addressEntity.getId());
        region.setName(addressEntity.getShortname() + " " + addressEntity.getOffname());
        region.setOkato(addressEntity.getOkato());
        return region;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    aoguid: ").append(toIndentedString(aoguid)).append("\n");
        sb.append("    offname: ").append(toIndentedString(offname)).append("\n");
        sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
        sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    originalLevel: ").append(toIndentedString(originalLevel)).append("\n");
        sb.append("    parentguid: ").append(toIndentedString(parentguid)).append("\n");
        sb.append("    aoid: ").append(toIndentedString(aoid)).append("\n");
        sb.append("    fulladdress: ").append(toIndentedString(fulladdress)).append("\n");
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
    public int compareTo(AddressEntity o) {
        if (o.getAoguid().equalsIgnoreCase(this.getAoguid())) {
            return 0;
        } else {
            return o.getAoguid().compareTo(this.getAoguid());
        }
    }
}
