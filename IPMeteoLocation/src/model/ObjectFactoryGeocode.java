//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.30 alle 01:32:47 PM CET 
//


package model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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
public class ObjectFactoryGeocode {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactoryGeocode() {
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public Geocode createGeocodeResponse() {
        return new Geocode();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result }
     * 
     */
    public Geocode.Result createGeocodeResponseResult() {
        return new Geocode.Result();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry }
     * 
     */
    public Geocode.Result.Geometry createGeocodeResponseResultGeometry() {
        return new Geocode.Result.Geometry();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Bounds }
     * 
     */
    public Geocode.Result.Geometry.Bounds createGeocodeResponseResultGeometryBounds() {
        return new Geocode.Result.Geometry.Bounds();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Viewport }
     * 
     */
    public Geocode.Result.Geometry.Viewport createGeocodeResponseResultGeometryViewport() {
        return new Geocode.Result.Geometry.Viewport();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.AddressComponent }
     * 
     */
    public Geocode.Result.AddressComponent createGeocodeResponseResultAddressComponent() {
        return new Geocode.Result.AddressComponent();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Location }
     * 
     */
    public Geocode.Result.Geometry.Location createGeocodeResponseResultGeometryLocation() {
        return new Geocode.Result.Geometry.Location();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Bounds.Southwest }
     * 
     */
    public Geocode.Result.Geometry.Bounds.Southwest createGeocodeResponseResultGeometryBoundsSouthwest() {
        return new Geocode.Result.Geometry.Bounds.Southwest();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Bounds.Northeast }
     * 
     */
    public Geocode.Result.Geometry.Bounds.Northeast createGeocodeResponseResultGeometryBoundsNortheast() {
        return new Geocode.Result.Geometry.Bounds.Northeast();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Viewport.Southwest }
     * 
     */
    public Geocode.Result.Geometry.Viewport.Southwest createGeocodeResponseResultGeometryViewportSouthwest() {
        return new Geocode.Result.Geometry.Viewport.Southwest();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Viewport.Northeast }
     * 
     */
    public Geocode.Result.Geometry.Viewport.Northeast createGeocodeResponseResultGeometryViewportNortheast() {
        return new Geocode.Result.Geometry.Viewport.Northeast();
    }

}
