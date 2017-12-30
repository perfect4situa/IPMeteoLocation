package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import model.Location;
import model.Previsione;
import view.IPWindow;
import view.MeteoWindow;

public class ControllerIPWindow implements ActionListener{
	
	private IPWindow finestraIP;
	private Location location;
	private final static String FIXED_MAP_KEY=  "AIzaSyCelP-ihyvYsZsK1IM7qJ_drIWMlaOptw8";

	public ControllerIPWindow(IPWindow finestraIP)
	{
		this.finestraIP=finestraIP;
		finestraIP.setActionListener(this);
		location=null;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource()==finestraIP.getBtnMyIp())
		{
			location=request();
			
			finestraIP.getLabel().setIcon(this.imageRequest(location.getLat(), location.getLon()));
			finestraIP.getLblNewLabel().setText(location.getCity());
			finestraIP.getLblNewLabel_1().setText(location.getRegionName());
			finestraIP.getLblNewLabel_2().setText(location.getCountry()+" ("+location.getCountryCode()+")");
			finestraIP.getLblNewLabel_3().setText(location.getOrg());
			finestraIP.getFormattedTextField().setText(formatIp(location.getQuery()));
		}
		else if(evt.getSource()==finestraIP.getBtnCerca())
		{
			String ip="";
			InetAddress checker=null;
			boolean continua=true;
			
			
			if(!finestraIP.getFormattedTextField().getText().equals(""))
			{
				ip=finestraIP.getFormattedTextField().getText();
			}
			else
			{
				continua=false;
			}
			
			try {
				checker=InetAddress.getByName(ip);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continua=false;
				
			}
			
			if(continua)
			{
				location=request(checker.getHostAddress());
				
				
				
				finestraIP.getLabel().setIcon(this.imageRequest(location.getLat(), location.getLon()));
				
				finestraIP.getLabel().setIcon(this.imageRequest(location.getLat(), location.getLon()));
				finestraIP.getLblNewLabel().setText(location.getCity());
				finestraIP.getLblNewLabel_1().setText(location.getRegionName());
				finestraIP.getLblNewLabel_2().setText(location.getCountry()+" ("+location.getCountryCode()+")");
				finestraIP.getLblNewLabel_3().setText(location.getOrg());
				finestraIP.getFormattedTextField().setText(formatIp(location.getQuery()));
				
			}
			else
			{
				JOptionPane.showMessageDialog(finestraIP, "Inserisci un ip Corretto", "Ip errato", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		else if(evt.getSource()==finestraIP.getBtnMeteo())
		{
			if(location!=null)
			{
				new ControllerMeteoWindow(new Previsione(location.getLat(), location.getLon()), new MeteoWindow());
			}
		}
		
	}
	
	private ImageIcon imageRequest(String lat, String lon)
	{
		URL richiesta=null;;
		ImageIcon immagine=null;
		
		try
		{
			richiesta = new URL("https://maps.googleapis.com/maps/api/staticmap?"+"center="+lat+","+lon+"&size=345x285"+"&zoom=15"+"&markers=color:red|label:!|"+lat+","+lon +"&maptype=roadmap"+"&key="+FIXED_MAP_KEY);
			immagine=new ImageIcon(richiesta);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return immagine;
	}
	
	private Location request()
	{
		Location location=null;
		
		try
		{
			URL richiesta = new URL("http://ip-api.com/xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Location.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			location = (Location) jaxbUnmarshaller.unmarshal(richiesta);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return location;
	}
	
	private Location request(String ip)
	{
		Location location=null;
		
		try
		{
			URL richiesta = new URL("http://ip-api.com/xml/"+ip);
			JAXBContext jaxbContext = JAXBContext.newInstance(Location.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			location = (Location) jaxbUnmarshaller.unmarshal(richiesta);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return location;
	}
	
	private String formatIp(String ip)
	{
		String result="";
		int count=0;
		
		String[] vet=ip.split("\\.");
		
		for(String app:vet)
		{
			switch(app.length())
			{
				case 1:
					app="00"+app;
				break;
				
				case 2:
					app="0"+app;
				break;
				
			}
			
			if(count==0)
			{
				result+=app;
				count++;
			}
			else
			{
				result+="."+app;
			}
		}
		
		return result;
	}
}
