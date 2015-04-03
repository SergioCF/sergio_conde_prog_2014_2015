import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CopyButton extends JFrame {

	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField Caja4;
	private JTextField Caja2;
	private JTextField Caja3;
	
	//ZONA VARIABLES
	
	String textoCaja1="";
	String textoCaja2="";
	String textoCaja3="";
	String textoCaja4="";

	//Lanzamos la aplicación
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopyButton frame = new CopyButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creamos la Ventana
	public CopyButton() {
		//Propiedades de la Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 150, 337, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas
		
		Caja1 = new JTextField();
		Caja1.setBounds(10, 10, 86, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		Caja2 = new JTextField();
		Caja2.setBounds(233, 10, 86, 20);
		contentPane.add(Caja2);
		Caja2.setColumns(10);
		
		Caja3 = new JTextField();
		Caja3.setBounds(233, 99, 86, 20);
		contentPane.add(Caja3);
		Caja3.setColumns(10);
		
		Caja4 = new JTextField();
		Caja4.setBounds(10, 99, 86, 20);
		contentPane.add(Caja4);
		Caja4.setColumns(10);
		
		//Botones
		
		//Boton1
		JButton Boton1 = new JButton("Copia");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoCaja1=Caja1.getText();
				Caja2.setText(textoCaja1);
			}
		});
		Boton1.setBounds(122, 11, 86, 20);
		contentPane.add(Boton1);
		
		//Boton2
		JButton Boton2 = new JButton("Copia");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoCaja2=Caja2.getText();
				Caja3.setText(textoCaja2);
			}
		});
		Boton2.setBounds(233, 53, 86, 20);
		contentPane.add(Boton2);
		
		//Boton3
		JButton Boton3 = new JButton("Copia");
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoCaja3=Caja3.getText();
				Caja4.setText(textoCaja3);
			}
		});
		Boton3.setBounds(122, 100, 86, 20);
		contentPane.add(Boton3);
		
		//Boton4
		JButton Boton4 = new JButton("Copia");
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textoCaja4=Caja4.getText();
				Caja1.setText(textoCaja4);
			}
		});
		Boton4.setBounds(10, 53, 86, 20);
		contentPane.add(Boton4);
		
	}

}
