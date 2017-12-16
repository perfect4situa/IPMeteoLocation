package model;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Previsione {
	
	private Weather previsione;
	
	public Previsione(String nome) {
		try {
			URL file = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml&q=" + nome + "&units=metric&lang=it&appid=42b223d0b7441d97bd051375c1c1f0a1");
			JAXBContext jaxbContext =JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			previsione = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	public Previsione(String latitudine, String longitudine) {
		try {
			URL file = new URL("http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat=" + latitudine + "&lon=" + longitudine + "&cnt=8&units=metric&lang=it&appid=42b223d0b7441d97bd051375c1c1f0a1");
			JAXBContext jaxbContext =JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			previsione = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "Errore nella richiesta http", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (JAXBException e) {
			JOptionPane.showMessageDialog(null, "Errore nella lettura XML", "Errore", JOptionPane.ERROR_MESSAGE);
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
