package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

import model.Previsione;
import model.Weather.Forecast.Time;
import model.Weather.Location;
import view.MeteoWindow;

public class ControllerMeteoWindow implements ActionListener {
	
	private Previsione model;
	private MeteoWindow view;
	private int index;
	
	public ControllerMeteoWindow(Previsione model, MeteoWindow view) {
		view.getBtnIndietro().addActionListener(this);
		view.getBtnAvanti().addActionListener(this);
		view.getBtnEsci().addActionListener(this);
		view.getBtnMeteo().addActionListener(this);
		
		view.setVisible(true);
		
		this.model = model;
		this.view = view;
		index = 0;
		
		this.aggiornaGrafica(0);
	}
	
	public String inizialeMaiuscola(String x) {
		String iniziale = x.charAt(0) + "";
		String n = x.substring(1,x.length());
		return iniziale.toUpperCase() + n.toLowerCase();
	}
	
	public void aggiornaGrafica(int flag) {
		boolean ok = true;
		Location local = model.getPrevisione().getLocation();
		List<Time> dati = model.getPrevisione().getForecast().getTime();
		
		String nome = null;
		String stato = null;
		
		XMLGregorianCalendar da = null;
		XMLGregorianCalendar a = null;
		
		String cielo = null;
		String img = null;
		
		String vento = null;
		String speed = null;
		
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
			
			da = dati.get(index).getFrom();
			a = dati.get(index).getTo();
			
			cielo = dati.get(index).getSymbol().getName();
			img = dati.get(index).getSymbol().getVar();
			
			vento = dati.get(index).getWindSpeed().getName();
			speed = dati.get(index).getWindSpeed().getMps() + "";
			
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
			String dove = nome + ", " + stato;
			String val = "<html>" + da.getHour() + ":00 - "
					+ a.getHour() + ":00<br>"
					+ da.getDay() + "/" + da.getMonth() + "/" + da.getYear() + "</html>";
			String meteo = this.inizialeMaiuscola(cielo);
			String umidita = "Umidità: " + humidity + "%";
			String tempUm = "<html>Media: " + temp + " °C"
					+ "<br>Min: " + tempMin + " °C"
					+ "<br>Max: " + tempMax + " °C<br>"
					+ umidita + "</html>";
			
			view.getLblInfo().setText(dove);
			view.getLblData().setText(val);
			view.getLblTemperatura().setText(tempUm);
			view.getLblVento().setText(vento + " " + speed + " Km/h");
			view.getLblMeteo().setText(meteo);
			
			view.getSetImgMeteo(img);
			view.getSetImgVento(speed);
			view.getSetBackground(model);
		} else {
			JOptionPane.showMessageDialog(view, "Non ci sono previsioni per questo intervallo di tempo", "Errore", JOptionPane.INFORMATION_MESSAGE);
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
					JOptionPane.showMessageDialog(view, "Digita il nome di una città e riprova", "Errore", JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				model = new Previsione(where.replaceAll(" ", "%20"));
				index = 0;
				
				this.aggiornaGrafica(0);
			}
		}
		
	}
	
}
