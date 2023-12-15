package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Хранимая сущность отделения
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
@Entity
@Table(name = "branch")
public class BranchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "simple_name")
    private String simpleName;
    @Column(name = "official_name")
    private String officialName;
    @Column(name = "code")
    private String code;

    public BranchEntity() {

    }

    public BranchEntity(String simpleName, String officialName) {
        this.simpleName = simpleName;
        this.officialName = officialName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
