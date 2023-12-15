package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ошибка внешней системы
 */
@Validated
public class ExternalSystemError   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("serviceName")
    private String serviceName = null;

    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("message")
    private String message = null;


    /**
     * Создает пустой экземпляр класса
     */
    public ExternalSystemError() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param serviceName Название внешней системы
     * @param errorCode Код ошибки
     * @param message Сообщение об ошибке
     */
    public ExternalSystemError(Long id, String serviceName, String errorCode, String message) {
        this.id = id;
        this.serviceName = serviceName;
        this.errorCode = errorCode;
        this.message = message;
    }

    /**
     * Id записи
    * @return Id записи
    **/
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Название внешней системы
    * @return Название внешней системы
    **/
    


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Код ошибки
    * @return Код ошибки
    **/
    


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Сообщение об ошибке
    * @return Сообщение об ошибке
    **/
    


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalSystemError externalSystemError = (ExternalSystemError) o;
        return Objects.equals(this.id, externalSystemError.id) &&
            Objects.equals(this.serviceName, externalSystemError.serviceName) &&
            Objects.equals(this.errorCode, externalSystemError.errorCode) &&
            Objects.equals(this.message, externalSystemError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceName, errorCode, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalSystemError {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

