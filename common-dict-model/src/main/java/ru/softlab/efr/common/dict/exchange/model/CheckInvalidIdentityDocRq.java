package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.IdentityDocRq;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckInvalidIdentityDocRq
 */
@Validated
public class CheckInvalidIdentityDocRq   {
    @JsonProperty("identityDocs")
    @Valid
    private List<IdentityDocRq> identityDocs = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CheckInvalidIdentityDocRq() {}

    /**
     * Создает экземпляр класса
     * @param identityDocs 
     */
    public CheckInvalidIdentityDocRq(List<IdentityDocRq> identityDocs) {
        this.identityDocs = identityDocs;
    }

    public CheckInvalidIdentityDocRq addIdentityDocsItem(IdentityDocRq identityDocsItem) {
        if (this.identityDocs == null) {
            this.identityDocs = new ArrayList<>();
        }
        this.identityDocs.add(identityDocsItem);
        return this;
    }

    /**
    * Get identityDocs
    * @return 
    **/
    
  @Valid


    public List<IdentityDocRq> getIdentityDocs() {
        return identityDocs;
    }

    public void setIdentityDocs(List<IdentityDocRq> identityDocs) {
        this.identityDocs = identityDocs;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckInvalidIdentityDocRq checkInvalidIdentityDocRq = (CheckInvalidIdentityDocRq) o;
        return Objects.equals(this.identityDocs, checkInvalidIdentityDocRq.identityDocs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityDocs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckInvalidIdentityDocRq {\n");
        
        sb.append("    identityDocs: ").append(toIndentedString(identityDocs)).append("\n");
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

