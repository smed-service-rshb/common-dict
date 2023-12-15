package ru.softlab.efr.common.dict.model;


import javax.persistence.*;

/**
 * Хранимая сущность подразделения
 *
 * @author basharin
 * @since 07.12.2017
 */
@Entity
@Table(name = "division_code")
public class DivisionCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
