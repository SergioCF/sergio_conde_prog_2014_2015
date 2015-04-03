package View;

import javax.swing.JPanel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

import Controller.MainController;

//Esta es la Vista principal
public class InicialView extends JPanel {
	private ArrayList<String> usuarios;
	JComboBox usuario;
	private JPasswordField pass;

	//Constructor
	public InicialView() {
		setBounds(0, 0, 400, 300);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(24, 0, 86, 14);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setAlignmentX(0.5f);
		lblPassword.setBounds(24, 56, 86, 14);
		add(lblPassword);
		
		usuario = new JComboBox();
		usuario.setBounds(24, 25, 134, 20);
		add(usuario);
		
		pass = new JPasswordField();
		pass.setBounds(24, 81, 134, 20);
		add(pass);
		
		//Boton de comprobacion de usuario
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().checkUser((String)usuario.getSelectedItem(),pass.getPassword());
			}
		});
		btnNewButton.setBounds(24, 121, 134, 23);
		add(btnNewButton);
	}
	
	//Añadir Usuarios
	public void putUsuarios(ArrayList<String> usuarios){
		usuario.removeAllItems();
	    for(String s:usuarios){
	    	usuario.addItem(s);
	    }
	    this.repaint();
	}
}
