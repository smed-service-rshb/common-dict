package ru.softlab.efr.common.dict.builder.printtemplate;

import ru.softlab.efr.common.dict.exchange.model.PrintTemplate;
import ru.softlab.efr.common.dict.model.PrintTemplateEntity;

/**
 * Класс для построения хранимой сущности данных о шаблоне печатных форм
 */
public class PrintTemplateEntityBuilder {

    /**
     * Построение данных сущности PrintTemplateEntity
     *
     * @param template данные о шаблоне печатной формы
     * @return сущность PrintTemplateEntity
     */
    public static PrintTemplateEntity build(PrintTemplate template) {
        if (template == null) {
            return null;
        }
        return new PrintTemplateEntity(template.getType(), template.getCopiesNumber(), template.getFileName());
    }
}
