package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Информация по видам иностранных публичных должностных лиц (ИПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Entity
@Table(name = "foreign_public_official")
public class ForeignPublicOfficialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long version;

    private String name;

    public ForeignPublicOfficialEntity() {
        this.setVersion(0L);
    }

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
