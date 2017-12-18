package controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import model.Location;
import view.IPWindow;

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
				
				finestraIP.clearInput();
			}
			else
			{
				JOptionPane.showMessageDialog(finestraIP, "Inserisci un ip Corretto", "Ip errato", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
	}
	
	private ImageIcon imageRequest(String lat, String lon)
	{
		URL richiesta=null;;
		ImageIcon immagine=null;
		
		try
		{
			richiesta = new URL("https://maps.googleapis.com/maps/api/staticmap?"+"center="+lat+","+lon+"&size=470x200"+"&zoom=15"+"&markers=color:red|label:!|"+lat+","+lon +"&maptype=roadmap"+"&key="+FIXED_MAP_KEY);
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
	
}
