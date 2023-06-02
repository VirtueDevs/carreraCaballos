package carrera;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRMcarrera extends JFrame {
	private JLabel primer_caballo;
	private JLabel segundo_caballo;
	private JLabel tercer_caballo;
	private JLabel cuarto_caballo;
	private JLabel meta_final;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRMcarrera frame = new FRMcarrera();
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
	public FRMcarrera() {

		this.setLocationRelativeTo(null);
		this.setTitle("Carrera de caballos");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				JButton bttnIniciar = new JButton("INICIAR CARRERA");
				bttnIniciar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						primer_caballo.setLocation(0,primer_caballo.getLocation().y);
						segundo_caballo.setLocation(0,segundo_caballo.getLocation().y);
						tercer_caballo.setLocation(0,tercer_caballo.getLocation().y);
						cuarto_caballo.setLocation(0,cuarto_caballo.getLocation().y);

						Carrera caballo1 = new Carrera(primer_caballo,FRMcarrera.this);
						Carrera caballo2 = new Carrera(segundo_caballo,FRMcarrera.this);
						Carrera caballo3 = new Carrera(tercer_caballo,FRMcarrera.this);
						Carrera caballo4 = new Carrera(cuarto_caballo,FRMcarrera.this);

						caballo1.start();
						caballo2.start();
						caballo3.start();
						caballo4.start();
					}
				});
				
						bttnIniciar.setBounds(361, 496, 157, 33);
						contentPane.add(bttnIniciar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 140, 781, 10);
		contentPane.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 260, 781, 10);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 379, 781, 10);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("CARRERA DE CABALLOS");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 27));
		lblNewLabel.setBounds(281, 11, 367, 50);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("C1");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
		lblNewLabel_1.setBounds(0, 85, 46, 28);
		contentPane.add(lblNewLabel_1);

		primer_caballo = new JLabel("New label");
		primer_caballo.setIcon(new ImageIcon("C:\\Users\\charm\\eclipse-workspace\\carreraCaballos\\src\\imagenes\\lovepik-horse-silhouette-png-image_401007882_wh1200 (1).png"));
		primer_caballo.setBounds(56, 72, 68, 57);
		contentPane.add(primer_caballo);

		JLabel lblNewLabel_3 = new JLabel("C2");
		lblNewLabel_3.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
		lblNewLabel_3.setBounds(0, 190, 46, 28);
		contentPane.add(lblNewLabel_3);

		segundo_caballo = new JLabel("New label");
		segundo_caballo.setIcon(new ImageIcon("C:\\Users\\charm\\eclipse-workspace\\carreraCaballos\\src\\imagenes\\lovepik-horse-silhouette-png-image_401007882_wh1200 (1).png"));
		segundo_caballo.setBounds(56, 177, 68, 57);
		contentPane.add(segundo_caballo);

		JLabel lblNewLabel_5 = new JLabel("C3");
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
		lblNewLabel_5.setBounds(0, 307, 46, 28);
		contentPane.add(lblNewLabel_5);

		tercer_caballo = new JLabel("New label");
		tercer_caballo.setIcon(new ImageIcon("C:\\Users\\charm\\eclipse-workspace\\carreraCaballos\\src\\imagenes\\lovepik-horse-silhouette-png-image_401007882_wh1200 (1).png"));
		tercer_caballo.setBounds(56, 294, 68, 57);
		contentPane.add(tercer_caballo);

		JLabel lblNewLabel_7 = new JLabel("C4");
		lblNewLabel_7.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
		lblNewLabel_7.setBounds(0, 439, 46, 30);
		contentPane.add(lblNewLabel_7);

		cuarto_caballo = new JLabel("New label");
		cuarto_caballo.setIcon(new ImageIcon("C:\\Users\\charm\\eclipse-workspace\\carreraCaballos\\src\\imagenes\\lovepik-horse-silhouette-png-image_401007882_wh1200 (1).png"));
		cuarto_caballo.setBounds(56, 423, 68, 57);
		contentPane.add(cuarto_caballo);

		meta_final = new JLabel("New label");
		meta_final.setIcon(new ImageIcon("C:\\Users\\charm\\eclipse-workspace\\carreraCaballos\\src\\imagenes\\343-meta_400px.jpg"));
		meta_final.setBackground(new Color(255, 0, 128));
		meta_final.setBounds(806, 72, 46, 424);
		contentPane.add(meta_final);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\charm\\eclipse-workspace\\carreraCaballos\\src\\imagenes\\aerial-top-view-of-green-rice-field-from-above-photo.jpg"));
		lblNewLabel_2.setBounds(0, 52, 862, 488);
		contentPane.add(lblNewLabel_2);

	}
	public JLabel getPrimerCaballo() {
		return primer_caballo;
	}
	public JLabel getSegundoCaballo() {
		return segundo_caballo;
	}
	public JLabel getTercerCaballo() {
		return tercer_caballo;
	}
	public JLabel getCuartoCaballo() {
		return cuarto_caballo;
	}
	public JLabel getBarreraMeta() {
		return meta_final;
	}
}
