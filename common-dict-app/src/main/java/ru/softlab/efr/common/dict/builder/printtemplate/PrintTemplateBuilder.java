package ru.softlab.efr.common.dict.builder.printtemplate;

import ru.softlab.efr.common.dict.exchange.model.PrintTemplate;
import ru.softlab.efr.common.dict.model.PrintTemplateEntity;

/**
 * Класс для построения данных о шаблоне печатной формы
 */
public class PrintTemplateBuilder {

    /**
     * Построение данных о шаблоне печатной формы
     *
     * @param templateEntity хранимые данные о шаблоне печатной формы
     * @return данные о шаблоне печатной формы
     */
    public static PrintTemplate build(PrintTemplateEntity templateEntity) {
        if (templateEntity == null) {
            return null;
        }
        return new PrintTemplate(templateEntity.getType(), templateEntity.getCopiesNumber(), templateEntity.getFilename());
    }
}
