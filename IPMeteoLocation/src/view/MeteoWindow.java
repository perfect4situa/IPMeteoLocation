package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import model.Previsione;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

public class MeteoWindow extends JFrame {

	private static final long serialVersionUID = 3146247893939891820L;
	private static final String MAP_KEY = "AIzaSyCelP-ihyvYsZsK1IM7qJ_drIWMlaOptw8";
	private JPanel contentPane;
	private JPanel panelMeteo;
	private JLabel lblBackground;
	private JLabel lblInfo;
	private JLabel lblTemperatura_1;
	private JLabel lblTemperatura;
	private JLabel lblData_1;
	private JLabel lblData;
	private JLabel lblVento;
	private JLabel lblImgVento;
	private JLabel lblMeteo;
	private JLabel lblImgMeteo;
	private JButton btnIndietro;
	private JButton btnAvanti;
	private JButton btnEsci;
	private JButton btnMeteo;
	private JButton btnRelative;

	public MeteoWindow() {
		this.getSetFrameIcon();
		setTitle("Meteo");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 609, 527);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelMeteo = new JPanel();
		panelMeteo.setBounds(0, 0, 603, 492);
		contentPane.add(panelMeteo);
		panelMeteo.setLayout(null);
		
		btnRelative = new JButton("");
		btnRelative.setBounds(549, 13, 40, 40);
		this.getSetInfoIcon();
		panelMeteo.add(btnRelative);
		
		lblInfo = new JLabel("*info*");
		lblInfo.setFont(new Font("Impact", Font.PLAIN, 30));
		lblInfo.setToolTipText("Citt\u00E0 e stato");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(105, 13, 392, 47);
		panelMeteo.add(lblInfo);
		
		lblTemperatura_1 = new JLabel("Temperatura");
		lblTemperatura_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura_1.setFont(new Font("Calibri", Font.BOLD, 25));
		lblTemperatura_1.setBounds(23, 135, 155, 47);
		panelMeteo.add(lblTemperatura_1);
		
		lblTemperatura = new JLabel("*temperatura*");
		lblTemperatura.setFont(new Font("Arial", Font.BOLD, 20));
		lblTemperatura.setToolTipText("Temperatura");
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setBounds(12, 181, 185, 129);
		panelMeteo.add(lblTemperatura);
		
		lblData_1 = new JLabel("Data (IT)");
		lblData_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblData_1.setFont(new Font("Calibri", Font.BOLD, 25));
		lblData_1.setBounds(434, 135, 155, 47);
		panelMeteo.add(lblData_1);
		
		lblData = new JLabel("*data*");
		lblData.setFont(new Font("Arial", Font.BOLD, 20));
		lblData.setToolTipText("Intervallo previsione");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setBounds(434, 181, 155, 103);
		panelMeteo.add(lblData);
		
		lblVento = new JLabel("*vento*");
		lblVento.setFont(new Font("Arial", Font.BOLD, 23));
		lblVento.setToolTipText("Velocit\u00E0 del vento");
		lblVento.setHorizontalAlignment(SwingConstants.CENTER);
		lblVento.setBounds(133, 307, 337, 41);
		panelMeteo.add(lblVento);
		
		lblImgVento = new JLabel();
		lblImgVento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblImgVento.setToolTipText("Immagine vento");
		lblImgVento.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgVento.setBounds(242, 361, 119, 74);
		panelMeteo.add(lblImgVento);
		
		lblMeteo = new JLabel("*tempo*");
		lblMeteo.setFont(new Font("Arial", Font.BOLD, 23));
		lblMeteo.setToolTipText("Condizioni meteorologiche");
		lblMeteo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeteo.setBounds(145, 73, 312, 47);
		panelMeteo.add(lblMeteo);
		
		lblImgMeteo = new JLabel();
		lblImgMeteo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblImgMeteo.setToolTipText("Immagine meteo");
		lblImgMeteo.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgMeteo.setBounds(260, 135, 83, 74);
		panelMeteo.add(lblImgMeteo);
		
		btnIndietro = new JButton("<");
		btnIndietro.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIndietro.setToolTipText("Indietro");
		btnIndietro.setBounds(83, 73, 50, 35);
		panelMeteo.add(btnIndietro);
		
		btnAvanti = new JButton(">");
		btnAvanti.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAvanti.setToolTipText("Avanti");
		btnAvanti.setBounds(469, 73, 50, 35);
		panelMeteo.add(btnAvanti);
		
		btnEsci = new JButton("Chiudi");
		btnEsci.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEsci.setToolTipText("Chiudi il servizio");
		btnEsci.setBounds(12, 433, 119, 41);
		panelMeteo.add(btnEsci);
		
		btnMeteo = new JButton("Meteo");
		btnMeteo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMeteo.setToolTipText("Cerca il meteo di una localit\u00E0");
		btnMeteo.setBounds(470, 433, 119, 41);
		panelMeteo.add(btnMeteo);
		
