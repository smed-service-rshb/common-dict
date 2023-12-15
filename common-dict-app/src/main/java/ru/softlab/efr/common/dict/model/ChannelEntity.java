package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Хранимая сущность канала
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
@Entity
@Table(name = "channel")
public class ChannelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "full_name")
    private String fullName;

    public ChannelEntity() {

    }

    public ChannelEntity(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChannelEntity that = (ChannelEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        return fullName != null ? fullName.equals(that.fullName) : that.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }
}
