package main;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Weather;
import controller.ControllerIPWindow;
import controller.ControllerMeteoWindow;
import view.IPWindow;
import view.MeteoWindow;

public class Main {

	public static void main(String[] args) {
		new ControllerMeteoWindow(new Weather(), new MeteoWindow());
		/*URL file = Weather.class.getResource("http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat=150&lon=15&cnt=10&appid=42b223d0b7441d97bd051375c1c1f0a1");
		Weather customer = null;
		try {
			JAXBContext jaxbContext =JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			customer = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		System.out.println(customer.getForecast().getTime().getClouds().getValue());
		IPWindow f=new IPWindow();
		ControllerIPWindow c=new ControllerIPWindow(f);*/
	}

}
