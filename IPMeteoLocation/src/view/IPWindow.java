package view;

import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
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

	/**
	 * Create the frame.
	 */
	public IPWindow() {
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
		this.label.setBounds(10, 151, 470, 200);
		this.contentPane.add(this.label);
		
		this.btnMeteo = new JButton("Meteo");
		this.btnMeteo.setBounds(489, 220, 115, 35);
		this.contentPane.add(this.btnMeteo);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Citt\u00E0", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(10, 68, 204, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 25, 184, 36);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Regione", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		panel_1.setBounds(224, 68, 204, 72);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 25, 184, 36);
		panel_1.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Stato", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, null));
		panel_2.setBounds(438, 68, 166, 72);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 25, 146, 36);
		panel_2.add(lblNewLabel_2);
		
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
