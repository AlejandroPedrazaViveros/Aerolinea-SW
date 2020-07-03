//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.03 a las 02:34:09 PM CDT 
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
 *         &lt;element name="idViaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idViaje",
    "asiento",
    "pasajero",
    "cliente"
})
@XmlRootElement(name = "SeleccionarAsientoRequest")
public class SeleccionarAsientoRequest {

    @XmlElement(required = true)
    protected String idViaje;
    protected int asiento;
    @XmlElement(required = true)
    protected String pasajero;
    @XmlElement(name = "Cliente", required = true)
    protected String cliente;

    /**
     * Obtiene el valor de la propiedad idViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdViaje() {
        return idViaje;
    }

    /**
     * Define el valor de la propiedad idViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdViaje(String value) {
        this.idViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     */
    public int getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     */
    public void setAsiento(int value) {
        this.asiento = value;
    }

    /**
     * Obtiene el valor de la propiedad pasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasajero() {
        return pasajero;
    }

    /**
     * Define el valor de la propiedad pasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasajero(String value) {
        this.pasajero = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

}
