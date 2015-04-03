import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;


public class EjemploVista extends JFrame {

	private JPanel contentPane;

	private JLabel lblNewLabel,label,lblPrimeraEtiqueta,label4;
	/**
	 * Create the frame.
	 */
	public EjemploVista() {
		
		//DEfinir JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 450, 300); //Dimensiones
		
		//Definir Contenedor
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		//Etiquetas de la pantalla
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel);
		label = new JLabel("Primera etiqueta");
		contentPane.add(label);
		lblPrimeraEtiqueta = new JLabel("Primera etiqueta");
		contentPane.add(lblPrimeraEtiqueta);
		label4 = new JLabel("Segunda etiqueta");
		contentPane.add(label4);
	}

}
