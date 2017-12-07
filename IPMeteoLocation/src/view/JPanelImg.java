package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImg extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private Image img;  

	public JPanelImg(String version) {
		URL url = ClassLoader.getSystemResource(version);
		img = Toolkit.getDefaultToolkit().getImage(url);
		//img = new ImageIcon(getClass().getResource(version)).getImage();
	}
	
	public void paintComponent(Graphics g) {
		this.setOpaque(false);
		g.drawImage(img, 0, 0, null);
		super.paintComponent(g);
	}
}