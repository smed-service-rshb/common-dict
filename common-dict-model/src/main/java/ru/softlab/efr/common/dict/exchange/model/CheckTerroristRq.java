package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.PersonnelData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckTerroristRq
 */
@Validated
public class CheckTerroristRq   {
    @JsonProperty("citizens")
    @Valid
    private List<PersonnelData> citizens = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CheckTerroristRq() {}

    /**
     * Создает экземпляр класса
     * @param citizens 
     */
    public CheckTerroristRq(List<PersonnelData> citizens) {
        this.citizens = citizens;
    }

    public CheckTerroristRq addCitizensItem(PersonnelData citizensItem) {
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


    public List<PersonnelData> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<PersonnelData> citizens) {
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
        CheckTerroristRq checkTerroristRq = (CheckTerroristRq) o;
        return Objects.equals(this.citizens, checkTerroristRq.citizens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(citizens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTerroristRq {\n");
        
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

