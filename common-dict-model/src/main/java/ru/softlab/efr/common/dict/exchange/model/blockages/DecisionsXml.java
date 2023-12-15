
package ru.softlab.efr.common.dict.exchange.model.blockages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Список решений МВК
 * 
 * <p>Java class for СписокРешений element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="СписокРешений"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ВерсияФормата" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ДатаСписка" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="ДатаПредыдущегоСписка" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *           &lt;element name="СписокАктуальныхРешений" type="{}СписокАктуальныхРешенийТип"/&gt;
 *           &lt;element name="СписокОтмененныхРешений" type="{}СписокОтмененныхРешенийТип" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formatVersion",
    "listDate",
    "prevListDate",
    "actualDecisionList",
    "rejectedDecisionList"
})
@XmlRootElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0420\u0435\u0448\u0435\u043d\u0438\u0439")
public class DecisionsXml {

    @XmlElement(name = "\u0412\u0435\u0440\u0441\u0438\u044f\u0424\u043e\u0440\u043c\u0430\u0442\u0430", required = true)
    protected String formatVersion;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0421\u043f\u0438\u0441\u043a\u0430", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar listDate;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0435\u0433\u043e\u0421\u043f\u0438\u0441\u043a\u0430")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prevListDate;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0410\u043a\u0442\u0443\u0430\u043b\u044c\u043d\u044b\u0445\u0420\u0435\u0448\u0435\u043d\u0438\u0439", required = true)
    protected ActualDecisionList actualDecisionList;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u041e\u0442\u043c\u0435\u043d\u0435\u043d\u043d\u044b\u0445\u0420\u0435\u0448\u0435\u043d\u0438\u0439")
    protected RejectedDecisionList rejectedDecisionList;

    /**
     * Gets the value of the formatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatVersion(String value) {
        this.formatVersion = value;
    }

    /**
     * Gets the value of the listDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListDate() {
        return listDate;
    }

    /**
     * Sets the value of the listDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListDate(XMLGregorianCalendar value) {
        this.listDate = value;
    }

    /**
     * Gets the value of the prevListDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrevListDate() {
        return prevListDate;
    }

    /**
     * Sets the value of the prevListDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrevListDate(XMLGregorianCalendar value) {
        this.prevListDate = value;
    }

    /**
     * Gets the value of the actualDecisionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDecisionList }
     *     
     */
    public ActualDecisionList getActualDecisionList() {
        return actualDecisionList;
    }

    /**
     * Sets the value of the actualDecisionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDecisionList }
     *     
     */
    public void setActualDecisionList(ActualDecisionList value) {
        this.actualDecisionList = value;
    }

    /**
     * Gets the value of the rejectedDecisionList property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedDecisionList }
     *     
     */
    public RejectedDecisionList getRejectedDecisionList() {
        return rejectedDecisionList;
    }

    /**
     * Sets the value of the rejectedDecisionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedDecisionList }
     *     
     */
    public void setRejectedDecisionList(RejectedDecisionList value) {
        this.rejectedDecisionList = value;
    }

}
