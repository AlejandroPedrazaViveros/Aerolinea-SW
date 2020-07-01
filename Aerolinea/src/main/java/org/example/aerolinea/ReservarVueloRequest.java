//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 04:28:18 PM CDT 
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
 *         &lt;element name="pasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="boleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pasajero",
    "salida",
    "destino",
    "fecha",
    "hora",
    "asiento",
    "boleto"
})
@XmlRootElement(name = "ReservarVueloRequest")
public class ReservarVueloRequest {

    @XmlElement(required = true)
    protected String pasajero;
    @XmlElement(required = true)
    protected String salida;
    @XmlElement(required = true)
    protected String destino;
    @XmlElement(required = true)
    protected String fecha;
    @XmlElement(required = true)
    protected String hora;
    @XmlElement(required = true)
    protected String asiento;
    protected int boleto;

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
     * Obtiene el valor de la propiedad salida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalida() {
        return salida;
    }

    /**
     * Define el valor de la propiedad salida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalida(String value) {
        this.salida = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiento(String value) {
        this.asiento = value;
    }

    /**
     * Obtiene el valor de la propiedad boleto.
     * 
     */
    public int getBoleto() {
        return boleto;
    }

    /**
     * Define el valor de la propiedad boleto.
     * 
     */
    public void setBoleto(int value) {
        this.boleto = value;
    }

}
