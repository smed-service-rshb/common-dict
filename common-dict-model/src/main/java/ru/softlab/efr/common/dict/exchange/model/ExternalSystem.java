package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Внешняя система
 */
@Validated
public class ExternalSystem   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("systemType")
    private String systemType = null;

    @JsonProperty("systemId")
    private String systemId = null;

    @JsonProperty("connectTimeout")
    private Long connectTimeout = null;

    @JsonProperty("failurePeriod")
    private Long failurePeriod = null;

    @JsonProperty("failurePeriodCount")
    private Long failurePeriodCount = null;


    /**
     * Создает пустой экземпляр класса
     */
    public ExternalSystem() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param name Название
     * @param systemType Тип системы
     * @param systemId Идентификатор системы вида BISQUIT:6300
     * @param connectTimeout Таймаут соединения
     * @param failurePeriod Период отказа
     * @param failurePeriodCount Количество периодов отказа
     */
    public ExternalSystem(Long id, String name, String systemType, String systemId, Long connectTimeout, Long failurePeriod, Long failurePeriodCount) {
        this.id = id;
        this.name = name;
        this.systemType = systemType;
        this.systemId = systemId;
        this.connectTimeout = connectTimeout;
        this.failurePeriod = failurePeriod;
        this.failurePeriodCount = failurePeriodCount;
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
     * Название
    * @return Название
    **/
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Тип системы
    * @return Тип системы
    **/
    


    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }


    /**
     * Идентификатор системы вида BISQUIT:6300
    * @return Идентификатор системы вида BISQUIT:6300
    **/
    


    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }


    /**
     * Таймаут соединения
    * @return Таймаут соединения
    **/
    


    public Long getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Long connectTimeout) {
        this.connectTimeout = connectTimeout;
    }


    /**
     * Период отказа
    * @return Период отказа
    **/
    


    public Long getFailurePeriod() {
        return failurePeriod;
    }

    public void setFailurePeriod(Long failurePeriod) {
        this.failurePeriod = failurePeriod;
    }


    /**
     * Количество периодов отказа
    * @return Количество периодов отказа
    **/
    


    public Long getFailurePeriodCount() {
        return failurePeriodCount;
    }

    public void setFailurePeriodCount(Long failurePeriodCount) {
        this.failurePeriodCount = failurePeriodCount;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalSystem externalSystem = (ExternalSystem) o;
        return Objects.equals(this.id, externalSystem.id) &&
            Objects.equals(this.name, externalSystem.name) &&
            Objects.equals(this.systemType, externalSystem.systemType) &&
            Objects.equals(this.systemId, externalSystem.systemId) &&
            Objects.equals(this.connectTimeout, externalSystem.connectTimeout) &&
            Objects.equals(this.failurePeriod, externalSystem.failurePeriod) &&
            Objects.equals(this.failurePeriodCount, externalSystem.failurePeriodCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, systemType, systemId, connectTimeout, failurePeriod, failurePeriodCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalSystem {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    failurePeriod: ").append(toIndentedString(failurePeriod)).append("\n");
        sb.append("    failurePeriodCount: ").append(toIndentedString(failurePeriodCount)).append("\n");
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

