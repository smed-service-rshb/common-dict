
package ru.softlab.efr.common.dict.exchange.model.blockages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Список других наименований физического лица
 * 
 * <p>Java class for СписокДрНаименованийФЛТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СписокДрНаименованийФЛТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ДрНаименование" type="{}ДрНаименованиеФЛТип" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0414\u0440\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0439\u0424\u041b\u0422\u0438\u043f", propOrder = {
    "anotherName"
})
public class AnotherIndividualNameList {

    @XmlElement(name = "\u0414\u0440\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected List<AnotherIndividualName> anotherName;

    /**
     * Gets the value of the anotherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anotherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnotherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnotherIndividualName }
     * 
     * 
     */
    public List<AnotherIndividualName> getAnotherName() {
        if (anotherName == null) {
            anotherName = new ArrayList<AnotherIndividualName>();
        }
        return this.anotherName;
    }

}
