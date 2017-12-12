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
	private JLabel lblImg;
	private JButton btnIndietro;
	private JLabel lblprevisioni;
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
		panel.setBounds(0, 0, 444, 259);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblInfo = new JLabel("*info*");
		lblInfo.setToolTipText("Meteo info");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(10, 11, 424, 23);
		panel.add(lblInfo);
		
		lblImg = new JLabel();
		lblImg.setToolTipText("Immagine meteo");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setBounds(107, 45, 229, 72);
		panel.add(lblImg);
		lblImg.setLayout(null);
		
		btnIndietro = new JButton("<");
		btnIndietro.setToolTipText("Indietro");
		btnIndietro.setBounds(10, 139, 50, 23);
		panel.add(btnIndietro);
		
		lblprevisioni = new JLabel("*previsioni*");
		lblprevisioni.setToolTipText("Previsioni");
		lblprevisioni.setHorizontalAlignment(SwingConstants.CENTER);
		lblprevisioni.setBounds(70, 128, 304, 56);
		panel.add(lblprevisioni);
		
		btnAvanti = new JButton(">");
		btnAvanti.setToolTipText("Avanti");
		btnAvanti.setBounds(384, 139, 50, 23);
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

	public JLabel getLblImg() {
		return lblImg;
	}

	public void setLblImg(JLabel lblImg) {
		this.lblImg = lblImg;
	}

	public JButton getBtnIndietro() {
		return btnIndietro;
	}

	public void setBtnIndietro(JButton btnIndietro) {
		this.btnIndietro = btnIndietro;
	}

	public JLabel getLblprevisioni() {
		return lblprevisioni;
	}

	public void setLblprevisioni(JLabel lblprevisioni) {
		this.lblprevisioni = lblprevisioni;
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
