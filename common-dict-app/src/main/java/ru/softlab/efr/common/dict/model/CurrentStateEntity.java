package ru.softlab.efr.common.dict.model;

import ru.softlab.efr.common.dict.model.enums.OperationTypeEnum;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Информация по статусам выполнения операций.
 *
 * @author olshansky
 * @since 20.09.2018.
 */
@Entity
@Table(name = "current_state")
public class CurrentStateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long version;
    @Column
    private String name;
    @Column
    private Timestamp created;
    @Column
    private Boolean isFinished;
    @Column
    private String stateCode;
    @Column
    private String stateDescription;
    @Column
    private Timestamp modified;
    @Column
    private Timestamp fileDate;
    @Column
    private String fileName;
    @Column
    private Long fileSize;
    @Column
    @Enumerated(EnumType.STRING)
    private OperationTypeEnum operationType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public Timestamp getFileDate() {
        return fileDate;
    }

    public void setFileDate(Timestamp fileDate) {
        this.fileDate = fileDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }
}
