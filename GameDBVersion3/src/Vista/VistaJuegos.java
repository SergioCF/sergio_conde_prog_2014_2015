package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaJuegos extends JPanel {
	
	private JTextField textField, textField_1;
	private JLabel lblNombreJuegoNuevo, lblRuta;
	private JButton btnAadir;

	public VistaJuegos() {
		
		setLayout(null);
		
		lblNombreJuegoNuevo = new JLabel("Nombre juego nuevo:");
		lblNombreJuegoNuevo.setBounds(35, 36, 135, 33);
		add(lblNombreJuegoNuevo);
		
		textField = new JTextField();
		textField.setBounds(35, 80, 285, 25);
		add(textField);
		textField.setColumns(10);
		
		lblRuta = new JLabel("Ruta:");
		lblRuta.setBounds(35, 128, 135, 32);
		add(lblRuta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 171, 285, 25);
		add(textField_1);
		textField_1.setColumns(10);
		
		btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(35, 245, 91, 23);
		add(btnAadir);

	}
}