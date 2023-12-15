package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Информация по видам степеней родства
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Entity
@Table(name = "kinship_type")
public class KinshipTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private long version;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
