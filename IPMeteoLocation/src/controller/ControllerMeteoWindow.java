package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Weather;
import view.MeteoWindow;

public class ControllerMeteoWindow implements ActionListener {
	
	private Weather model;
	private MeteoWindow view;
	
	public ControllerMeteoWindow() {
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

	public void actionPerformed(ActionEvent e) {
		
	}
	
}
