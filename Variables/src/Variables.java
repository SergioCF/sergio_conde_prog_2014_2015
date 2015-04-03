import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Variables extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JLabel lblDecimales;
	private JTextField caja2;
	private JLabel lblBoolean;
	private JTextField caja3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variables frame = new Variables();
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
	public Variables() {
		//ZONA DE VARIABLES
		int valor=0;
		int valor2=13;
		float decimal=2.34f;
		boolean si=true;
		String valorCaja="Sergio";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta Caja
		JLabel lblEnteros = new JLabel("Enteros");
		lblEnteros.setBounds(23, 25, 105, 20);
		contentPane.add(lblEnteros);
		
			//Caja 1 para mostrar enteros
			caja = new JTextField();
			caja.setBounds(22, 56, 106, 20);
			contentPane.add(caja);
			caja.setColumns(10);
		
			//Visualizar variable
			valor=10;
			valor=valor2;
			//Conversiones
			valorCaja=Integer.toString(valor);
			System.out.println(valor);
			caja.setText(valorCaja);
		
		//Etiqueta Caja2	
		lblDecimales = new JLabel("Decimales");
		lblDecimales.setBounds(23, 87, 105, 20);
		contentPane.add(lblDecimales);
		
			//Caja 2 para mostrar decimales
			caja2 = new JTextField();
			caja2.setText("Sergio");
			caja2.setColumns(10);
			caja2.setBounds(22, 118, 106, 20);
			contentPane.add(caja2);
			
			//Conversiones
			valorCaja=Float.toString(decimal);
			caja2.setText(valorCaja);
		
		//Etiqueta Caja3
		lblBoolean = new JLabel("Boolean");
		lblBoolean.setBounds(23, 149, 105, 20);
		contentPane.add(lblBoolean);
		
			//Caja 3 para mostrar Boolean
			caja3 = new JTextField();
			caja3.setText("Sergio");
			caja3.setColumns(10);
			caja3.setBounds(22, 175, 106, 20);
			contentPane.add(caja3);
			
			//Conversiones
			valorCaja=Boolean.toString(si);
			caja3.setText(valorCaja);
	}
}
