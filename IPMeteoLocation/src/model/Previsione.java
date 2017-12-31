package model;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Previsione {
	
	private Weather previsione;
	private String lat;
	private String lon;
	private static final String OPEN_WEATHER_KEY = "42b223d0b7441d97bd051375c1c1f0a1";
	private static final String GEOCODE_KEY = "AIzaSyCkBK1uTNhXgGksQiHic__WgZn6E7K_fyw";
	
	//previsione località (IP)
	public Previsione() {
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
		
		lat = location.getLat();
		lon = location.getLon();
		
		try {
			URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml"
					+ "&lat=" + lat
					+ "&lon=" + lon
					+ "&units=metric"
					+ "&lang=it"
					+ "&cnt=24"
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
		Geocode location = null;
		try	{
			URL url = new URL("https://maps.googleapis.com/maps/api/geocode/xml?"
					+ "address="
					+ localita
					+ "&key=" + GEOCODE_KEY);
			JAXBContext jaxbContext = JAXBContext.newInstance(Geocode.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			location = (Geocode) jaxbUnmarshaller.unmarshal(url);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http(previsione-coord)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML(previsione-coord)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		lat = location.getResult().getGeometry().getLocation().getLat() + "";
		lon = location.getResult().getGeometry().getLocation().getLng() + "";
		
		try {
			URL url = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml"
					+ "&lat=" + lat
					+ "&lon=" + lon
					+ "&units=metric"
					+ "&lang=it"
					+ "&cnt=24"
					+ "&appid=" + OPEN_WEATHER_KEY);
			JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			previsione = (Weather) jaxbUnmarshaller.unmarshal(url);
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
					+ "&cnt=24"
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
		
		this.lat = lat;
		this.lon = lon;
	}
	
	public Weather getPrevisione() {
		return previsione;
	}

	public void setPrevisione(Weather previsione) {
		this.previsione = previsione;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}
	
}
