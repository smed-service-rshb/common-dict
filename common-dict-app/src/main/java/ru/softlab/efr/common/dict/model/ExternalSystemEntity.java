package ru.softlab.efr.common.dict.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

/**
 * Хранимая сущность внешней системы
 *
 * @author Plaksiy
 * @since 12.09.2017
 */
@Entity
@Table(name = "external_system")
public class ExternalSystemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "system_type")
    private String systemType;
    @Column(name = "system_id")
    private String systemId;
    @Column(name = "connect_timeout")
    private Long connectTimeout;
    @Column(name = "failure_period")
    private Long failurePeriod;
    @Column(name = "failure_period_count")
    private Long failurePeriodCount;

    public ExternalSystemEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Long getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Long connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Long getFailurePeriod() {
        return failurePeriod;
    }

    public void setFailurePeriod(Long failurePeriod) {
        this.failurePeriod = failurePeriod;
    }

    public Long getFailurePeriodCount() {
        return failurePeriodCount;
    }

    public void setFailurePeriodCount(Long failurePeriodCount) {
        this.failurePeriodCount = failurePeriodCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ExternalSystemEntity that = (ExternalSystemEntity) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(name, that.name)
                .append(systemType, that.systemType)
                .append(systemId, that.systemId)
                .append(connectTimeout, that.connectTimeout)
                .append(failurePeriod, that.failurePeriod)
                .append(failurePeriodCount, that.failurePeriodCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(systemType)
                .append(systemId)
                .append(connectTimeout)
                .append(failurePeriod)
                .append(failurePeriodCount)
                .toHashCode();
    }
}
