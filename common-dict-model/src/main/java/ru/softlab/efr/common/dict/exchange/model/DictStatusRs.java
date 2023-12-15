package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.DictStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DictStatusRs
 */
@Validated
public class DictStatusRs   {
    @JsonProperty("statusList")
    @Valid
    private List<DictStatus> statusList = null;


    /**
     * Создает пустой экземпляр класса
     */
    public DictStatusRs() {}

    /**
     * Создает экземпляр класса
     * @param statusList 
     */
    public DictStatusRs(List<DictStatus> statusList) {
        this.statusList = statusList;
    }

    public DictStatusRs addStatusListItem(DictStatus statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    /**
    * Get statusList
    * @return 
    **/
    
  @Valid


    public List<DictStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<DictStatus> statusList) {
        this.statusList = statusList;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DictStatusRs dictStatusRs = (DictStatusRs) o;
        return Objects.equals(this.statusList, dictStatusRs.statusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DictStatusRs {\n");
        
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
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

