
package ru.softlab.efr.common.dict.exchange.model.blockages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Список отмененных решений
 * 
 * <p>Java class for СписокОтмененныхРешенийТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СписокОтмененныхРешенийТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ОтмененноеРешение" type="{}РешениеТип" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u041e\u0442\u043c\u0435\u043d\u0435\u043d\u043d\u044b\u0445\u0420\u0435\u0448\u0435\u043d\u0438\u0439\u0422\u0438\u043f", propOrder = {
    "rejectedDecision"
})
public class RejectedDecisionList {

    @XmlElement(name = "\u041e\u0442\u043c\u0435\u043d\u0435\u043d\u043d\u043e\u0435\u0420\u0435\u0448\u0435\u043d\u0438\u0435")
    protected List<Decision> rejectedDecision;

    /**
     * Gets the value of the rejectedDecision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectedDecision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectedDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decision }
     * 
     * 
     */
    public List<Decision> getRejectedDecision() {
        if (rejectedDecision == null) {
            rejectedDecision = new ArrayList<Decision>();
        }
        return this.rejectedDecision;
    }

}
