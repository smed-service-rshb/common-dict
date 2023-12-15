
package ru.softlab.efr.common.dict.exchange.model.blockages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Физическое лицо
 * 
 * <p>Java class for ФЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ФЛТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ФИО"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Фамилия" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Имя" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Отчество" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ФИОЛат" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ДатаРождения" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ГодРождения" type="{}ГодТип" minOccurs="0"/&gt;
 *         &lt;element name="МестоРождения" minOccurs="0"&gt;
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
 *         &lt;element name="СНИЛС" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="СписокДокументов" type="{}СписокДокументовТип" minOccurs="0"/&gt;
 *         &lt;element name="СписокДрНаименований" type="{}СписокДрНаименованийФЛТип" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0424\u041b\u0422\u0438\u043f", propOrder = {
    "fullName",
    "lastName",
    "firstName",
    "middleName",
    "fullNameEng",
    "birthDate",
    "birthYear",
    "birthPlace",
    "inn",
    "snils",
    "documentListContainer",
    "anotherNameList"
})
public class Individual {

    @XmlElement(name = "\u0424\u0418\u041e", required = true)
    protected String fullName;
    @XmlElement(name = "\u0424\u0430\u043c\u0438\u043b\u0438\u044f")
    protected String lastName;
    @XmlElement(name = "\u0418\u043c\u044f")
    protected String firstName;
    @XmlElement(name = "\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e")
    protected String middleName;
    @XmlElement(name = "\u0424\u0418\u041e\u041b\u0430\u0442")
    protected String fullNameEng;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "\u0413\u043e\u0434\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f")
    @XmlSchemaType(name = "string")
    protected Year birthYear;
    @XmlElement(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f")
    protected String birthPlace;
    @XmlElement(name = "\u0418\u041d\u041d")
    protected String inn;
    @XmlElement(name = "\u0421\u041d\u0418\u041b\u0421")
    protected String snils;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u043e\u0432")
    protected DocumentList documentListContainer;
    @XmlElement(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0414\u0440\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0439")
    protected AnotherIndividualNameList anotherNameList;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the fullNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameEng() {
        return fullNameEng;
    }

    /**
     * Sets the value of the fullNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameEng(String value) {
        this.fullNameEng = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthYear property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the value of the birthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setBirthYear(Year value) {
        this.birthYear = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
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
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the documentListContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentList }
     *     
     */
    public DocumentList getDocumentListContainer() {
        return documentListContainer;
    }

    /**
     * Sets the value of the documentListContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentList }
     *     
     */
    public void setDocumentListContainer(DocumentList value) {
        this.documentListContainer = value;
    }

    /**
     * Gets the value of the anotherNameList property.
     * 
     * @return
     *     possible object is
     *     {@link AnotherIndividualNameList }
     *     
     */
    public AnotherIndividualNameList getAnotherNameList() {
        return anotherNameList;
    }

    /**
     * Sets the value of the anotherNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnotherIndividualNameList }
     *     
     */
    public void setAnotherNameList(AnotherIndividualNameList value) {
        this.anotherNameList = value;
    }

}
