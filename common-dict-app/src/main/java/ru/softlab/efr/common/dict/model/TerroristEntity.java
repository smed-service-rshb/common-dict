package ru.softlab.efr.common.dict.model;

import org.apache.commons.lang.StringUtils;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Информация по экстремистам/террористам.
 *
 * @author olshansky
 * @since 14.09.2018.
 */
@Entity
@Table(name = "terrorist")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TerroristEntity implements Comparable<TerroristEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long version;

    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private String birthAddress;
    private String liveAddress;
    private String passportSeries;
    private String passportNumber;

    private Long personnelNumber;

    public TerroristEntity() {
    }

    public TerroristEntity(String lastName, String firstName, String middleName, Date birthDate, String passportSeries, String passportNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthAddress() {
        return birthAddress;
    }

    public void setBirthAddress(String birthAddress) {
        this.birthAddress = birthAddress;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Long getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(Long personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    @Override
    public int compareTo(TerroristEntity o) {

        /*Проверка при наличии всех данных*/
        if (isFilledShortName(o) && isFilledShortName(this)) {
            if (o.getLastName().equalsIgnoreCase(this.getLastName())) {
                if (o.getFirstName().equalsIgnoreCase(this.getFirstName())) {
                    if (compareNullableString(this.getMiddleName(), o.getMiddleName()) == 0) {
                        if (compareNullableDate(this.getBirthDate(), o.getBirthDate()) == 0) {
                            if (compareNullableString(this.getPassportSeries(), o.getPassportSeries()) == 0) {
                                return compareNullableString(this.getPassportNumber(), o.getPassportNumber());
                            }
                        } else {
                            return compareNullableDate(this.getBirthDate(), o.getBirthDate());
                        }
                    } else {
                        return compareNullableString(this.getMiddleName(), o.getMiddleName());
                    }
                } else {
                    return this.getFirstName().compareTo(o.getFirstName());
                }
            } else {
                return this.getLastName().compareTo(o.getLastName());
            }
        }


        /*Проверка только по паспортным данным*/
        if (compareNullableString(this.getPassportSeries(), o.getPassportSeries()) == 0) {
            return compareNullableString(this.getPassportNumber(), o.getPassportNumber());
        } else {
            return compareNullableString(this.getPassportSeries(), o.getPassportSeries());
        }
    }


    /**
     * Илона 12:10
     * если данные отсутствуют, то считаем, что они совпали
     */
    private int compareNullableDate(Date date1, Date date2) {
        if ((date1 == null || date2 == null) || date1.equals(date2)) {
            return 0;
        }
        return date1.compareTo(date2);
    }

    /**
     * Илона 12:10
     * если данные отсутствуют, то считаем, что они совпали
     */
    private int compareNullableString(String string1, String string2) {
        if ((StringUtils.isBlank(string1) || StringUtils.isBlank(string2)) || string1.equalsIgnoreCase(string2)) {
            return 0;
        }
        return string1.compareTo(string2);
    }

    private boolean isFilledShortName(TerroristEntity terroristEntity) {
        return StringUtils.isNotBlank(terroristEntity.getLastName()) && StringUtils.isNotBlank(terroristEntity.getFirstName())
                && (terroristEntity.getBirthDate() == null || (terroristEntity.getBirthDate() != null && terroristEntity.getBirthDate().after(
                Date.from(LocalDate.of(1900, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()))));
    }
}
