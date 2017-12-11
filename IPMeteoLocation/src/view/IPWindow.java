package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class IPWindow extends JFrame {

	private static final long serialVersionUID = -2239535879809441493L;
	private JPanel contentPane;
	private JButton btnMyIp;
	private JFormattedTextField formattedTextField;
	private JButton btnCerca;
	private JLabel lblStato;
	private JLabel lblRegione;
	private JLabel lblCitt;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel label;
	private JButton btnMeteo;

	/**
	 * Create the frame.
	 */
	public IPWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.contentPane.setLayout(null);
		
		this.btnMyIp = new JButton("Cerca il mio IP");
		this.btnMyIp.setBounds(10, 11, 115, 35);
		this.contentPane.add(this.btnMyIp);
		
		this.formattedTextField = new JFormattedTextField(createFormatter("###.###.###.###"));
		this.formattedTextField.setBounds(190, 11, 235, 35);
		this.contentPane.add(this.formattedTextField);
		
		this.btnCerca = new JButton("Cerca");
		this.btnCerca.setBounds(489, 11, 115, 35);
		this.contentPane.add(this.btnCerca);
		
		this.lblStato = new JLabel("Stato");
		this.lblStato.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblStato.setBounds(10, 57, 115, 35);
		this.contentPane.add(this.lblStato);
		
		this.lblRegione = new JLabel("Regione");
		this.lblRegione.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblRegione.setBounds(225, 57, 115, 35);
		this.contentPane.add(this.lblRegione);
		
		this.lblCitt = new JLabel("Citt\u00E0");
		this.lblCitt.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblCitt.setBounds(445, 57, 115, 35);
		this.contentPane.add(this.lblCitt);
		
		this.lbl1 = new JLabel("");
		this.lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		this.lbl1.setBounds(10, 103, 115, 35);
		this.contentPane.add(this.lbl1);
		
		this.lbl2 = new JLabel("");
		this.lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		this.lbl2.setBounds(225, 103, 115, 35);
		this.contentPane.add(this.lbl2);
		
		this.lbl3 = new JLabel("");
		this.lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		this.lbl3.setBounds(445, 103, 115, 35);
		this.contentPane.add(this.lbl3);
		
		this.label = new JLabel("");
		this.label.setBounds(11, 149, 468, 152);
		this.contentPane.add(this.label);
		
		this.btnMeteo = new JButton("Meteo");
		this.btnMeteo.setBounds(489, 149, 115, 35);
		this.contentPane.add(this.btnMeteo);
		
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

	public JLabel getLblStato() {
		return lblStato;
	}

	public void setLblStato(JLabel lblStato) {
		this.lblStato = lblStato;
	}

	public JLabel getLblRegione() {
		return lblRegione;
	}

	public void setLblRegione(JLabel lblRegione) {
		this.lblRegione = lblRegione;
	}

	public JLabel getLblCitt() {
		return lblCitt;
	}

	public void setLblCitt(JLabel lblCitt) {
		this.lblCitt = lblCitt;
	}

	public JLabel getLbl1() {
		return lbl1;
	}

	public void setLbl1(JLabel lbl1) {
		this.lbl1 = lbl1;
	}

	public JLabel getLbl2() {
		return lbl2;
	}

	public void setLbl2(JLabel lbl2) {
		this.lbl2 = lbl2;
	}

	public JLabel getLbl3() {
		return lbl3;
	}

	public void setLbl3(JLabel lbl3) {
		this.lbl3 = lbl3;
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
	
	public String createFormatter(String format)
	{
		String maschera=null;
		try {
			maschera=new MaskFormatter(format).getMask();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return maschera;
	}
}