		lblBackground = new JLabel("");
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setBounds(0, 0, 603, 492);
		panelMeteo.add(lblBackground);
	}

	public JLabel getLblBackground() {
		return lblBackground;
	}

	public void setLblBackground(JLabel lblBackground) {
		this.lblBackground = lblBackground;
	}

	public JButton getBtnRelative() {
		return btnRelative;
	}

	public void setBtnRelative(JButton btnRelative) {
		this.btnRelative = btnRelative;
	}

	public JLabel getLblInfo() {
		return lblInfo;
	}

	public void setLblInfo(JLabel lblInfo) {
		this.lblInfo = lblInfo;
	}

	public JLabel getLblTemperatura() {
		return lblTemperatura;
	}

	public void setLblTemperatura(JLabel lblTemperatura) {
		this.lblTemperatura = lblTemperatura;
	}

	public JLabel getLblData() {
		return lblData;
	}

	public void setLblData(JLabel lblData) {
		this.lblData = lblData;
	}

	public JLabel getLblVento() {
		return lblVento;
	}

	public void setLblVento(JLabel lblVento) {
		this.lblVento = lblVento;
	}

	public JLabel getLblImgVento() {
		return lblImgVento;
	}

	public void setLblImgVento(JLabel lblImgVento) {
		this.lblImgVento = lblImgVento;
	}

	public JLabel getLblMeteo() {
		return lblMeteo;
	}

	public void setLblMeteo(JLabel lblMeteo) {
		this.lblMeteo = lblMeteo;
	}

	public JLabel getLblImgMeteo() {
		return lblImgMeteo;
	}

	public void setLblImgMeteo(JLabel lblImgMeteo) {
		this.lblImgMeteo = lblImgMeteo;
	}

	public JButton getBtnIndietro() {
		return btnIndietro;
	}

	public void setBtnIndietro(JButton btnIndietro) {
		this.btnIndietro = btnIndietro;
	}

	public JButton getBtnAvanti() {
		return btnAvanti;
	}

	public void setBtnAvanti(JButton btnAvanti) {
		this.btnAvanti = btnAvanti;
	}

	public JButton getBtnEsci() {
		return btnEsci;
	}

	public void setBtnEsci(JButton btnEsci) {
		this.btnEsci = btnEsci;
	}

	public JButton getBtnMeteo() {
		return btnMeteo;
	}

	public void setBtnMeteo(JButton btnMeteo) {
		this.btnMeteo = btnMeteo;
	}
	
	private void getSetFrameIcon() {
		try {
			URL url = new URL("https://openweathermap.org/themes/openweathermap/assets/vendor/owm/img/icons/logo_16x16.png");
			this.setIconImage(Toolkit.getDefaultToolkit().createImage(url));
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "Non è stato possibile recuperare l'icona della finestra", "Errore", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void getSetInfoIcon() {
		try {
			URL url = new URL("https://cdn0.iconfinder.com/data/icons/typicons-2/24/info-large-32.png");
			this.btnRelative.setIcon((new ImageIcon(url)));
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "Non è stato possibile recuperare l'icona della finestra", "Errore", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void getSetImgMeteo(String code) {
		try {
			URL url = new URL("http://openweathermap.org/img/w/" + code + ".png");
			ImageIcon icon = new ImageIcon(url);
			Image scaledImage = icon.getImage().getScaledInstance(this.lblImgMeteo.getSize().width, this.lblImgMeteo.getSize().height, Image.SCALE_DEFAULT);
			icon.setImage(scaledImage);
			this.lblImgMeteo.setIcon(icon);
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "Non è stato possibilire recuperare la miniatura del meteo", "Errore", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void getSetImgVento(String speed) {
		double val = Double.parseDouble(speed);
		int dim = 0;
		
		if(val < 4.00) {
			dim = 32;
		} else {
			if(val < 8.00) {
				dim = 48;
			} else {
				if(val < 14.00) {
					dim = 72;
				} else {
					dim = 96;
				}
			}
		}
		
		try {
			URL url = new URL("https://icon-icons.com/icons2/758/PNG/"
					+ dim
					+ "/wind_icon-icons.com_64274.png");
			this.lblImgVento.setIcon(new ImageIcon(url));
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "Non è stato possibilire recuperare la miniatura del vento", "Errore", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void getSetBackground(Previsione model) {		
		try {
			URL url = new URL("https://maps.googleapis.com/maps/api/staticmap?"
					+ "center="
					+ model.getLat()
					+ ","
					+ model.getLon()
					+ "&size=" + this.lblBackground.getSize().width +  "x" + this.lblBackground.getSize().height
					+ "&zoom=9"
					+ "&maptype=roadmap"
					+ "&key=" + MAP_KEY);
			this.lblBackground.setIcon(new ImageIcon(url));
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "Errore nella richiesta http(background-map)", "Errore", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
}
