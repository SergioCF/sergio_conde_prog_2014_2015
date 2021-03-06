import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class VentanaConversor extends JFrame {

	private JPanel ventana;
	private JTextField valorEuros;
	private JTextField resultado;
	private JTextField txtControl;
	
	float libras;
	float marcos;
	
	public VentanaConversor(float ValorConversion) {
		setTitle("Conversor de Dolares");
		setResizable(false);
		
		// Definimos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,200, 388, 254);
		ventana = new JPanel();
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ventana);
		ventana.setLayout(null);
		
		// T�tulo
		JLabel lblNewLabel = new JLabel("Introducir un valor en Euros entre 0 y 500 \u20AC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(63, 22, 260, 14);
		ventana.add(lblNewLabel);
		
		// Valor a introducir en Euros
		JLabel EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setFont(EtiquetaEuros.getFont().deriveFont(EtiquetaEuros.getFont().getStyle() | Font.BOLD));
		EtiquetaEuros.setBounds(27, 58, 46, 14);
		ventana.add(EtiquetaEuros);
		
		valorEuros = new JTextField();
		valorEuros.setBounds(27, 79, 86, 20);
		ventana.add(valorEuros);
		valorEuros.setColumns(10);
		
		// Resultado
		JLabel EtiquetaResultado = new JLabel("Resultado");
		EtiquetaResultado.setFont(EtiquetaResultado.getFont().deriveFont(EtiquetaResultado.getFont().getStyle() | Font.BOLD));
		EtiquetaResultado.setBounds(267, 58, 86, 14);
		ventana.add(EtiquetaResultado);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(267, 79, 86, 20);
		ventana.add(resultado);
		resultado.setColumns(10);
		
		// Caja de control
				JLabel EtiquetaControl = new JLabel("Mesaje de control");
				EtiquetaControl.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaControl.setBounds(29, 162, 122, 14);
				ventana.add(EtiquetaControl);
				
				txtControl = new JTextField();
				txtControl.setFont(new Font("Tahoma", Font.BOLD, 11));
				txtControl.setHorizontalAlignment(SwingConstants.CENTER);
				txtControl.setForeground(Color.RED);
				txtControl.setEditable(false);
				txtControl.setBounds(27, 187, 326, 20);
				ventana.add(txtControl);
				txtControl.setColumns(10);
				
		// Menu desplegable
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 78, 91, 22);
		ventana.add(comboBox);
		comboBox.addItem("Dolares");
		comboBox.addItem("Libras");
		comboBox.addItem("Marcos");
		
		// Coger items del ComboBox 
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println(comboBox.getSelectedItem());
			}
		});
		
				
		// Bot�n de conversi�n
		JButton BotonConvertir = new JButton("Convertir");
		BotonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// A�adir el Item seleccionado a una variable
				String opcion=comboBox.getSelectedItem().toString();
				
				float euros;
				float libras=0.79f;
				float marcos=1.96f;
				try{
					euros=Float.parseFloat(valorEuros.getText());
					if (euros>=0 && euros<=500){
						if (opcion.equals("Dolares")){
							resultado.setText(String.valueOf(euros * ValorConversion));
						}else if (opcion.equals("Libras")){
							resultado.setText(String.valueOf(euros * libras));
						}else if (opcion.equals("Marcos")){
							resultado.setText(String.valueOf(euros * marcos));
						}
						// Si va bien muestra
						txtControl.setText("Todo Correcto");
					}else{
						// Si no es >=0 && <=500, muestra
						resultado.setText("ERROR");
						txtControl.setText("ERROR: No es un n�mero positivo o es mayor que 500");
						
					}
				}catch(Exception  a){
					// Fallo al no introducir un n�mero
					resultado.setText("ERROR");
					txtControl.setText("ERROR: Introduce n�meros entre 0 y 500");
					
				}
			}
		});
		BotonConvertir.setBounds(144, 112, 91, 23);
		ventana.add(BotonConvertir);		
		
	}
}

