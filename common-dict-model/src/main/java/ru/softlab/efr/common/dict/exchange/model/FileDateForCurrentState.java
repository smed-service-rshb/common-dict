package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileDateForCurrentState
 */
@Validated
public class FileDateForCurrentState   {
    @JsonProperty("fileDate")
    private String fileDate = null;


    /**
     * Создает пустой экземпляр класса
     */
    public FileDateForCurrentState() {}

    /**
     * Создает экземпляр класса
     * @param fileDate 
     */
    public FileDateForCurrentState(String fileDate) {
        this.fileDate = fileDate;
    }

    /**
    * Get fileDate
    * @return 
    **/
    


    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileDateForCurrentState fileDateForCurrentState = (FileDateForCurrentState) o;
        return Objects.equals(this.fileDate, fileDateForCurrentState.fileDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileDateForCurrentState {\n");
        
        sb.append("    fileDate: ").append(toIndentedString(fileDate)).append("\n");
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

