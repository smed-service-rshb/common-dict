package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.AbstractDictItem;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetAbstractDictRs
 */
@Validated
public class GetAbstractDictRs   {
    @JsonProperty("dictItems")
    @Valid
    private List<AbstractDictItem> dictItems = null;


    /**
     * Создает пустой экземпляр класса
     */
    public GetAbstractDictRs() {}

    /**
     * Создает экземпляр класса
     * @param dictItems 
     */
    public GetAbstractDictRs(List<AbstractDictItem> dictItems) {
        this.dictItems = dictItems;
    }

    public GetAbstractDictRs addDictItemsItem(AbstractDictItem dictItemsItem) {
        if (this.dictItems == null) {
            this.dictItems = new ArrayList<>();
        }
        this.dictItems.add(dictItemsItem);
        return this;
    }

    /**
    * Get dictItems
    * @return 
    **/
    
  @Valid


    public List<AbstractDictItem> getDictItems() {
        return dictItems;
    }

    public void setDictItems(List<AbstractDictItem> dictItems) {
        this.dictItems = dictItems;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAbstractDictRs getAbstractDictRs = (GetAbstractDictRs) o;
        return Objects.equals(this.dictItems, getAbstractDictRs.dictItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAbstractDictRs {\n");
        
        sb.append("    dictItems: ").append(toIndentedString(dictItems)).append("\n");
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

