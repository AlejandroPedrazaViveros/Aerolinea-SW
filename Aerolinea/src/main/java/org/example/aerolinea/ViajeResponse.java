//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.23 a las 05:22:28 PM CST 
//


package org.example.aerolinea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="susalida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sudestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sufecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suhora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="susasiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suboleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "supasajero",
    "susalida",
    "sudestino",
    "sufecha",
    "suhora",
    "susasiento",
    "suboleto"
})
@XmlRootElement(name = "viajeResponse")
public class ViajeResponse {

    @XmlElement(required = true)
    protected String supasajero;
    @XmlElement(required = true)
    protected String susalida;
    @XmlElement(required = true)
    protected String sudestino;
    @XmlElement(required = true)
    protected String sufecha;
    @XmlElement(required = true)
    protected String suhora;
    protected int susasiento;
    @XmlElement(required = true)
    protected String suboleto;

    /**
     * Obtiene el valor de la propiedad supasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupasajero() {
        return supasajero;
    }

    /**
     * Define el valor de la propiedad supasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupasajero(String value) {
        this.supasajero = value;
    }

    /**
     * Obtiene el valor de la propiedad susalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSusalida() {
        return susalida;
    }

    /**
     * Define el valor de la propiedad susalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSusalida(String value) {
        this.susalida = value;
    }

    /**
     * Obtiene el valor de la propiedad sudestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSudestino() {
        return sudestino;
    }

    /**
     * Define el valor de la propiedad sudestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSudestino(String value) {
        this.sudestino = value;
    }

    /**
     * Obtiene el valor de la propiedad sufecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSufecha() {
        return sufecha;
    }

    /**
     * Define el valor de la propiedad sufecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSufecha(String value) {
        this.sufecha = value;
    }

    /**
     * Obtiene el valor de la propiedad suhora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuhora() {
        return suhora;
    }

    /**
     * Define el valor de la propiedad suhora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuhora(String value) {
        this.suhora = value;
    }

    /**
     * Obtiene el valor de la propiedad susasiento.
     * 
     */
    public int getSusasiento() {
        return susasiento;
    }

    /**
     * Define el valor de la propiedad susasiento.
     * 
     */
    public void setSusasiento(int value) {
        this.susasiento = value;
    }

    /**
     * Obtiene el valor de la propiedad suboleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuboleto() {
        return suboleto;
    }

    /**
     * Define el valor de la propiedad suboleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuboleto(String value) {
        this.suboleto = value;
    }

}
