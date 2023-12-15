
package ru.softlab.efr.common.dict.exchange.model.blockages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Юридическое лицо
 * 
 * <p>Java class for ЮЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ЮЛТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Наименование"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="НаименованиеЛат" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="МестоРегистрации" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ИНН" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ОГРН" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="СписокДрНаименований" type="{}СписокДрНаименованийЮЛТип" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u042e\u041b\u0422\u0438\u043f", propOrder = {
    "name",
    "nameEng",
    "regDate",
    "regPlace",
    "inn",
    "ogrn",
    "anotherNameList"
})
public class LegalEntity {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String name;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435\u041b\u0430\u0442")
    protected String nameEng;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDate;
    @XmlElement(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438")
    protected String regPlace;
    @XmlElement(name = "\u0418\u041d\u041d")
    protected String inn;
    @XmlElement(name = "\u041e\u0413\u0420\u041d")
    protected String ogrn;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0414\u0440\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0439")
    protected AnotherLegalEntityNameList anotherNameList;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEng() {
        return nameEng;
    }

    /**
     * Sets the value of the nameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEng(String value) {
        this.nameEng = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the regPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegPlace() {
        return regPlace;
    }

    /**
     * Sets the value of the regPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegPlace(String value) {
        this.regPlace = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the anotherNameList property.
     * 
     * @return
     *     possible object is
     *     {@link AnotherLegalEntityNameList }
     *     
     */
    public AnotherLegalEntityNameList getAnotherNameList() {
        return anotherNameList;
    }

    /**
     * Sets the value of the anotherNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnotherLegalEntityNameList }
     *     
     */
    public void setAnotherNameList(AnotherLegalEntityNameList value) {
        this.anotherNameList = value;
    }

}
