
package ru.softlab.efr.common.dict.exchange.model.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="ValuteCursOnDate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Vnom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valuteCursOnDate"
})
@XmlRootElement(name = "ValuteData")
public class ValuteData {

    @XmlElement(name = "ValuteCursOnDate")
    protected List<ValuteData.ValuteCursOnDate> valuteCursOnDate;

    /**
     * Gets the value of the valuteCursOnDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuteCursOnDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuteCursOnDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuteData.ValuteCursOnDate }
     * 
     * 
     */
    public List<ValuteData.ValuteCursOnDate> getValuteCursOnDate() {
        if (valuteCursOnDate == null) {
            valuteCursOnDate = new ArrayList<ValuteData.ValuteCursOnDate>();
        }
        return this.valuteCursOnDate;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Vnom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vname",
        "vnom",
        "vcurs",
        "vcode",
        "vchCode"
    })
    public static class ValuteCursOnDate {

        @XmlElement(name = "Vname")
        protected String vname;
        @XmlElement(name = "Vnom")
        protected BigDecimal vnom;
        @XmlElement(name = "Vcurs")
        protected BigDecimal vcurs;
        @XmlElement(name = "Vcode")
        protected Integer vcode;
        @XmlElement(name = "VchCode")
        protected String vchCode;

        /**
         * Gets the value of the vname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVname() {
            return vname;
        }

        /**
         * Sets the value of the vname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVname(String value) {
            this.vname = value;
        }

        /**
         * Gets the value of the vnom property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVnom() {
            return vnom;
        }

        /**
         * Sets the value of the vnom property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVnom(BigDecimal value) {
            this.vnom = value;
        }

        /**
         * Gets the value of the vcurs property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVcurs() {
            return vcurs;
        }

        /**
         * Sets the value of the vcurs property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVcurs(BigDecimal value) {
            this.vcurs = value;
        }

        /**
         * Gets the value of the vcode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getVcode() {
            return vcode;
        }

        /**
         * Sets the value of the vcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVcode(Integer value) {
            this.vcode = value;
        }

        /**
         * Gets the value of the vchCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVchCode() {
            return vchCode;
        }

        /**
         * Sets the value of the vchCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVchCode(String value) {
            this.vchCode = value;
        }

    }

}
