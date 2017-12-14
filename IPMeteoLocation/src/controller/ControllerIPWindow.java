package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import model.Location;
import view.IPWindow;

public class ControllerIPWindow implements ActionListener{
	
	private IPWindow finestraIP;
	private Location location;

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
			
			finestraIP.getLbl1().setText(location.getCountry());
			finestraIP.getLbl2().setText(location.getRegionName());
			finestraIP.getLbl3().setText(location.getCity());
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
				
				
				finestraIP.getLbl1().setText(location.getCountry());
				finestraIP.getLbl2().setText(location.getRegionName());
				finestraIP.getLbl3().setText(location.getCity());
				
				finestraIP.clearInput();
			}
			else
			{
				JOptionPane.showMessageDialog(finestraIP, "Inserisci un ip Corretto", "Ip errato", JOptionPane.ERROR_MESSAGE);
			}
			
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
