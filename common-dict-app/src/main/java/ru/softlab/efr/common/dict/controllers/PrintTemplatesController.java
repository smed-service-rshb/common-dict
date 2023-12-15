package ru.softlab.efr.common.dict.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.builder.printtemplate.PrintTemplateBuilder;
import ru.softlab.efr.common.dict.exchange.model.PrintTemplate;
import ru.softlab.efr.common.dict.model.PrintTemplateEntity;
import ru.softlab.efr.common.dict.services.PrintTemplateService;
import ru.softlab.efr.common.permissions.PrintTemplatesPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Контролер печатных форм
 */
@RestController
public class PrintTemplatesController implements PrintTemplatesApi {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger LOGGER = Logger.getLogger(PrintTemplatesController.class);
    private static final int MAX_SIZE = 50;

    private final PrintTemplateService printTemplateService;

    /**
     * Конструктор
     *
     * @param printTemplateService Сервис для работы с записями шаблонов печатных форм
     */
    public PrintTemplatesController(PrintTemplateService printTemplateService) {
        this.printTemplateService = printTemplateService;
    }

    @Override
    public ResponseEntity<PrintTemplate> create(MultipartFile content) throws Exception {

        if (content == null) {
            return ResponseEntity.badRequest().build();
        }
        byte[] contentBytes = content.getBytes();

        PrintTemplateEntity templateEntity = printTemplateService.create(content.getOriginalFilename(), contentBytes);
        return ResponseEntity.ok(PrintTemplateBuilder.build(templateEntity));
    }

    @Override
    @HasPermission(PrintTemplatesPermissions.EDIT)
    public ResponseEntity<String> edit(@PathVariable("type") String type,
                                       @RequestParam(value = "copiesNumber") Integer copiesNumber,
                                       @RequestPart(value = "content", required = false) MultipartFile content) throws IOException {
        //Кастомная валидация сделана, тк спринг без аннотации Validated на классе не проиодит валидацию параметров.
        //Навешивание аннотации Validated приводит к созданию прокси, который
        // 1) ломает проверку прав (доработка auth-service)
        // 2) не поднимает контроллеры вообще, тк в базовом интерфейсе нет аннотации RestController (доработка сваггера)
        if (isInvalidParam(type, MAX_SIZE) || copiesNumber == null) {
            return ResponseEntity.badRequest().build();
        }
        byte[] contentBytes = content == null ? null : content.getBytes();

        PrintTemplateEntity templateEntity = printTemplateService.edit(type, copiesNumber, content == null ? null : content.getOriginalFilename(), contentBytes);
        return ResponseEntity
                .ok()
//Для корректной работы в IE9 требуется контент-тайп или text/plain, или text/html
                .header(HttpHeaders.CONTENT_TYPE, "text/plain;charset=UTF-8")
                .body(objectMapper.writeValueAsString(PrintTemplateBuilder.build(templateEntity)));
    }

    private static boolean isInvalidParam(String value, int maxSize) {
        return StringUtils.isEmpty(value) || value.length() > maxSize;
    }

    @Override
//    @HasPermission(PrintTemplatesPermissions.GET) //fixme при получении шаблона из под комунды не достаточно прав
    public ResponseEntity<PrintTemplate> get(@PathVariable("type") String type) {
        PrintTemplateEntity templateEntity = printTemplateService.findByType(type);
        return ResponseEntity.ok(PrintTemplateBuilder.build(templateEntity));
    }

    @Override
//    @HasPermission(PrintTemplatesPermissions.GET) //fixme при получении шаблона из под комунды не достаточно прав
    public ResponseEntity<Resource> getContent(@PathVariable("type") String type) {
        PrintTemplateEntity entity = printTemplateService.findByType(type);
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + entity.getFilename() + "\"")
                .body(new ByteArrayResource(printTemplateService.getContent(type)));
    }

    @Override
    @HasPermission(PrintTemplatesPermissions.LIST)
    public ResponseEntity<List<PrintTemplate>> list() {
        List<PrintTemplateEntity> entities = printTemplateService.findAll();
        return ResponseEntity.ok(entities.stream().map(PrintTemplateBuilder::build).collect(Collectors.toList()));
    }

    @ExceptionHandler
    ResponseEntity handleException(final EntityNotFoundException e) {
        LOGGER.warn("Сущность не найдена", e);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ExceptionHandler
    ResponseEntity handleException(final EntityExistsException e) {
        LOGGER.warn("Сущность уже существует", e);
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}
