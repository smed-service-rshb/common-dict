package ru.softlab.efr.common.dict.model;

import javax.persistence.*;

/**
 * Хранимая сущность ошибки внешней системы
 *
 * @author Plaksiy
 * @since 13.09.2017
 */
@Entity
@Table(name = "external_system_error")
public class ExternalSystemErrorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "error_code")
    private String errorCode;
    private String message;

    public ExternalSystemErrorEntity() {

    }

    public ExternalSystemErrorEntity(Long id, String serviceName, String errorCode, String message) {
        this.id = id;
        this.serviceName = serviceName;
        this.errorCode = errorCode;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalSystemErrorEntity that = (ExternalSystemErrorEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        return message != null ? message.equals(that.message) : that.message == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }
}
