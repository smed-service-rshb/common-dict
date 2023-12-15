
package ru.softlab.efr.common.dict.exchange.model.blockages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for РешениеТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="РешениеТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ТипРешения" type="{}СправочникТип"/&gt;
 *         &lt;element name="НомерРешения"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ДатаРешения" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Орган"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ВидРешения" type="{}СправочникТип"/&gt;
 *         &lt;element name="СписокСубъектов" type="{}СписокСубъектовТип" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0420\u0435\u0448\u0435\u043d\u0438\u0435\u0422\u0438\u043f", propOrder = {
    "decisionType",
    "decisionNumber",
    "decisionDate",
    "agency",
    "decisionKind",
    "personListContainer"
})
public class Decision {

    @XmlElement(name = "\u0422\u0438\u043f\u0420\u0435\u0448\u0435\u043d\u0438\u044f", required = true)
    protected Dictionary decisionType;
    @XmlElement(name = "\u041d\u043e\u043c\u0435\u0440\u0420\u0435\u0448\u0435\u043d\u0438\u044f", required = true)
    protected String decisionNumber;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0448\u0435\u043d\u0438\u044f", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    @XmlElement(name = "\u041e\u0440\u0433\u0430\u043d", required = true)
    protected String agency;
    @XmlElement(name = "\u0412\u0438\u0434\u0420\u0435\u0448\u0435\u043d\u0438\u044f", required = true)
    protected Dictionary decisionKind;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u043e\u0432")
    protected ListPerson personListContainer;

    /**
     * Gets the value of the decisionType property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getDecisionType() {
        return decisionType;
    }

    /**
     * Sets the value of the decisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setDecisionType(Dictionary value) {
        this.decisionType = value;
    }

    /**
     * Gets the value of the decisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Sets the value of the decisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNumber(String value) {
        this.decisionNumber = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the decisionKind property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getDecisionKind() {
        return decisionKind;
    }

    /**
     * Sets the value of the decisionKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setDecisionKind(Dictionary value) {
        this.decisionKind = value;
    }

    /**
     * Gets the value of the personListContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ListPerson }
     *     
     */
    public ListPerson getPersonListContainer() {
        return personListContainer;
    }

    /**
     * Sets the value of the personListContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPerson }
     *     
     */
    public void setPersonListContainer(ListPerson value) {
        this.personListContainer = value;
    }

}
