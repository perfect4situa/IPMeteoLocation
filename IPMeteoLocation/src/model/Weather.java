//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.13 alle 02:42:44 PM CET 
//


package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="location">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="altitude" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="geobase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="geobaseid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meta">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="calctime" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="nextupdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sun">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forecast">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="time" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="symbol">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="var" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="precipitation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="windDirection">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="deg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="windSpeed">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="mps" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="temperature">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pressure">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="humidity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="clouds">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="all" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "credit",
    "meta",
    "sun",
    "forecast"
})
@XmlRootElement(name = "weatherdata")
public class Weather {

    @XmlElement(required = true)
    protected Weather.Location location;
    @XmlElement(required = true)
    protected String credit;
    @XmlElement(required = true)
    protected Weather.Meta meta;
    @XmlElement(required = true)
    protected Weather.Sun sun;
    @XmlElement(required = true)
    protected Weather.Forecast forecast;

    /**
     * Recupera il valore della propriet� location.
     * 
     * @return
     *     possible object is
     *     {@link Weather.Location }
     *     
     */
    public Weather.Location getLocation() {
        return location;
    }

    /**
     * Imposta il valore della propriet� location.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather.Location }
     *     
     */
    public void setLocation(Weather.Location value) {
        this.location = value;
    }

    /**
     * Recupera il valore della propriet� credit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredit() {
        return credit;
    }

    /**
     * Imposta il valore della propriet� credit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredit(String value) {
        this.credit = value;
    }

    /**
     * Recupera il valore della propriet� meta.
     * 
     * @return
     *     possible object is
     *     {@link Weather.Meta }
     *     
     */
    public Weather.Meta getMeta() {
        return meta;
    }

    /**
     * Imposta il valore della propriet� meta.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather.Meta }
     *     
     */
    public void setMeta(Weather.Meta value) {
        this.meta = value;
    }

    /**
     * Recupera il valore della propriet� sun.
     * 
     * @return
     *     possible object is
     *     {@link Weather.Sun }
     *     
     */
    public Weather.Sun getSun() {
        return sun;
    }

    /**
     * Imposta il valore della propriet� sun.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather.Sun }
     *     
     */
    public void setSun(Weather.Sun value) {
        this.sun = value;
    }

    /**
     * Recupera il valore della propriet� forecast.
     * 
     * @return
     *     possible object is
     *     {@link Weather.Forecast }
     *     
     */
    public Weather.Forecast getForecast() {
        return forecast;
    }

