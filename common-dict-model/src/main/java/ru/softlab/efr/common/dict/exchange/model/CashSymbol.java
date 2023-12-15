package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ru.softlab.efr.common.dict.exchange.model.OperationType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Кассовый символ
 */
@Validated
public class CashSymbol   {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("code")
    private Long code = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("operationType")
    private OperationType operationType = null;

    @JsonProperty("purposeOfPayment")
    private String purposeOfPayment = null;


    /**
     * Создает пустой экземпляр класса
     */
    public CashSymbol() {}

    /**
     * Создает экземпляр класса
     * @param id Id записи
     * @param code Код
     * @param name Наименование
     * @param operationType Применение
     * @param purposeOfPayment Назначение платежа
     */
    public CashSymbol(Long id, Long code, String name, OperationType operationType, String purposeOfPayment) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.operationType = operationType;
        this.purposeOfPayment = purposeOfPayment;
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
     * Код
    * @return Код
    **/
    


    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }


    /**
     * Наименование
    * @return Наименование
    **/
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Применение
    * @return Применение
    **/
    
  @Valid


    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Назначение платежа
    * @return Назначение платежа
    **/
    


    public String getPurposeOfPayment() {
        return purposeOfPayment;
    }

    public void setPurposeOfPayment(String purposeOfPayment) {
        this.purposeOfPayment = purposeOfPayment;
    }


  @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CashSymbol cashSymbol = (CashSymbol) o;
        return Objects.equals(this.id, cashSymbol.id) &&
            Objects.equals(this.code, cashSymbol.code) &&
            Objects.equals(this.name, cashSymbol.name) &&
            Objects.equals(this.operationType, cashSymbol.operationType) &&
            Objects.equals(this.purposeOfPayment, cashSymbol.purposeOfPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, operationType, purposeOfPayment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CashSymbol {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    purposeOfPayment: ").append(toIndentedString(purposeOfPayment)).append("\n");
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

