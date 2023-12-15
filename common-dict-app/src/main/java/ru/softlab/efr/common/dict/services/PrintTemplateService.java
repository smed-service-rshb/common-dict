package ru.softlab.efr.common.dict.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.PrintTemplateEntity;
import ru.softlab.efr.common.dict.repositories.PrintTemplateRepository;

import javax.annotation.Resource;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

/**
 * Сервис для работы с записями шаблонов печатных форм
 */
@Service
public class PrintTemplateService {
    @Resource
    private PrintTemplateRepository repository;

    /**
     * Получить шаблон по типу
     * Если шаблон не найден, выбрасывапется исключение EntityNotFoundException
     *
     * @param type тип шаблона
     * @return шаблон
     */
    public PrintTemplateEntity findByType(String type) {
        PrintTemplateEntity templateEntity = repository.findOne(type);
        if (templateEntity == null) {
            throw new EntityNotFoundException();
        }
        return templateEntity;
    }

    /**
     * Создать шаблон
     * Если шаблон с таким типом уже существует , выбрасывапется исключение EntityExistsException
     *
     * @param entity  метаданные шаблона
     * @param content печатная форма
     * @return сохраненные метаданные шаблона
     */
    @Transactional(rollbackFor = Exception.class)
    public PrintTemplateEntity create(PrintTemplateEntity entity, byte[] content) {
        if (repository.findOne(entity.getType()) != null) {
            throw new EntityExistsException();
        }

        PrintTemplateEntity templateEntity = repository.save(entity);
        repository.setContent(entity.getType(), content);
        return templateEntity;
    }


    /**
     * Получить содержимое шаблон по типу
     * Если шаблон не найден, выбрасывапется исключение EntityNotFoundException
     *
     * @param type тип шаблона
     * @return шаблон
     */

    public byte[] getContent(String type) {
        PrintTemplateEntity templateEntity = repository.findOne(type);
        if (templateEntity == null) {
            throw new EntityNotFoundException();
        }

        return repository.getContent(type);
    }

    /**
     * Удалить шаблон
     * Если шаблон не найден, выбрасывапется исключение EntityNotFoundException
     *
     * @param type тип шаблона
     */
    public void delete(String type) {
        PrintTemplateEntity templateEntity = repository.findOne(type);
        if (templateEntity == null) {
            throw new EntityNotFoundException();
        }
        repository.delete(type);
    }

    /**
     * Найти все шаблоны
     *
     * @return список шаблонов
     */
    public List<PrintTemplateEntity> findAll() {
        return repository.findAll();
    }

    /**
     * Редактирование шаблона
     *
     * @param type         тип шаблона
     * @param copiesNumber количество копий
     * @param filename     имя файла
     * @param content      контент
     * @return отредактированный шаблон
     */
    @Transactional(rollbackFor = Exception.class)
    public PrintTemplateEntity edit(String type, Integer copiesNumber, String filename, byte[] content) {
        PrintTemplateEntity templateEntity = repository.findOne(type);
        if (templateEntity == null) {
            throw new EntityNotFoundException();
        }

        if (content != null) {
            repository.setContent(type, content);
            templateEntity.setFilename(filename);
        }

        templateEntity.setCopiesNumber(copiesNumber);

        return repository.save(templateEntity);
    }

    /**
     * Создание шаблона
     *
     * @param filename     имя файла
     * @param content      контент
     * @return отредактированный шаблон
     */
    @Transactional(rollbackFor = Exception.class)
    public PrintTemplateEntity create(String filename, byte[] content) {
        PrintTemplateEntity templateEntity = new PrintTemplateEntity();
        String uuid =  UUID.randomUUID().toString();
        templateEntity.setType(uuid);
        templateEntity.setFilename(filename);
        templateEntity.setCopiesNumber(1);
        repository.save(templateEntity);
        if (content != null) {
            repository.setContent(uuid, content);
        }

        return templateEntity;
    }
}
