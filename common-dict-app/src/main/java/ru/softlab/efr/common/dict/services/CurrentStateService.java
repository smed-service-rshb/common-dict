package ru.softlab.efr.common.dict.services;


import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import ru.softlab.efr.common.dict.exchange.model.*;
import ru.softlab.efr.common.dict.model.CurrentStateEntity;
import ru.softlab.efr.common.dict.model.enums.DictUpdateProcessNameEnum;
import ru.softlab.efr.common.dict.model.enums.OperationTypeEnum;
import ru.softlab.efr.common.dict.repositories.CurrentStateRepository;

import javax.persistence.EntityNotFoundException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Сервис работы с таблицей статусов выполнения операций
 *
 * @author olshansky
 * @since 20.09.2018.
 */
@Service
public class CurrentStateService {

    @Value("${nothing.to.show}")
    private String resultIsEmpty;

    private final CurrentStateRepository currentStateRepository;

    @Autowired
    public CurrentStateService(CurrentStateRepository currentStateRepository) {
        this.currentStateRepository = currentStateRepository;
    }

    /**
     * Получить последнее состояние выполнения операции по имени
     *
     * @return состояние выполнения операции
     */
    private CurrentStateEntity findCurrentStateByName(String name) {
        return getDefaultCurrentState(currentStateRepository.findTopByNameOrderByModifiedDesc(name), name);
    }

    /**
     * Получить последнее состояние выполнения операции по имени и статусу завершения
     *
     * @return состояние выполнения операции
     */
    private CurrentStateEntity findCurrentStateByNameAndFinished(String name) {
        return getDefaultCurrentState(currentStateRepository.findTopByNameAndIsFinishedOrderByIdDesc(name, false), name);
    }

    private CurrentStateEntity getDefaultCurrentState(CurrentStateEntity currentState, String name) {
        if (currentState == null) {
            currentState = new CurrentStateEntity();
            currentState.setVersion(0L);
            currentState.setCreated(new Timestamp(new Date().getTime()));
            currentState.setName(name);
            currentState.setFinished(true);
        }
        return currentState;
    }

    public FileDateForCurrentState getFileDateForCurrentState(Long id) throws EntityNotFoundException {
        CurrentStateEntity entity = currentStateRepository.findFirstById(id);
        if (entity != null) {
            FileDateForCurrentState state = new FileDateForCurrentState();
            state.setFileDate(new SimpleDateFormat("yyyy.MM.dd").format(entity.getFileDate()));
            return state;
        }
        throw new EntityNotFoundException(String.format("Не удалось найти запись с текущим ID %s", id));
    }

    /**
     * Установить состояние выполнения операции
     */
    private void set(CurrentStateEntity currentState) {
        currentState.setModified(new Timestamp(new Date().getTime()));
        currentStateRepository.saveAndFlush(currentState);
    }

    /**
     * Установить состояние выполнения операции с сохранением версии
     */
    public void set(String name, Boolean isFinished, String stateCode, String stateDescription, Long version, LocalDate fileDate, String fileName, long fileSize) {
        CurrentStateEntity currentState = getDefaultCurrentState(findCurrentStateByNameAndFinished(name), name);
        if (version != null) {
            currentState.setVersion(version);
        }
        currentState.setName(name);
        currentState.setFinished(isFinished);
        currentState.setStateCode(stateCode);
        currentState.setStateDescription(stateDescription.length() > 254 ? stateDescription.substring(0, 254) : stateDescription);

        if (fileSize != 0) {
            currentState.setFileSize(fileSize);
        }
        if (fileDate != null) {
            currentState.setFileDate(Timestamp.valueOf(fileDate.atStartOfDay()));
        }
        if (StringUtils.isNotBlank(fileName)) {
            currentState.setOperationType(OperationTypeEnum.UPDATE);
            currentState.setFileName(fileName);
        }

        set(currentState);
    }

    /**
     * Проверить выполнен ли процесс
     *
     * @return boolean
     */
    boolean isRunning(String name) {
        return !findCurrentStateByName(name).getFinished();
    }

