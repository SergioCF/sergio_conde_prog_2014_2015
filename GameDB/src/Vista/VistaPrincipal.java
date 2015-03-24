package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VistaPrincipal extends JPanel {
	
	private JTextField cajaPass;

	public VistaPrincipal() {
		setLayout(null);
		
		//Items panel principal
		
		JLabel foto = new JLabel("Foto Perfil");
		foto.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/images/avatar.png")));
		foto.setBounds(22, 21, 150, 150);
		add(foto);
		
		JButton bJuegos = new JButton("Juegos >");
		bJuegos.setBounds(229, 42, 138, 23);
		add(bJuegos);
		
		JButton bPerfil = new JButton("Perfil >");
		bPerfil.setBounds(229, 85, 138, 23);
		add(bPerfil);
		
		JLabel labelUser = new JLabel("Usuario");
		labelUser.setBounds(22, 193, 100, 23);
		add(labelUser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 228, 100, 22);
		add(comboBox);
		
		JLabel labelPass = new JLabel("Contrase\u00F1a");
		labelPass.setBounds(137, 193, 100, 23);
		add(labelPass);
		
		cajaPass = new JTextField();
		cajaPass.setBounds(132, 229, 105, 20);
		add(cajaPass);
		cajaPass.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(287, 188, 108, 33);
		add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(287, 238, 108, 33);
		add(btnRegistrarse);
		
		
	}
}
