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

import Controlador.MainController;
import Modelo.modeloUsuarios;

public class VistaPrincipal extends JPanel {
	
	private JTextField cajaPass;
	private JComboBox comboBox;
	private JButton btnLogin, btnRegistrarse;
	private JLabel foto, labelUser, labelPass;
	
	// Datos para la carga de usuarios
	modeloUsuarios usuarios;

	public VistaPrincipal() {
		
		setLayout(null);
		
		// Items panel principal
		foto = new JLabel("Foto Perfil");
		foto.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/images/avatar.png")));
		foto.setBounds(24, 77, 150, 150);
		add(foto);
		
		labelUser = new JLabel("Usuario");
		labelUser.setBounds(184, 77, 100, 23);
		add(labelUser);
		
		comboBox = new JComboBox();
		comboBox.setBounds(184, 111, 105, 22);
		add(comboBox);
		
		labelPass = new JLabel("Contrase\u00F1a");
		labelPass.setBounds(320, 77, 100, 23);
		add(labelPass);
		
		cajaPass = new JTextField();
		cajaPass.setBounds(320, 112, 105, 20);
		add(cajaPass);
		cajaPass.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().logear();
			}
		});
		btnLogin.setBounds(184, 172, 108, 33);
		add(btnLogin);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(320, 172, 108, 33);
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
