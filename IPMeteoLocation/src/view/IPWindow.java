package view;

import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class IPWindow extends JFrame {

	private static final long serialVersionUID = -2239535879809441493L;
	private JPanel contentPane;
	private JButton btnMyIp;
	private JFormattedTextField formattedTextField;
	private JButton btnCerca;
	private JLabel label;
	private JButton btnMeteo;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_3;

	/**
	 * Create the frame.
	 */
	public IPWindow() {
		this.getSetFrameIcon();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.contentPane.setLayout(null);
		
		this.btnMyIp = new JButton("Cerca il mio IP");
		this.btnMyIp.setBounds(10, 11, 115, 35);
		this.contentPane.add(this.btnMyIp);
		
		this.formattedTextField = new JFormattedTextField(createFormatter("###.###.###.###"));
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		this.formattedTextField.setBounds(190, 11, 235, 35);
		this.contentPane.add(this.formattedTextField);
		
		this.btnCerca = new JButton("Cerca");
		this.btnCerca.setBounds(489, 11, 115, 35);
		this.contentPane.add(this.btnCerca);
		
		this.label = new JLabel("");
		label.setForeground(Color.DARK_GRAY);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		this.label.setBounds(20, 65, 345, 285);
		this.contentPane.add(this.label);
		
		this.btnMeteo = new JButton("Meteo");
		this.btnMeteo.setBounds(422, 315, 115, 35);
		this.contentPane.add(this.btnMeteo);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Citt\u00E0", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(375, 125, 206, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 15, 186, 30);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Regione", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		panel_1.setBounds(375, 182, 206, 46);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 15, 186, 30);
		panel_1.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Stato", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		panel_2.setBounds(377, 68, 206, 46);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 15, 186, 30);
		panel_2.add(lblNewLabel_2);
		
		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Provider", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		this.panel_3.setBounds(375, 239, 206, 46);
		this.contentPane.add(this.panel_3);
		this.panel_3.setLayout(null);
		
		this.lblNewLabel_3 = new JLabel("");
		this.lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNewLabel_3.setBounds(10, 15, 186, 30);
		this.panel_3.add(this.lblNewLabel_3);
		
		this.clearInput();
		
		this.setVisible(true);
	}

	public JButton getBtnMyIp() {
		return btnMyIp;
	}

	public void setBtnMyIp(JButton btnMyIp) {
		this.btnMyIp = btnMyIp;
	}

	public JFormattedTextField getFormattedTextField() {
		return formattedTextField;
	}

	public void setFormattedTextField(JFormattedTextField formattedTextField) {
		this.formattedTextField = formattedTextField;
	}

	public JButton getBtnCerca() {
		return btnCerca;
	}

	public void setBtnCerca(JButton btnCerca) {
		this.btnCerca = btnCerca;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JButton getBtnMeteo() {
		return btnMeteo;
	}

	public void setBtnMeteo(JButton btnMeteo) {
		this.btnMeteo = btnMeteo;
	}
	
	
	
	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}
	
	public void getSetFrameIcon() {
		try {
			URL url = new URL("https://ipapi.co/static/images/favicon.34f0ec468301.png");
			this.setIconImage(Toolkit.getDefaultToolkit().createImage(url));
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "Non è stato possibile recuperare l'icona della finestra", "Errore", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void setActionListener(ActionListener x)
	{
		this.getBtnCerca().addActionListener(x);
		this.getBtnMyIp().addActionListener(x);
		this.getBtnMeteo().addActionListener(x);
	}
	
	public MaskFormatter createFormatter(String format)
	{
		MaskFormatter maschera=null;
		try {
			maschera = new MaskFormatter(format);
			maschera.setPlaceholderCharacter('0');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return maschera;
	}
	
	public void clearInput()
	{
		this.formattedTextField.setText("000.000.000.000");
	}
}
