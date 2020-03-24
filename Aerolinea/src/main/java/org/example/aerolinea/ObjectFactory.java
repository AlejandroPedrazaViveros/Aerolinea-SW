//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.23 a las 05:22:28 PM CST 
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
     * Create an instance of {@link ViajeRequest }
     * 
     */
    public ViajeRequest createViajeRequest() {
        return new ViajeRequest();
    }

    /**
     * Create an instance of {@link CancelarRequest }
     * 
     */
    public CancelarRequest createCancelarRequest() {
        return new CancelarRequest();
    }

    /**
     * Create an instance of {@link CancelarResponse }
     * 
     */
    public CancelarResponse createCancelarResponse() {
        return new CancelarResponse();
    }

    /**
     * Create an instance of {@link ViajeResponse }
     * 
     */
    public ViajeResponse createViajeResponse() {
        return new ViajeResponse();
    }

    /**
     * Create an instance of {@link ConfirmarRequest }
     * 
     */
    public ConfirmarRequest createConfirmarRequest() {
        return new ConfirmarRequest();
    }

    /**
     * Create an instance of {@link ConfirmarResponse }
     * 
     */
    public ConfirmarResponse createConfirmarResponse() {
        return new ConfirmarResponse();
    }

}
