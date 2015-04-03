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


public class ConversorMonedas extends JFrame {

	// Elementos gráficos
	private JPanel ventana;
	private JTextField valorEuros;
	private JTextField resultado;
	private JTextField txtControl;
	
	// Datos de monedas
	DatosGenerales Datos=new DatosGenerales();
	
	// Seleccion de moneda
	private float valorMonedaSel=0f;
	
		
	public ConversorMonedas() {
		
		setTitle("Conversor de Dolares");
		setResizable(false);
		
		// Definimos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,200, 388, 254);
		ventana = new JPanel();
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ventana);
		ventana.setLayout(null);
		
		// Título
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
		// Utilizamos Bucle for para rellenar el comboBox
		for(int i=0;i<Datos.getMonedas().length;i++)
			comboBox.addItem((String)Datos.getMonedas()[i]);
		// Selección de items del ComboBox
		comboBox.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent arg0) {
				switch ((String)comboBox.getSelectedItem()){
				case DatosGenerales.textDolares:
					valorMonedaSel=Datos.getValoresConversion()[0];
					txtControl.setText("Ha seleccionado la moneda de EEUU");
					break;
				case DatosGenerales.textLibras:
					valorMonedaSel=Datos.getValoresConversion()[1];
					txtControl.setText("Ha seleccionado la moneda de UK");
					break;
				case DatosGenerales.textYen:
					valorMonedaSel=Datos.getValoresConversion()[2];
					txtControl.setText("Ha seleccionado la moneda de Japón");
					break;
				}
		
		}
		});
		
		// Botón de conversión
		JButton BotonConvertir = new JButton("Convertir");
		BotonConvertir.setBounds(144, 112, 91, 23);
		ventana.add(BotonConvertir);
		BotonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					float euros;
					euros=Float.parseFloat(valorEuros.getText());
					if (euros>=0 && euros<=500){
						txtControl.setText("Todo Correcto");
						resultado.setText(String.valueOf(euros*valorMonedaSel));
					}else{ // Si no es >=0 && <=500, muestra
						resultado.setText("ERROR");
						txtControl.setText("ERROR: No es un número positivo o es mayor que 500");
					}
				}catch(Exception  a){
					// Fallo al no introducir un número
					resultado.setText("ERROR");
					txtControl.setText("ERROR: Introduce números entre 0 y 500");
				}
			}
		});
		
	}
}
