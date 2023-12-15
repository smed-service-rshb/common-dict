package ru.softlab.efr.common.dict.model;

import ru.softlab.efr.common.dict.exchange.model.OperationType;

import javax.persistence.*;

/**
 * Хранимая сущность кассового символа
 *
 * @author bobkov
 * @since 30.07.2018
 */
@Entity
@Table(name = "cash_symbol")
public class CashSymbolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "code")
    private Long code;
    @Column(name = "name")
    private String name;
    @Column(name = "operation_type")
    @Enumerated(value = EnumType.STRING)
    private OperationType operationType;
    @Column(name = "purpose_of_payment")
    private String purposeOfPayment;

    /**
     * Конструктор
     *
     * @param code             Код
     * @param name             Наименование
     * @param operationType    Применение
     * @param purposeOfPayment Назначение платежа
     */
    public CashSymbolEntity(Long code, String name, OperationType operationType, String purposeOfPayment) {
        this.code = code;
        this.name = name;
        this.operationType = operationType;
        this.purposeOfPayment = purposeOfPayment;
    }

    /**
     * Конструктор
     *
     * @param id               Идентификатор
     * @param code             Код
     * @param name             Наименование
     * @param operationType    Применение
     * @param purposeOfPayment Назначение платежа
     */
    public CashSymbolEntity(Long id, Long code, String name, OperationType operationType, String purposeOfPayment) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.operationType = operationType;
        this.purposeOfPayment = purposeOfPayment;
    }

    public CashSymbolEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public String getPurposeOfPayment() {
        return purposeOfPayment;
    }

    public void setPurposeOfPayment(String purposeOfPayment) {
        this.purposeOfPayment = purposeOfPayment;
    }
}
