//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 04:28:18 PM CDT 
//


package org.example.aerolinea;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.aerolinea package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.aerolinea
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReservarVueloResponse }
     * 
     */
    public ReservarVueloResponse createReservarVueloResponse() {
        return new ReservarVueloResponse();
    }

    /**
     * Create an instance of {@link CancelarReservacionResponse }
     * 
     */
    public CancelarReservacionResponse createCancelarReservacionResponse() {
        return new CancelarReservacionResponse();
    }

    /**
     * Create an instance of {@link CancelarReservacionRequest }
     * 
     */
    public CancelarReservacionRequest createCancelarReservacionRequest() {
        return new CancelarReservacionRequest();
    }

    /**
     * Create an instance of {@link ReservarVueloRequest }
     * 
     */
    public ReservarVueloRequest createReservarVueloRequest() {
        return new ReservarVueloRequest();
    }

}
