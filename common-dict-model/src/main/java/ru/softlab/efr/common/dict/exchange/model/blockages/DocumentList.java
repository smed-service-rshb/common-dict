
package ru.softlab.efr.common.dict.exchange.model.blockages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Список документов, удостоверяющих личность
 * 
 * <p>Java class for СписокДокументовТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СписокДокументовТип"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Документ" type="{}ДокументТип" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u043f\u0438\u0441\u043e\u043a\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u043e\u0432\u0422\u0438\u043f", propOrder = {
    "documentList"
})
public class DocumentList {

    @XmlElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
    protected List<Document> documentList;

    /**
     * Gets the value of the documentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocumentList() {
        if (documentList == null) {
            documentList = new ArrayList<Document>();
        }
        return this.documentList;
    }

}
