package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Информация по типам документов
 *
 * @author olshansky
 * @since 18.09.2018.
 */
@Entity
@Table(name = "identity_doc_type")
public class IdentityDocTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long version;

    private String name;
    private String schema;

    public IdentityDocTypeEntity() {
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

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
