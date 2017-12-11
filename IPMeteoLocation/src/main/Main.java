package main;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Weather;
import view.MeteoWindow;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MeteoWindow();
		URL file = Weather.class.getResource("weatherData.xml");
		Weather customer;
		try {
			JAXBContext jaxbContext =JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			customer = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