    /**
     * Запустить состояние выполнения операции
     */
    void start(String name, String stateDescription, long version, LocalDate fileDate, String fileName, long fileSize) {
        set(name, false, "START", stateDescription, version, fileDate, fileName, fileSize);
    }

    /**
     * Пометить, как успех загрузки c сохранением версии
     */
    void successUploading(String name, String stateDescription) {
        set(name, false, "SUCCESS", stateDescription, null, null, null, 0L);
    }

    /**
     * Остановить состояние выполнения операции из-за ошибки
     */
    void stopFail(String name, String stateDescription) {
        set(name, true, "FAIL", stateDescription, null, null, null, 0L);
    }

    /**
     * Получить человеческое описание текущего состояния выполнения операции
     *
     * @return string
     */
    public String getStatus(String name) {
        CurrentStateEntity currentState = findCurrentStateByName(name);
        if (currentState.getStateCode() == null) {
            return resultIsEmpty;
        }
        Timestamp date = new Timestamp(new Date().getTime());

        if (currentState.getModified() != null) {
            date = currentState.getModified();
        } else if (currentState.getCreated() != null) {
            date = currentState.getCreated();
        }

        return String.format("%s - (%s) %s", date, currentState.getStateCode(), currentState.getStateDescription());
    }

    /**
     * Получить информацию об обновлении всех справочников и результатах проверок по справочникам
     */
    public Page<DictStatus> getDictStatus(Pageable pageable) {
        return currentStateRepository.findAll(pageable)
                .map(m ->
                        new DictStatus(
                                m.getCreated() != null ?  m.getCreated().toInstant().atOffset(OffsetDateTime.now(ZoneId.systemDefault()).getOffset()) : null,
                                StringUtils.isNotBlank(m.getName()) ? DictType.valueOf(Objects.requireNonNull(DictUpdateProcessNameEnum.fromValue(m.getName())).name()) : null,
                                m.getOperationType() != null ? DictOperation.valueOf(m.getOperationType().name()) : null,
                                m.getFileName(),
                                m.getFileSize()));
    }

    /**
     * Получить id записи с информацией о файле-справочнике
     */
    public long getCurrentDictIdByName(String dictName) {
        CurrentStateEntity currentStateEntity = currentStateRepository.findTopByNameAndStateCodeOrderByCreatedDesc(dictName, "SUCCESS");
        if (currentStateEntity != null) {
            return currentStateEntity.getId();
        }
        return -1L;
    }

    /**
     * Сохранить последнюю информацию о результатах проверок по справочникам.
     */
    @Modifying
    public void setDictStatus(DictStatus setDictStatusRq) {
        CurrentStateEntity currentStateEntity = null;
        if (setDictStatusRq.getDictName().equals(DictType.TERRORIST)) {
            currentStateEntity = findCurrentStateByName(DictUpdateProcessNameEnum.TERRORIST.toString());
        } else if (setDictStatusRq.getDictName().equals(DictType.BLOCKAGE)) {
            currentStateEntity = findCurrentStateByName(DictUpdateProcessNameEnum.BLOCKAGE.toString());
        } else if (setDictStatusRq.getDictName().equals(DictType.INVALID_IDENTITY_DOC)) {
            currentStateEntity = findCurrentStateByName(DictUpdateProcessNameEnum.INVALID_IDENTITY_DOC.toString());
        }

        if (currentStateEntity != null) {
            currentStateEntity.setOperationType(OperationTypeEnum.valueOf(setDictStatusRq.getDictOperation().name()));
            if (setDictStatusRq.getDictOperation() != null && setDictStatusRq.getDictOperation().equals(DictOperation.FINISHED)) {
                currentStateEntity.setFinished(true);
            }
            currentStateEntity.setStateCode("SUCCESS");
            set(currentStateEntity);
        }
    }

    boolean isAlreadyLoadedVersion(String dictName, long version) {
        return Boolean.TRUE.equals(currentStateRepository.existsByNameAndVersion(dictName, version));
    }
}
