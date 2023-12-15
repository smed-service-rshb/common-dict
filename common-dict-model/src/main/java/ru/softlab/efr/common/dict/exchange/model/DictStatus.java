package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import ru.softlab.efr.common.dict.exchange.model.DictOperation;
import ru.softlab.efr.common.dict.exchange.model.DictType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DictStatus
 */
@Validated
public class DictStatus   {
    @JsonProperty("date")
    private OffsetDateTime date = null;

    @JsonProperty("dictName")
    private DictType dictName = null;

    @JsonProperty("dictOperation")
    private DictOperation dictOperation = null;

    @JsonProperty("fileName")
    private String fileName = null;

    @JsonProperty("size")
    private Long size = null;


    /**
     * Создает пустой экземпляр класса
     */
    public DictStatus() {}

    /**
     * Создает экземпляр класса
     * @param date Дата обновления справочника
     * @param dictName Наименование справочника
     * @param dictOperation Тип события - обновление или проверка
     * @param fileName Наименование файла-источника
     * @param size Размер справочника в байтах
     */
    public DictStatus(OffsetDateTime date, DictType dictName, DictOperation dictOperation, String fileName, Long size) {
        this.date = date;
        this.dictName = dictName;
        this.dictOperation = dictOperation;
        this.fileName = fileName;
        this.size = size;
    }

    /**
     * Дата обновления справочника
    * @return Дата обновления справочника
    **/
    
  @Valid


    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }


    /**
     * Наименование справочника
    * @return Наименование справочника
    **/
    
  @Valid


    public DictType getDictName() {
        return dictName;
    }

    public void setDictName(DictType dictName) {
        this.dictName = dictName;
    }


    /**
     * Тип события - обновление или проверка
    * @return Тип события - обновление или проверка
    **/
    
  @Valid


    public DictOperation getDictOperation() {
        return dictOperation;
    }

    public void setDictOperation(DictOperation dictOperation) {
        this.dictOperation = dictOperation;
    }


    /**
     * Наименование файла-источника
    * @return Наименование файла-источника
    **/
    


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Размер справочника в байтах
    * @return Размер справочника в байтах
    **/
    


    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DictStatus dictStatus = (DictStatus) o;
        return Objects.equals(this.date, dictStatus.date) &&
            Objects.equals(this.dictName, dictStatus.dictName) &&
            Objects.equals(this.dictOperation, dictStatus.dictOperation) &&
            Objects.equals(this.fileName, dictStatus.fileName) &&
            Objects.equals(this.size, dictStatus.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, dictName, dictOperation, fileName, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DictStatus {\n");
        
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    dictName: ").append(toIndentedString(dictName)).append("\n");
        sb.append("    dictOperation: ").append(toIndentedString(dictOperation)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

