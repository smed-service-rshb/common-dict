package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.IdentityDocCheckResult;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckInvalidIdentityDocRs
 */
@Validated
public class CheckInvalidIdentityDocRs   {
    @JsonProperty("updateId")
    private String updateId = null;

    @JsonProperty("resultList")
    @Valid
    private List<IdentityDocCheckResult> resultList = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CheckInvalidIdentityDocRs() {}

    /**
     * Создает экземпляр класса
     * @param updateId Идентификатор записи содержащей информацию о файле-справочнике
     * @param resultList 
     */
    public CheckInvalidIdentityDocRs(String updateId, List<IdentityDocCheckResult> resultList) {
        this.updateId = updateId;
        this.resultList = resultList;
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


    public CheckInvalidIdentityDocRs addResultListItem(IdentityDocCheckResult resultListItem) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultListItem);
        return this;
    }

    /**
    * Get resultList
    * @return 
    **/
    
  @Valid


    public List<IdentityDocCheckResult> getResultList() {
        return resultList;
    }

    public void setResultList(List<IdentityDocCheckResult> resultList) {
        this.resultList = resultList;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckInvalidIdentityDocRs checkInvalidIdentityDocRs = (CheckInvalidIdentityDocRs) o;
        return Objects.equals(this.updateId, checkInvalidIdentityDocRs.updateId) &&
            Objects.equals(this.resultList, checkInvalidIdentityDocRs.resultList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateId, resultList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckInvalidIdentityDocRs {\n");
        
        sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
        sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
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

