import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField texto;
	private JTextField numDesplaz;
	private JTextField textoCifrado;
	
	String text="";
	String num="";
	
	Cesar datos=new Cesar();
	
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduceUnaFrase = new JLabel("Introduce una frase de X car\u00E1cteres m\u00E1ximo:");
		lblIntroduceUnaFrase.setBounds(29, 44, 389, 14);
		contentPane.add(lblIntroduceUnaFrase);
		
		texto = new JTextField();
		texto.setBounds(29, 69, 389, 20);
		contentPane.add(texto);
		texto.setColumns(10);
		
		JLabel lblIntroduceUnValor = new JLabel("Introduce un valor para encriptar el mensaje:");
		lblIntroduceUnValor.setBounds(29, 113, 389, 14);
		contentPane.add(lblIntroduceUnValor);
		
		numDesplaz = new JTextField();
		numDesplaz.setBounds(29, 138, 44, 20);
		contentPane.add(numDesplaz);
		numDesplaz.setColumns(10);
		
		JLabel lblMensajeCifrado = new JLabel("Mensaje Cifrado:");
		lblMensajeCifrado.setBounds(27, 173, 92, 14);
		contentPane.add(lblMensajeCifrado);
		
		textoCifrado = new JTextField();
		textoCifrado.setBounds(29, 198, 389, 20);
		contentPane.add(textoCifrado);
		textoCifrado.setColumns(10);
		
		// Botón de cifrado
		JButton botonCifraElMensaje = new JButton("Cifra el mensaje !");
		botonCifraElMensaje.setBounds(163, 153, 132, 23);
		contentPane.add(botonCifraElMensaje);
		botonCifraElMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoCifrado.setText(datos.EncriptarEnigma(texto.getText(),numDesplaz.getText()));
			}
		});
		
	}
	
public String getTexto(){
	this.text = textoCifrado.toString();
	return text;
}

public String getNumDesplz(){
	this.num = numDesplaz.toString();
	return num;
}

}
