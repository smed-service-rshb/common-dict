package ru.softlab.efr.common.dict.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Хранимая сущность шаблона печатной формы (без бинарного контента)
 */
@Entity
@Table(name = "print_templates")
public class PrintTemplateEntity {

    @Id
    private String type;

    @Column(name = "copies_number")
    private int copiesNumber;
    @Column(name = "file_name")
    private String filename;

    /**
     * Конструктор по умолчанию
     */
    public PrintTemplateEntity() {
    }

    /**
     * Конструктор
     *
     * @param type         тип формы
     * @param copiesNumber количество копий
     * @param filename     имя файла
     */
    public PrintTemplateEntity(String type, int copiesNumber, String filename) {
        this.type = type;
        this.copiesNumber = copiesNumber;
        this.filename = filename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCopiesNumber() {
        return copiesNumber;
    }

    public void setCopiesNumber(int copiesNumber) {
        this.copiesNumber = copiesNumber;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrintTemplateEntity entity = (PrintTemplateEntity) o;
        return Objects.equals(this.type, entity.type) &&
                Objects.equals(this.filename, entity.filename) &&
                Objects.equals(this.copiesNumber, entity.copiesNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, filename, copiesNumber);
    }
}


