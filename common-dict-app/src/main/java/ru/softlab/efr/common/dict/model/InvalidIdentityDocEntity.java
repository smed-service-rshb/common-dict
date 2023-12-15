package ru.softlab.efr.common.dict.model;


import javax.persistence.*;

/**
 * Информация по недействительным паспортам
 *
 * @author olshansky
 * @since 14.09.2018.
 */
@Entity
@Table(name = "invalid_identity_doc")
public class InvalidIdentityDocEntity implements Comparable<InvalidIdentityDocEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passportSeriesNumber;

    public InvalidIdentityDocEntity() {
    }

    public InvalidIdentityDocEntity(String passportSeriesNumber) {
        this.passportSeriesNumber = passportSeriesNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportSeriesNumber() {
        return passportSeriesNumber;
    }

    public void setPassportSeriesNumber(String passportSeriesNumber) {
        this.passportSeriesNumber = passportSeriesNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (o instanceof InvalidIdentityDocEntity) {
            InvalidIdentityDocEntity that = (InvalidIdentityDocEntity) o;
            return that.compareTo(this) == 0;
        }
        return false;
    }

    @Override
    public int compareTo(InvalidIdentityDocEntity o) {
        if (isFilledPassport(o) && isFilledPassport(this)) {
            if (o.getPassportSeriesNumber().equalsIgnoreCase(this.getPassportSeriesNumber())) {
                return 0;
            } else {
                return this.getPassportSeriesNumber().compareTo(o.getPassportSeriesNumber());
            }
        }
        return -1;
    }

    private boolean isFilledPassport(InvalidIdentityDocEntity invalidIdentityDocEntity) {
        return invalidIdentityDocEntity.getPassportSeriesNumber() != null;
    }
}
