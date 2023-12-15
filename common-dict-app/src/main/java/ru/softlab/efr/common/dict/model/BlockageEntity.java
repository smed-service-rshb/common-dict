package ru.softlab.efr.common.dict.model;

import org.apache.commons.lang.StringUtils;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Информация по блокировкам/заморозкам.
 *
 * @author olshansky
 * @since 17.09.2018.
 */
@Entity
@Table(name = "blockages")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BlockageEntity implements Comparable<BlockageEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long version;

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String passportSeries;
    private String passportNumber;

    private Long personnelNumber;

    public BlockageEntity() {
    }

    public BlockageEntity(String lastName, String firstName, String middleName, LocalDate birthDate, String passportSeries, String passportNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public BlockageEntity(long version, String lastName, String firstName, String middleName, LocalDate birthDate, String passportSeries, String passportNumber, Long personnelNumber) {
        this.version = version;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.personnelNumber = personnelNumber;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
    public int compareTo(BlockageEntity o) {
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
    private int compareNullableDate(LocalDate date1, LocalDate date2) {
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

    private boolean isFilledShortName(BlockageEntity blockageEntity) {
        return StringUtils.isNotBlank(blockageEntity.getLastName()) && StringUtils.isNotBlank(blockageEntity.getFirstName())
                && (blockageEntity.getBirthDate() == null || (blockageEntity.getBirthDate() != null &&
                blockageEntity.getBirthDate().isAfter(LocalDate.of(1900, 1, 1))));
    }
}
