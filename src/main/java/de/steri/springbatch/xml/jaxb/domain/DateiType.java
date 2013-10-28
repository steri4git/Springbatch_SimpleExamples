//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.11 at 03:47:19 PM CEST 
//


package de.steri.springbatch.xml.jaxb.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DateiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ersteller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personen" type="{http://www.steri.de/xml/jaxb}PersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateiType", propOrder = {
    "datum",
    "ersteller",
    "personen"
})
public class DateiType {

    @XmlElement(required = true)
    protected String datum;
    @XmlElement(required = true)
    protected String ersteller;
    protected List<PersonType> personen;

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the ersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the value of the ersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErsteller(String value) {
        this.ersteller = value;
    }

    /**
     * Gets the value of the personen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPersonen() {
        if (personen == null) {
            personen = new ArrayList<PersonType>();
        }
        return this.personen;
    }

}
