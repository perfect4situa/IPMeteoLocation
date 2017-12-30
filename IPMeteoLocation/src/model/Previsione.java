package model;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Previsione {
	
	private Weather previsione;
	private static final String OPEN_WEATHER_KEY = "42b223d0b7441d97bd051375c1c1f0a1";
	
	//previsione località (IP)
	public Previsione() {
		//recupero località IP
		model.Location location = null;
		try	{
			URL url = new URL("http://ip-api.com/xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(model.Location.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			location = (model.Location) jaxbUnmarshaller.unmarshal(url);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http(ip)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML(ip)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		//recupero previsioni (lat, lon)
		try {
			URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml"
					+ "&lat=" + location.getLat()
					+ "&lon=" + location.getLon()
					+ "&units=metric" 
					+ "&lang=it"
					+ "&cnt=8"
					+ "&appid=" + OPEN_WEATHER_KEY);
			JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			previsione = (Weather) jaxbUnmarshaller.unmarshal(url);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http(previsione-ip)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML(previsione-ip)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	//previsione località (nome)
	public Previsione(String localita) {
		try {
			URL file = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml"
					+ "&q=" + localita
					+ "&units=metric"
					+ "&lang=it"
					+ "&appid=" + OPEN_WEATHER_KEY);
			JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			previsione = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http(previsione-loc)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML(previsione-loc)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	//previsione località (coordinate)
	public Previsione(String lat, String lon) {
		try {
			URL file = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml"
					+ "&lat=" + lat
					+ "&lon=" + lon
					+ "&units=metric"
					+ "&lang=it"
					+ "&cnt=8"
					+ "&appid=" + OPEN_WEATHER_KEY);
			JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			previsione = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http(previsione-coord)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML(previsione-coord)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	public Weather getPrevisione() {
		return previsione;
	}

	public void setPrevisione(Weather previsione) {
		this.previsione = previsione;
	}

}
