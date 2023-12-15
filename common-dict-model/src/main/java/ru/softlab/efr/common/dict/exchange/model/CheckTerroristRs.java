package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.CheckTerroristResult;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckTerroristRs
 */
@Validated
public class CheckTerroristRs   {
    @JsonProperty("updateId")
    private String updateId = null;

    @JsonProperty("citizens")
    @Valid
    private List<CheckTerroristResult> citizens = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CheckTerroristRs() {}

    /**
     * Создает экземпляр класса
     * @param updateId Идентификатор записи содержащей информацию о файле-справочнике
     * @param citizens 
     */
    public CheckTerroristRs(String updateId, List<CheckTerroristResult> citizens) {
        this.updateId = updateId;
        this.citizens = citizens;
    }

    /**
     * Идентификатор записи содержащей информацию о файле-справочнике
    * @return Идентификатор записи содержащей информацию о файле-справочнике
    **/
    


    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }


    public CheckTerroristRs addCitizensItem(CheckTerroristResult citizensItem) {
        if (this.citizens == null) {
            this.citizens = new ArrayList<>();
        }
        this.citizens.add(citizensItem);
        return this;
    }

    /**
    * Get citizens
    * @return 
    **/
    
  @Valid


    public List<CheckTerroristResult> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<CheckTerroristResult> citizens) {
        this.citizens = citizens;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckTerroristRs checkTerroristRs = (CheckTerroristRs) o;
        return Objects.equals(this.updateId, checkTerroristRs.updateId) &&
            Objects.equals(this.citizens, checkTerroristRs.citizens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateId, citizens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTerroristRs {\n");
        
        sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
        sb.append("    citizens: ").append(toIndentedString(citizens)).append("\n");
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

