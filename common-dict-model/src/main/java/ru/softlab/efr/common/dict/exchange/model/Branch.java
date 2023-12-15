package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Филиал
 */
@Validated
public class Branch   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("simpleName")
    private String simpleName = null;

    @JsonProperty("officialName")
    private String officialName = null;


    /**
     * Создает пустой экземпляр класса
     */
    public Branch() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param code Код филиала
     * @param simpleName Краткое наименование
     * @param officialName Официальное наименование
     */
    public Branch(Long id, String code, String simpleName, String officialName) {
        this.id = id;
        this.code = code;
        this.simpleName = simpleName;
        this.officialName = officialName;
    }

    /**
     * Id записи
    * @return Id записи
    **/
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Код филиала
    * @return Код филиала
    **/
    


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Краткое наименование
    * @return Краткое наименование
    **/
    


    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }


    /**
     * Официальное наименование
    * @return Официальное наименование
    **/
    


    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Branch branch = (Branch) o;
        return Objects.equals(this.id, branch.id) &&
            Objects.equals(this.code, branch.code) &&
            Objects.equals(this.simpleName, branch.simpleName) &&
            Objects.equals(this.officialName, branch.officialName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, simpleName, officialName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Branch {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    simpleName: ").append(toIndentedString(simpleName)).append("\n");
        sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
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

