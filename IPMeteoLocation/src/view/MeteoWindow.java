package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MeteoWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3146247893939891820L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblInfo;
	private ImageIcon img;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		img = new ImageIcon("../IPMeteoLocation/src/view/spazio_immagine.png");
		lblImg = new JLabel(img);
		lblImg.setToolTipText("Immagine meteo");
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
		
		btnEsci = new JButton("Esci");
		btnEsci.setToolTipText("Chiudi il servizio");
		btnEsci.setBounds(70, 211, 89, 23);
		panel.add(btnEsci);
		
		btnMeteo = new JButton("Meteo");
		btnMeteo.setToolTipText("Cerca il meteo di una localit\u00E0");
		btnMeteo.setBounds(285, 211, 89, 23);
		panel.add(btnMeteo);
	}
}
