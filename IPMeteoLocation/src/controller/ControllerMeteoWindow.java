package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

import model.Previsione;
import model.Weather.Forecast.Time;
import model.Weather.Forecast.Time.Humidity;
import model.Weather.Location;
import view.MeteoWindow;

public class ControllerMeteoWindow implements ActionListener {
	
	private Previsione model;
	private MeteoWindow view;
	private static int index;
	
	public ControllerMeteoWindow(Previsione model, MeteoWindow view) {
		view.getBtnIndietro().addActionListener(this);
		view.getBtnAvanti().addActionListener(this);
		view.getBtnEsci().addActionListener(this);
		view.getBtnMeteo().addActionListener(this);
		
		view.setVisible(true);
		this.model = model;
		this.view = view;
		index = 0;
	}
	
	public String inizialeMaiuscola(String x) {
		String iniziale = x.charAt(0) + "";
		String n = x.substring(1,x.length());
		return iniziale.toUpperCase() + n.toLowerCase();
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
	
	public void aggiornaGrafica(int flag) {
		boolean ok = true;
		Location local = model.getPrevisione().getLocation();
		List<Time> dati = model.getPrevisione().getForecast().getTime();
		
		String nome = null;
		String stato = null;
		String lat = null;
		String lon = null;
		
		XMLGregorianCalendar da = null;
		XMLGregorianCalendar a = null;
		
		String cielo = null;
		String img = null;
		
		String temp = null;
		String tempMin = null;
		String tempMax = null;
		String humidity = null;
		
		if(flag > 0) {
			index++;
		}
		if(flag < 0) {
			index--;
		}
		
		try {
			nome = local.getName();
			stato = local.getCountry();
			//lat = local.getLocationData().getLatitude() + "";
			//lon = local.getLocationData().getLongitude() + "";
			
			da = dati.get(index).getFrom();
			a = dati.get(index).getTo();
			
			cielo = dati.get(index).getSymbol().getName();
			img = dati.get(index).getSymbol().getVar();
			
			temp = dati.get(index).getTemperature().getValue() + "";
			tempMin = dati.get(index).getTemperature().getMin() + "";
			tempMax = dati.get(index).getTemperature().getMax() + "";
			humidity = dati.get(index).getHumidity().getValue() + "";
		} catch(Exception e) {
			ok = false;
			
			if(flag > 0) {
				index--;
			}
			if(flag < 0) {
				index++;
			}
		}
		
		if(ok) {
			System.out.println(nome);
			System.out.println(stato);
			System.out.println(da);
			System.out.println(cielo);
			System.out.println(temp);
			
			String dove = nome + ", " + stato;
			String valDa = "Da: " + da.getDay() + "/" + da.getMonth() + " " + da.getHour() + ":" + da.getMinute();
			String valA = "A: " + a.getDay() + "/" + a.getMonth() + " " + a.getHour() + ":" + a.getMinute();
			String meteo = this.inizialeMaiuscola(cielo);
			String temperatura = "T. Media: " + temp + " °C " + "Min:" + tempMin + " °C " + "Max:" + tempMax + "°C";
			String umidita = "Umidità: " + humidity + "%";
			
			System.out.println(dove);
			System.out.println(meteo);
			System.out.println(temperatura);
			
			view.getLblInfo().setText(dove);
			view.getLblprevisioni().setText("<html>" + valDa + " - " + valA
											+ "</br>" + meteo
											+ "</br>" + temperatura
											+ "</br>" + umidita + "</html>");
			try {
				view.getLblImg().setIcon(new ImageIcon(new URL("http://openweathermap.org/img/w/" + img + ".png")));
			} catch (MalformedURLException e) {
				JOptionPane.showMessageDialog(view, "Non è stato possibilire recuperare la miniatura del tempo", "Errore", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(view, "Non ci sono previsioni per questo intervallo di tempo", "Errore", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == view.getBtnIndietro()) {
			this.aggiornaGrafica(-1);
		}
		
		if(arg0.getSource() == view.getBtnAvanti()) {
			this.aggiornaGrafica(1);
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
				model = new Previsione(where);
				this.aggiornaGrafica(0);
			}
		}
		
	}
	
}