    /**
     * Imposta il valore della propriet� forecast.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather.Forecast }
     *     
     */
    public void setForecast(Weather.Forecast value) {
        this.forecast = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="time" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="symbol">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="var" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="precipitation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="windDirection">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="deg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="windSpeed">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="mps" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="temperature">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pressure">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="humidity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="clouds">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="all" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "time"
    })
    public static class Forecast {

        @XmlElement(required = true)
        protected List<Weather.Forecast.Time> time;

        /**
         * Gets the value of the time property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the time property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Weather.Forecast.Time }
         * 
         * 
         */
        public List<Weather.Forecast.Time> getTime() {
            if (time == null) {
                time = new ArrayList<Weather.Forecast.Time>();
            }
            return this.time;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="symbol">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="var" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="precipitation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="windDirection">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="deg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="windSpeed">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="mps" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="temperature">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pressure">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="humidity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="clouds">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="all" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "symbol",
            "precipitation",
            "windDirection",
            "windSpeed",
            "temperature",
            "pressure",
            "humidity",
            "clouds"
        })
        public static class Time {

            @XmlElement(required = true)
            protected Weather.Forecast.Time.Symbol symbol;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.Precipitation precipitation;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.WindDirection windDirection;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.WindSpeed windSpeed;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.Temperature temperature;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.Pressure pressure;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.Humidity humidity;
            @XmlElement(required = true)
            protected Weather.Forecast.Time.Clouds clouds;
            @XmlAttribute(name = "from")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar from;
            @XmlAttribute(name = "to")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar to;

            /**
             * Recupera il valore della propriet� symbol.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.Symbol }
             *     
             */
            public Weather.Forecast.Time.Symbol getSymbol() {
                return symbol;
            }

            /**
             * Imposta il valore della propriet� symbol.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.Symbol }
             *     
             */
            public void setSymbol(Weather.Forecast.Time.Symbol value) {
                this.symbol = value;
            }

            /**
             * Recupera il valore della propriet� precipitation.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.Precipitation }
             *     
             */
            public Weather.Forecast.Time.Precipitation getPrecipitation() {
                return precipitation;
            }

            /**
             * Imposta il valore della propriet� precipitation.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.Precipitation }
             *     
             */
            public void setPrecipitation(Weather.Forecast.Time.Precipitation value) {
                this.precipitation = value;
            }

            /**
             * Recupera il valore della propriet� windDirection.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.WindDirection }
             *     
             */
            public Weather.Forecast.Time.WindDirection getWindDirection() {
                return windDirection;
            }

            /**
             * Imposta il valore della propriet� windDirection.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.WindDirection }
             *     
             */
            public void setWindDirection(Weather.Forecast.Time.WindDirection value) {
                this.windDirection = value;
            }

            /**
             * Recupera il valore della propriet� windSpeed.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.WindSpeed }
             *     
             */
            public Weather.Forecast.Time.WindSpeed getWindSpeed() {
                return windSpeed;
            }

            /**
             * Imposta il valore della propriet� windSpeed.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.WindSpeed }
             *     
             */
            public void setWindSpeed(Weather.Forecast.Time.WindSpeed value) {
                this.windSpeed = value;
            }

            /**
             * Recupera il valore della propriet� temperature.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.Temperature }
             *     
             */
            public Weather.Forecast.Time.Temperature getTemperature() {
                return temperature;
            }

            /**
             * Imposta il valore della propriet� temperature.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.Temperature }
             *     
             */
            public void setTemperature(Weather.Forecast.Time.Temperature value) {
                this.temperature = value;
            }

            /**
             * Recupera il valore della propriet� pressure.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.Pressure }
             *     
             */
            public Weather.Forecast.Time.Pressure getPressure() {
                return pressure;
            }

            /**
             * Imposta il valore della propriet� pressure.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.Pressure }
             *     
             */
            public void setPressure(Weather.Forecast.Time.Pressure value) {
                this.pressure = value;
            }

            /**
             * Recupera il valore della propriet� humidity.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.Humidity }
             *     
             */
            public Weather.Forecast.Time.Humidity getHumidity() {
                return humidity;
            }

            /**
             * Imposta il valore della propriet� humidity.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.Humidity }
             *     
             */
            public void setHumidity(Weather.Forecast.Time.Humidity value) {
                this.humidity = value;
            }

            /**
             * Recupera il valore della propriet� clouds.
             * 
             * @return
             *     possible object is
             *     {@link Weather.Forecast.Time.Clouds }
             *     
             */
            public Weather.Forecast.Time.Clouds getClouds() {
                return clouds;
            }

            /**
             * Imposta il valore della propriet� clouds.
             * 
             * @param value
             *     allowed object is
             *     {@link Weather.Forecast.Time.Clouds }
             *     
             */
            public void setClouds(Weather.Forecast.Time.Clouds value) {
                this.clouds = value;
            }

            /**
             * Recupera il valore della propriet� from.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFrom() {
                return from;
            }

            /**
             * Imposta il valore della propriet� from.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFrom(XMLGregorianCalendar value) {
                this.from = value;
            }

            /**
             * Recupera il valore della propriet� to.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTo() {
                return to;
            }

            /**
             * Imposta il valore della propriet� to.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTo(XMLGregorianCalendar value) {
                this.to = value;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="all" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Clouds {

                @XmlAttribute(name = "value")
                protected String value;
                @XmlAttribute(name = "all")
                protected Integer all;
                @XmlAttribute(name = "unit")
                protected String unit;

                /**
                 * Recupera il valore della propriet� value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Imposta il valore della propriet� value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Recupera il valore della propriet� all.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAll() {
                    return all;
                }

                /**
                 * Imposta il valore della propriet� all.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAll(Integer value) {
                    this.all = value;
                }

                /**
                 * Recupera il valore della propriet� unit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Imposta il valore della propriet� unit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Humidity {

                @XmlAttribute(name = "value")
                protected Integer value;
                @XmlAttribute(name = "unit")
                protected String unit;

                /**
                 * Recupera il valore della propriet� value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Imposta il valore della propriet� value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

                /**
                 * Recupera il valore della propriet� unit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Imposta il valore della propriet� unit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Precipitation {

                @XmlAttribute(name = "unit")
                protected String unit;
                @XmlAttribute(name = "value")
                protected BigDecimal value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Recupera il valore della propriet� unit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Imposta il valore della propriet� unit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

                /**
                 * Recupera il valore della propriet� value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Imposta il valore della propriet� value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Recupera il valore della propriet� type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Imposta il valore della propriet� type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Pressure {

                @XmlAttribute(name = "unit")
                protected String unit;
                @XmlAttribute(name = "value")
                protected BigDecimal value;

                /**
                 * Recupera il valore della propriet� unit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Imposta il valore della propriet� unit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

                /**
                 * Recupera il valore della propriet� value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Imposta il valore della propriet� value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="var" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Symbol {

                @XmlAttribute(name = "number")
                protected Integer number;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "var")
                protected String var;

                /**
                 * Recupera il valore della propriet� number.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNumber() {
                    return number;
                }

                /**
                 * Imposta il valore della propriet� number.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNumber(Integer value) {
                    this.number = value;
                }

                /**
                 * Recupera il valore della propriet� name.
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
                 * Imposta il valore della propriet� name.
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
                 * Recupera il valore della propriet� var.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVar() {
                    return var;
                }

                /**
                 * Imposta il valore della propriet� var.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVar(String value) {
                    this.var = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Temperature {

                @XmlAttribute(name = "unit")
                protected String unit;
                @XmlAttribute(name = "value")
                protected BigDecimal value;
                @XmlAttribute(name = "min")
                protected BigDecimal min;
                @XmlAttribute(name = "max")
                protected BigDecimal max;

                /**
                 * Recupera il valore della propriet� unit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Imposta il valore della propriet� unit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

                /**
                 * Recupera il valore della propriet� value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Imposta il valore della propriet� value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Recupera il valore della propriet� min.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMin() {
                    return min;
                }

                /**
                 * Imposta il valore della propriet� min.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMin(BigDecimal value) {
                    this.min = value;
                }

                /**
                 * Recupera il valore della propriet� max.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMax() {
                    return max;
                }

                /**
                 * Imposta il valore della propriet� max.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMax(BigDecimal value) {
                    this.max = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="deg" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class WindDirection {

                @XmlAttribute(name = "deg")
                protected BigDecimal deg;
                @XmlAttribute(name = "code")
                protected String code;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Recupera il valore della propriet� deg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDeg() {
                    return deg;
                }

                /**
                 * Imposta il valore della propriet� deg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDeg(BigDecimal value) {
                    this.deg = value;
                }

                /**
                 * Recupera il valore della propriet� code.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Imposta il valore della propriet� code.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Recupera il valore della propriet� name.
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
                 * Imposta il valore della propriet� name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="mps" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class WindSpeed {

                @XmlAttribute(name = "mps")
                protected BigDecimal mps;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Recupera il valore della propriet� mps.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMps() {
                    return mps;
                }

                /**
                 * Imposta il valore della propriet� mps.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMps(BigDecimal value) {
                    this.mps = value;
                }

                /**
                 * Recupera il valore della propriet� name.
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
                 * Imposta il valore della propriet� name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="location">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="altitude" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="geobase" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="geobaseid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "type",
        "country",
        "timezone",
        "locationData"
    })
    public static class Location {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String country;
        @XmlElement(required = true)
        protected String timezone;
        @XmlElement(required = true)
        protected Weather.Location.LocationData locationData;

        /**
         * Recupera il valore della propriet� name.
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
         * Imposta il valore della propriet� name.
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
         * Recupera il valore della propriet� type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Imposta il valore della propriet� type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Recupera il valore della propriet� country.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Imposta il valore della propriet� country.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Recupera il valore della propriet� timezone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimezone() {
            return timezone;
        }

        /**
         * Imposta il valore della propriet� timezone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimezone(String value) {
            this.timezone = value;
        }

        /**
         * Recupera il valore della propriet� location.
         * 
         * @return
         *     possible object is
         *     {@link Weather.Location.Location }
         *     
         */
        public Weather.Location.LocationData getLocationData() {
            return locationData;
        }

        /**
         * Imposta il valore della propriet� location.
         * 
         * @param value
         *     allowed object is
         *     {@link Weather.Location.Location }
         *     
         */
        public void setLocationData(Weather.Location.LocationData value) {
            this.locationData = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="altitude" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="geobase" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="geobaseid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LocationData {

            @XmlAttribute(name = "altitude")
            protected Integer altitude;
            @XmlAttribute(name = "latitude")
            protected BigDecimal latitude;
            @XmlAttribute(name = "longitude")
            protected BigDecimal longitude;
            @XmlAttribute(name = "geobase")
            protected String geobase;
            @XmlAttribute(name = "geobaseid")
            protected Integer geobaseid;

            /**
             * Recupera il valore della propriet� altitude.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAltitude() {
                return altitude;
            }

            /**
             * Imposta il valore della propriet� altitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAltitude(Integer value) {
                this.altitude = value;
            }

            /**
             * Recupera il valore della propriet� latitude.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLatitude() {
                return latitude;
            }

            /**
             * Imposta il valore della propriet� latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLatitude(BigDecimal value) {
                this.latitude = value;
            }

            /**
             * Recupera il valore della propriet� longitude.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLongitude() {
                return longitude;
            }

            /**
             * Imposta il valore della propriet� longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLongitude(BigDecimal value) {
                this.longitude = value;
            }

            /**
             * Recupera il valore della propriet� geobase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeobase() {
                return geobase;
            }

            /**
             * Imposta il valore della propriet� geobase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeobase(String value) {
                this.geobase = value;
            }

            /**
             * Recupera il valore della propriet� geobaseid.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getGeobaseid() {
                return geobaseid;
            }

            /**
             * Imposta il valore della propriet� geobaseid.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setGeobaseid(Integer value) {
                this.geobaseid = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="calctime" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="nextupdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lastupdate",
        "calctime",
        "nextupdate"
    })
    public static class Meta {

        @XmlElement(required = true)
        protected String lastupdate;
        @XmlElement(required = true)
        protected BigDecimal calctime;
        @XmlElement(required = true)
        protected String nextupdate;

        /**
         * Recupera il valore della propriet� lastupdate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastupdate() {
            return lastupdate;
        }

        /**
         * Imposta il valore della propriet� lastupdate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastupdate(String value) {
            this.lastupdate = value;
        }

        /**
         * Recupera il valore della propriet� calctime.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCalctime() {
            return calctime;
        }

        /**
         * Imposta il valore della propriet� calctime.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCalctime(BigDecimal value) {
            this.calctime = value;
        }

        /**
         * Recupera il valore della propriet� nextupdate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextupdate() {
            return nextupdate;
        }

        /**
         * Imposta il valore della propriet� nextupdate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextupdate(String value) {
            this.nextupdate = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Sun {

        @XmlAttribute(name = "rise")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar rise;
        @XmlAttribute(name = "set")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar set;

        /**
         * Recupera il valore della propriet� rise.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRise() {
            return rise;
        }

        /**
         * Imposta il valore della propriet� rise.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRise(XMLGregorianCalendar value) {
            this.rise = value;
        }

        /**
         * Recupera il valore della propriet� set.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSet() {
            return set;
        }

        /**
         * Imposta il valore della propriet� set.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSet(XMLGregorianCalendar value) {
            this.set = value;
        }

    }

}
