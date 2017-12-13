//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.13 alle 02:42:44 PM CET 
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
public class ObjectFactoryWeather {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactoryWeather() {
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeatherdata() {
        return new Weather();
    }

    /**
     * Create an instance of {@link Weather.Forecast }
     * 
     */
    public Weather.Forecast createWeatherdataForecast() {
        return new Weather.Forecast();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time }
     * 
     */
    public Weather.Forecast.Time createWeatherdataForecastTime() {
        return new Weather.Forecast.Time();
    }

    /**
     * Create an instance of {@link Weather.Location }
     * 
     */
    public Weather.Location createWeatherdataLocation() {
        return new Weather.Location();
    }

    /**
     * Create an instance of {@link Weather.Meta }
     * 
     */
    public Weather.Meta createWeatherdataMeta() {
        return new Weather.Meta();
    }

    /**
     * Create an instance of {@link Weather.Sun }
     * 
     */
    public Weather.Sun createWeatherdataSun() {
        return new Weather.Sun();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.Symbol }
     * 
     */
    public Weather.Forecast.Time.Symbol createWeatherdataForecastTimeSymbol() {
        return new Weather.Forecast.Time.Symbol();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.Precipitation }
     * 
     */
    public Weather.Forecast.Time.Precipitation createWeatherdataForecastTimePrecipitation() {
        return new Weather.Forecast.Time.Precipitation();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.WindDirection }
     * 
     */
    public Weather.Forecast.Time.WindDirection createWeatherdataForecastTimeWindDirection() {
        return new Weather.Forecast.Time.WindDirection();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.WindSpeed }
     * 
     */
    public Weather.Forecast.Time.WindSpeed createWeatherdataForecastTimeWindSpeed() {
        return new Weather.Forecast.Time.WindSpeed();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.Temperature }
     * 
     */
    public Weather.Forecast.Time.Temperature createWeatherdataForecastTimeTemperature() {
        return new Weather.Forecast.Time.Temperature();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.Pressure }
     * 
     */
    public Weather.Forecast.Time.Pressure createWeatherdataForecastTimePressure() {
        return new Weather.Forecast.Time.Pressure();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.Humidity }
     * 
     */
    public Weather.Forecast.Time.Humidity createWeatherdataForecastTimeHumidity() {
        return new Weather.Forecast.Time.Humidity();
    }

    /**
     * Create an instance of {@link Weather.Forecast.Time.Clouds }
     * 
     */
    public Weather.Forecast.Time.Clouds createWeatherdataForecastTimeClouds() {
        return new Weather.Forecast.Time.Clouds();
    }

    /**
     * Create an instance of {@link Weather.Location.Location }
     * 
     */
    public Weather.Location.LocationData createWeatherdataLocationLocation() {
        return new Weather.Location.LocationData();
    }

}
