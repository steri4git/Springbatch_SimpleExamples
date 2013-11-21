//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.11 at 03:47:19 PM CEST 
//


package de.steri.springbatch.xml.jaxb.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.steri.xml.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DateiType_QNAME = new QName("http://www.steri.de/xml/jaxb", "dateiType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.steri.xml.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DateiType }
     * 
     */
    public DateiType createDateiType() {
        return new DateiType();
    }

    /**
     * Create an instance of {@link AdresseType }
     * 
     */
    public AdresseType createAdresseType() {
        return new AdresseType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.steri.de/xml/jaxb", name = "dateiType")
    public JAXBElement<DateiType> createDateiType(DateiType value) {
        return new JAXBElement<DateiType>(_DateiType_QNAME, DateiType.class, null, value);
    }

}
