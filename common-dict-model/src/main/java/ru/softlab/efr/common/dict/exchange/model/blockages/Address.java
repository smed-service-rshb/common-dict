
package ru.softlab.efr.common.dict.exchange.model.blockages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес субъекта
 * 
 * <p>Java class for АдресТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдресТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="НормАдрес" type="{}СправочникТип" minOccurs="0"/&gt;
 *         &lt;element name="ТипАдреса" type="{}СправочникТип"/&gt;
 *         &lt;element name="ТекстАдреса"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ИдентификаторФИАС" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="36"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="УровеньАдреснОбъекта" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Страна" type="{}СтранаТип" minOccurs="0"/&gt;
 *         &lt;element name="Индекс" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ОКАТО" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{1,11}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Регион" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="АвтономныйОкруг" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Район" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Город" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ВнутригородскРайон" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="НаселПункт" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Улица" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Дом" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Корпус" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Строение" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Помещение" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
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
@XmlType(name = "\u0410\u0434\u0440\u0435\u0441\u0422\u0438\u043f", propOrder = {
    "normAddressFlag",
    "addressKind",
    "addressRaw",
    "fiasId",
    "addressObjectLevel",
    "country",
    "postCode",
    "okato",
    "region",
    "autonomousArea",
    "area",
    "city",
    "internalCityArea",
    "settlement",
    "street",
    "house",
    "housing",
    "building",
    "flat"
})
public class Address {

    @XmlElement(name = "\u041d\u043e\u0440\u043c\u0410\u0434\u0440\u0435\u0441")
    protected Dictionary normAddressFlag;
    @XmlElement(name = "\u0422\u0438\u043f\u0410\u0434\u0440\u0435\u0441\u0430", required = true)
    protected Dictionary addressKind;
    @XmlElement(name = "\u0422\u0435\u043a\u0441\u0442\u0410\u0434\u0440\u0435\u0441\u0430", required = true)
    protected String addressRaw;
    @XmlElement(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0424\u0418\u0410\u0421")
    protected String fiasId;
    @XmlElement(name = "\u0423\u0440\u043e\u0432\u0435\u043d\u044c\u0410\u0434\u0440\u0435\u0441\u043d\u041e\u0431\u044a\u0435\u043a\u0442\u0430")
    protected Integer addressObjectLevel;
    @XmlElement(name = "\u0421\u0442\u0440\u0430\u043d\u0430")
    protected Country country;
    @XmlElement(name = "\u0418\u043d\u0434\u0435\u043a\u0441")
    protected String postCode;
    @XmlElement(name = "\u041e\u041a\u0410\u0422\u041e")
    protected String okato;
    @XmlElement(name = "\u0420\u0435\u0433\u0438\u043e\u043d")
    protected String region;
    @XmlElement(name = "\u0410\u0432\u0442\u043e\u043d\u043e\u043c\u043d\u044b\u0439\u041e\u043a\u0440\u0443\u0433")
    protected String autonomousArea;
    @XmlElement(name = "\u0420\u0430\u0439\u043e\u043d")
    protected String area;
    @XmlElement(name = "\u0413\u043e\u0440\u043e\u0434")
    protected String city;
    @XmlElement(name = "\u0412\u043d\u0443\u0442\u0440\u0438\u0433\u043e\u0440\u043e\u0434\u0441\u043a\u0420\u0430\u0439\u043e\u043d")
    protected String internalCityArea;
    @XmlElement(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442")
    protected String settlement;
    @XmlElement(name = "\u0423\u043b\u0438\u0446\u0430")
    protected String street;
    @XmlElement(name = "\u0414\u043e\u043c")
    protected String house;
    @XmlElement(name = "\u041a\u043e\u0440\u043f\u0443\u0441")
    protected String housing;
    @XmlElement(name = "\u0421\u0442\u0440\u043e\u0435\u043d\u0438\u0435")
    protected String building;
    @XmlElement(name = "\u041f\u043e\u043c\u0435\u0449\u0435\u043d\u0438\u0435")
    protected String flat;

    /**
     * Gets the value of the normAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getNormAddressFlag() {
        return normAddressFlag;
    }

    /**
     * Sets the value of the normAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setNormAddressFlag(Dictionary value) {
        this.normAddressFlag = value;
    }

    /**
     * Gets the value of the addressKind property.
     * 
     * @return
     *     possible object is
     *     {@link Dictionary }
     *     
     */
    public Dictionary getAddressKind() {
        return addressKind;
    }

    /**
     * Sets the value of the addressKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dictionary }
     *     
     */
    public void setAddressKind(Dictionary value) {
        this.addressKind = value;
    }

    /**
     * Gets the value of the addressRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRaw() {
        return addressRaw;
    }

    /**
     * Sets the value of the addressRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRaw(String value) {
        this.addressRaw = value;
    }

    /**
     * Gets the value of the fiasId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasId() {
        return fiasId;
    }

    /**
     * Sets the value of the fiasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiasId(String value) {
        this.fiasId = value;
    }

    /**
     * Gets the value of the addressObjectLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressObjectLevel() {
        return addressObjectLevel;
    }

    /**
     * Sets the value of the addressObjectLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressObjectLevel(Integer value) {
        this.addressObjectLevel = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkato() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkato(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the autonomousArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutonomousArea() {
        return autonomousArea;
    }

    /**
     * Sets the value of the autonomousArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutonomousArea(String value) {
        this.autonomousArea = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the internalCityArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCityArea() {
        return internalCityArea;
    }

    /**
     * Sets the value of the internalCityArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCityArea(String value) {
        this.internalCityArea = value;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlement(String value) {
        this.settlement = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the housing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousing() {
        return housing;
    }

    /**
     * Sets the value of the housing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousing(String value) {
        this.housing = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlat(String value) {
        this.flat = value;
    }

}
