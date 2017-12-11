package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import model.Location;
import view.IPWindow;

public class ControllerIPWindow implements ActionListener{
	
	IPWindow finestraIP;

	public ControllerIPWindow(IPWindow finestraIP)
	{
		this.finestraIP=finestraIP;
		finestraIP.setActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		
		if(evt.getSource()==finestraIP.getBtnMyIp())
		{
			Location location=request();
			
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
			
			finestraIP.getLbl1().setText(location.getCountry());
			finestraIP.getLbl2().setText(location.getRegionName());
			finestraIP.getLbl3().setText(location.getCity());
		}
		
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
