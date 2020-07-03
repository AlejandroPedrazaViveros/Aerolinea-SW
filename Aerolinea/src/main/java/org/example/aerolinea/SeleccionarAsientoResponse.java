//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.02 a las 07:07:05 PM CDT 
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
 *         &lt;element name="Boleto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="pasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "boleto"
})
@XmlRootElement(name = "SeleccionarAsientoResponse")
public class SeleccionarAsientoResponse {

    @XmlElement(name = "Boleto", required = true)
    protected SeleccionarAsientoResponse.Boleto boleto;

    /**
     * Obtiene el valor de la propiedad boleto.
     * 
     * @return
     *     possible object is
     *     {@link SeleccionarAsientoResponse.Boleto }
     *     
     */
    public SeleccionarAsientoResponse.Boleto getBoleto() {
        return boleto;
    }

    /**
     * Define el valor de la propiedad boleto.
     * 
     * @param value
     *     allowed object is
     *     {@link SeleccionarAsientoResponse.Boleto }
     *     
     */
    public void setBoleto(SeleccionarAsientoResponse.Boleto value) {
        this.boleto = value;
    }


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
     *         &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="pasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "idBoleto",
        "origen",
        "destino",
        "fecha",
        "hora",
        "precio",
        "pasajero",
        "asiento"
    })
    public static class Boleto {

        protected int idBoleto;
        @XmlElement(required = true)
        protected String origen;
        @XmlElement(required = true)
        protected String destino;
        @XmlElement(required = true)
        protected String fecha;
        @XmlElement(required = true)
        protected String hora;
        protected int precio;
        @XmlElement(required = true)
        protected String pasajero;
        protected int asiento;

        /**
         * Obtiene el valor de la propiedad idBoleto.
         * 
         */
        public int getIdBoleto() {
            return idBoleto;
        }

        /**
         * Define el valor de la propiedad idBoleto.
         * 
         */
        public void setIdBoleto(int value) {
            this.idBoleto = value;
        }

        /**
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigen(String value) {
            this.origen = value;
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
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public int getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(int value) {
            this.precio = value;
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

    }

}
