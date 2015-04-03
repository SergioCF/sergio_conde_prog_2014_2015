package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Modelo.modeloUsuarios;

public class VistaPrincipal extends JPanel {
	
	private JTextField cajaPass;
	private JComboBox comboBox;
	private JButton bJuegos, bPerfil, btnLogin, btnRegistrarse;
	private JLabel foto, labelUser, labelPass;
	
	// Datos para la carga de usuarios
	modeloUsuarios usuarios;

	public VistaPrincipal() {
		
		setLayout(null);
		
		// Items panel principal
		foto = new JLabel("Foto Perfil");
		foto.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/images/avatar.png")));
		foto.setBounds(22, 21, 150, 150);
		add(foto);
		
		bJuegos = new JButton("Juegos >");
		bJuegos.setBounds(229, 42, 138, 23);
		add(bJuegos);
		
		bPerfil = new JButton("Perfil >");
		bPerfil.setBounds(229, 85, 138, 23);
		add(bPerfil);
		
		labelUser = new JLabel("Usuario");
		labelUser.setBounds(22, 193, 100, 23);
		add(labelUser);
		
		comboBox = new JComboBox();
		comboBox.setBounds(22, 228, 100, 22);
		add(comboBox);
		
		labelPass = new JLabel("Contrase\u00F1a");
		labelPass.setBounds(137, 193, 100, 23);
		add(labelPass);
		
		cajaPass = new JTextField();
		cajaPass.setBounds(132, 229, 105, 20);
		add(cajaPass);
		cajaPass.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(287, 188, 108, 33);
		add(btnLogin);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(287, 238, 108, 33);
		add(btnRegistrarse);
			
				
	}
	
	// sendUsers & rellenado
	public void sendUsers(ArrayList usuarios){
		Iterator<String> it =usuarios.iterator();
			while (it.hasNext()){
				comboBox.addItem((String)it.next());
			}			
	}
}
