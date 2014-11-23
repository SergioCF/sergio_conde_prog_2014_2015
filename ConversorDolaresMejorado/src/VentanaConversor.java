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
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class VentanaConversor extends JFrame {

	private JPanel Ventana;
	private JTextField ValorEuros;
	private JTextField ValorDolares;
	private JTextField txtControl;
	
	public VentanaConversor(float ValorConversion) {
		setTitle("Conversor de Dolares");
		setResizable(false);
		
		// Definimos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,200, 388, 213);
		Ventana = new JPanel();
		Ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Ventana);
		Ventana.setLayout(null);
		
		// Título
		JLabel lblNewLabel = new JLabel("Introducir un valor en Euros entre 0 y 500 \u20AC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(63, 22, 260, 14);
		Ventana.add(lblNewLabel);
		
		// Euros
		JLabel EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setFont(EtiquetaEuros.getFont().deriveFont(EtiquetaEuros.getFont().getStyle() | Font.BOLD));
		EtiquetaEuros.setBounds(27, 58, 46, 14);
		Ventana.add(EtiquetaEuros);
		
		ValorEuros = new JTextField();
		ValorEuros.setBounds(27, 79, 86, 20);
		Ventana.add(ValorEuros);
		ValorEuros.setColumns(10);
		
		// Dolares
		JLabel EtiquetaDolares = new JLabel("Dolares");
		EtiquetaDolares.setFont(EtiquetaDolares.getFont().deriveFont(EtiquetaDolares.getFont().getStyle() | Font.BOLD));
		EtiquetaDolares.setBounds(267, 58, 46, 14);
		Ventana.add(EtiquetaDolares);
		
		ValorDolares = new JTextField();
		ValorDolares.setEditable(false);
		ValorDolares.setBounds(267, 79, 86, 20);
		Ventana.add(ValorDolares);
		ValorDolares.setColumns(10);
		
		//Zona de control
				JLabel EtiquetaControl = new JLabel("Mesaje de control");
				EtiquetaControl.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaControl.setBounds(27, 123, 122, 14);
				Ventana.add(EtiquetaControl);
				
				txtControl = new JTextField();
				txtControl.setFont(new Font("Tahoma", Font.BOLD, 11));
				txtControl.setHorizontalAlignment(SwingConstants.CENTER);
				txtControl.setForeground(Color.RED);
				txtControl.setEditable(false);
				txtControl.setBounds(27, 146, 326, 20);
				Ventana.add(txtControl);
				txtControl.setColumns(10);
				
		// Boton de conversión
		JButton BotonConvertir = new JButton("Convertir");
		BotonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				try{
					euros=Float.parseFloat(ValorEuros.getText());
					if (euros>=0 && euros<=500){
						ValorDolares.setText(String.valueOf(euros * ValorConversion));
						//Si va bien
						txtControl.setText("Todo Correcto");
					}else{
						//Si no es, que hago
						txtControl.setText("ERROR: No es un número positivo o es mayor que 500");
					}
				}catch(Exception  a){
					//Fallo
					txtControl.setText("ERROR: Introduce números entre 0 y 500");
				}
			}
		});
		BotonConvertir.setBounds(143, 78, 91, 23);
		Ventana.add(BotonConvertir);		
	}
}

