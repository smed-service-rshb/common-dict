
package ru.softlab.efr.common.dict.exchange.model.blockages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Общий тип субъекта
 * 
 * <p>Java class for СубъектТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СубъектТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ИдСубъекта"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ТипСубъекта" type="{}СправочникТип"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ФЛ" type="{}ФЛТип" minOccurs="0"/&gt;
 *           &lt;element name="ЮЛ" type="{}ЮЛТип" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="СписокАдресов" type="{}СписокАдресовТип" minOccurs="0"/&gt;
 *         &lt;element name="РешениеПоСубъекту"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Примечание" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0422\u0438\u043f", propOrder = {
    "personId",
    "personKind",
    "individual",
    "legalEntity",
    "addressList",
    "decisionByPerson",
    "comment"
})
public class Person {

    @XmlElement(name = "\u0418\u0434\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0430", required = true)
    protected String personId;
    @XmlElement(name = "\u0422\u0438\u043f\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0430", required = true)
    protected Dictionary personKind;
    @XmlElement(name = "\u0424\u041b")
    protected Individual individual;
    @XmlElement(name = "\u042e\u041b")
    protected LegalEntity legalEntity;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0410\u0434\u0440\u0435\u0441\u043e\u0432")
    protected AddressList addressList;
    @XmlElement(name = "\u0420\u0435\u0448\u0435\u043d\u0438\u0435\u041f\u043e\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0443", required = true)
    protected String decisionByPerson;
    @XmlElement(name = "\u041f\u0440\u0438\u043c\u0435\u0447\u0430\u043d\u0438\u0435")
    protected String comment;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the personKind property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getPersonKind() {
        return personKind;
    }

    /**
     * Sets the value of the personKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setPersonKind(Dictionary value) {
        this.personKind = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link Individual }
     *     
     */
    public Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Individual }
     *     
     */
    public void setIndividual(Individual value) {
        this.individual = value;
    }

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setLegalEntity(LegalEntity value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressList }
     *     
     */
    public AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressList }
     *     
     */
    public void setAddressList(AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the decisionByPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionByPerson() {
        return decisionByPerson;
    }

    /**
     * Sets the value of the decisionByPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionByPerson(String value) {
        this.decisionByPerson = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
