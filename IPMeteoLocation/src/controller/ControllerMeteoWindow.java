package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Previsione;
import model.Weather;
import view.MeteoWindow;

public class ControllerMeteoWindow implements ActionListener {
	
	private Previsione model;
	private MeteoWindow view;
	private int num = 0;
	
	public ControllerMeteoWindow(Previsione model, MeteoWindow view) {
		view.getBtnIndietro().addActionListener(this);
		view.getBtnAvanti().addActionListener(this);
		view.getBtnEsci().addActionListener(this);
		view.getBtnMeteo().addActionListener(this);
		
		view.setVisible(true);
		this.model = model;
		this.view = view;
		/*URL file = Weather.class.getResource("weatherData.xml");
		Weather customer;
		try {
			JAXBContext jaxbContext =JAXBContext.newInstance(Weather.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			customer = (Weather) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}*/
	}
	
	public void setImmagineMeteo(int x) {
		ImageIcon img;
		
		switch(x) {
			case 0:
				img = new ImageIcon("../IPMeteoLocation/images/sole.jpeg");
			break;
			case 1:
				img = new ImageIcon("../IPMeteoLocation/images/sole_con_nuvole.jpeg");
			break;
			case 2:
				img = new ImageIcon("../IPMeteoLocation/images/nuvole.jpeg");
			break;
			case 3:
				img = new ImageIcon("../IPMeteoLocation/images/pioggia.jpeg");
			break;
			case 4:
				img = new ImageIcon("../IPMeteoLocation/images/temporale.jpeg");
			break;
			case 5:
				img = new ImageIcon("../IPMeteoLocation/images/neve.jpeg");
			break;
			default:
				img = new ImageIcon("../IPMeteoLocation/images/empty.jpg");
			break;
		}
		
		view.getLblImg().setIcon(img);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == view.getBtnIndietro()) {
			
		}
		
		if(arg0.getSource() == view.getBtnAvanti()) {
			
		}
		
		if(arg0.getSource() == view.getBtnEsci()) {
			boolean flag = JOptionPane.showConfirmDialog(view, "Vuoi veramente uscire?", "Esci", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ? true : false;
			
			if(flag) {
				view.setEnabled(false);
				view.setVisible(false);
				view.dispose();
			}
		}
		
		if(arg0.getSource() == view.getBtnMeteo()) {
			String where = JOptionPane.showInputDialog(view, "Digita il nome di una città", "Cerca meteo", JOptionPane.OK_CANCEL_OPTION);
			
			if(where.equals("") || where == null) {
				if(where.equals("")) {
					JOptionPane.showMessageDialog(view, "Digita il nome di una città e riprova", "Errore", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				//fare richiesta meteo
				//aggiornare finestra
			}
		}
		
	}
	
}
