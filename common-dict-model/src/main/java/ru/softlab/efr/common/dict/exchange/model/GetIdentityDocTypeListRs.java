package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.IdentityDocType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetIdentityDocTypeListRs
 */
@Validated
public class GetIdentityDocTypeListRs   {
    @JsonProperty("identityDocTypes")
    @Valid
    private List<IdentityDocType> identityDocTypes = null;


    /**
     * Создает пустой экземпляр класса
     */
    public GetIdentityDocTypeListRs() {}

    /**
     * Создает экземпляр класса
     * @param identityDocTypes 
     */
    public GetIdentityDocTypeListRs(List<IdentityDocType> identityDocTypes) {
        this.identityDocTypes = identityDocTypes;
    }

    public GetIdentityDocTypeListRs addIdentityDocTypesItem(IdentityDocType identityDocTypesItem) {
        if (this.identityDocTypes == null) {
            this.identityDocTypes = new ArrayList<>();
        }
        this.identityDocTypes.add(identityDocTypesItem);
        return this;
    }

    /**
    * Get identityDocTypes
    * @return 
    **/
    
  @Valid


    public List<IdentityDocType> getIdentityDocTypes() {
        return identityDocTypes;
    }

    public void setIdentityDocTypes(List<IdentityDocType> identityDocTypes) {
        this.identityDocTypes = identityDocTypes;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetIdentityDocTypeListRs getIdentityDocTypeListRs = (GetIdentityDocTypeListRs) o;
        return Objects.equals(this.identityDocTypes, getIdentityDocTypeListRs.identityDocTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityDocTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetIdentityDocTypeListRs {\n");
        
        sb.append("    identityDocTypes: ").append(toIndentedString(identityDocTypes)).append("\n");
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

