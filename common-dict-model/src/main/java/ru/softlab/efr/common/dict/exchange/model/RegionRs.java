package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.softlab.efr.common.dict.exchange.model.Region;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegionRs
 */
@Validated
public class RegionRs   {
    @JsonProperty("regions")
    @Valid
    private List<Region> regions = null;


    /**
     * Создает пустой экземпляр класса
     */
    public RegionRs() {}

    /**
     * Создает экземпляр класса
     * @param regions 
     */
    public RegionRs(List<Region> regions) {
        this.regions = regions;
    }

    public RegionRs addRegionsItem(Region regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    /**
    * Get regions
    * @return 
    **/
    
  @Valid


    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionRs regionRs = (RegionRs) o;
        return Objects.equals(this.regions, regionRs.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionRs {\n");
        
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

