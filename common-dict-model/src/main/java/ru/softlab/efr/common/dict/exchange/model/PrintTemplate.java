package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Шаблон печатной формы
 */
@Validated
public class PrintTemplate   {
    @JsonProperty("type")
    private String type = null;

    @JsonProperty("copiesNumber")
    private Integer copiesNumber = null;

    @JsonProperty("fileName")
    private String fileName = null;


    /**
     * Создает пустой экземпляр класса
     */
    public PrintTemplate() {}

    /**
     * Создает экземпляр класса
     * @param type Тип печатной формы
     * @param copiesNumber Количество экземпляров при печати
     * @param fileName Имя файла
     */
    public PrintTemplate(String type, Integer copiesNumber, String fileName) {
        this.type = type;
        this.copiesNumber = copiesNumber;
        this.fileName = fileName;
    }

    /**
     * Тип печатной формы
    * @return Тип печатной формы
    **/
    


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     * Количество экземпляров при печати
    * @return Количество экземпляров при печати
    **/
    


    public Integer getCopiesNumber() {
        return copiesNumber;
    }

    public void setCopiesNumber(Integer copiesNumber) {
        this.copiesNumber = copiesNumber;
    }


    /**
     * Имя файла
    * @return Имя файла
    **/
    


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrintTemplate printTemplate = (PrintTemplate) o;
        return Objects.equals(this.type, printTemplate.type) &&
            Objects.equals(this.copiesNumber, printTemplate.copiesNumber) &&
            Objects.equals(this.fileName, printTemplate.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, copiesNumber, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrintTemplate {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    copiesNumber: ").append(toIndentedString(copiesNumber)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

