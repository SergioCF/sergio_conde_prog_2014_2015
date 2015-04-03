import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Inicializacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//Arranca la ventana
			public void run() {
				try {
					//Creariamos la ventana
					Inicializacion ventana = new Inicializacion();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//Fin
		});
	}

	/**
	 * Creamos la ventana
	 */
	public Inicializacion() {
		//Configuraciones iniciales de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
