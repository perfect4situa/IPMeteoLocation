package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MeteoWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3146247893939891820L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblInfo;
	private JLabel lblTemperatura;
	private JLabel lblData;
	private JLabel lblVento;
	private JLabel lblImgVento;
	private JLabel lblTempo;
	private JLabel lblImgMeteo;
	private JButton btnIndietro;
	private JButton btnAvanti;
	private JButton btnEsci;
	private JButton btnMeteo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeteoWindow frame = new MeteoWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MeteoWindow() {
		setTitle("Meteo");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 287);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 444, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblInfo = new JLabel("*info*");
		lblInfo.setToolTipText("Citt\u00E0 e stato");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(143, 13, 158, 23);
		panel.add(lblInfo);
		
		lblTemperatura = new JLabel("*temperatura*");
		lblTemperatura.setToolTipText("Temperatura");
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setBounds(12, 22, 111, 71);
		panel.add(lblTemperatura);
		
		lblData = new JLabel("*data*");
		lblData.setToolTipText("Intervallo previsione");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setBounds(311, 23, 123, 59);
		panel.add(lblData);
		
		lblVento = new JLabel("*vento*");
		lblVento.setToolTipText("Velocit\u00E0 del vento");
		lblVento.setHorizontalAlignment(SwingConstants.CENTER);
		lblVento.setBounds(143, 49, 158, 16);
		panel.add(lblVento);
		
		lblImgVento = new JLabel();
		lblImgVento.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgVento.setToolTipText("Immagine vento");
		lblImgVento.setBounds(166, 75, 111, 47);
		panel.add(lblImgVento);
		
		lblTempo = new JLabel("*tempo*");
		lblTempo.setToolTipText("Condizioni meteorologiche");
		lblTempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTempo.setBounds(143, 127, 158, 23);
		panel.add(lblTempo);
		
		lblImgMeteo = new JLabel();
		lblImgMeteo.setToolTipText("Immagine meteo");
		lblImgMeteo.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgMeteo.setBounds(166, 163, 111, 47);
		panel.add(lblImgMeteo);
		lblImgMeteo.setLayout(null);
		
		btnIndietro = new JButton("<");
		btnIndietro.setToolTipText("Indietro");
		btnIndietro.setBounds(109, 153, 50, 23);
		panel.add(btnIndietro);
		
		btnAvanti = new JButton(">");
		btnAvanti.setToolTipText("Avanti");
		btnAvanti.setBounds(285, 153, 50, 23);
		panel.add(btnAvanti);
		
		btnEsci = new JButton("Chiudi");
		btnEsci.setToolTipText("Chiudi il servizio");
		btnEsci.setBounds(70, 211, 89, 23);
		panel.add(btnEsci);
		
		btnMeteo = new JButton("Meteo");
		btnMeteo.setToolTipText("Cerca il meteo di una localit\u00E0");
		btnMeteo.setBounds(285, 211, 89, 23);
		panel.add(btnMeteo);
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

	public JLabel getLblTempo() {
		return lblTempo;
	}

	public void setLblTempo(JLabel lblTempo) {
		this.lblTempo = lblTempo;
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

}
