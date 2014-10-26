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

public class VentanaConversor extends JFrame {

	private JPanel Ventana;
	private JTextField ValorEuros;
	private JTextField ValorDolares;
	
	public VentanaConversor(float ValorConversion) {
		setTitle("Conversor de Dolares");
		setResizable(false);
		
		// Definimos la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,200, 341, 152);
		Ventana = new JPanel();
		Ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Ventana);
		Ventana.setLayout(null);
		
		// Euros
		JLabel EtiquetaEuros = new JLabel("Euros");
		EtiquetaEuros.setFont(EtiquetaEuros.getFont().deriveFont(EtiquetaEuros.getFont().getStyle() | Font.BOLD));
		EtiquetaEuros.setBounds(49, 29, 46, 14);
		Ventana.add(EtiquetaEuros);
		
		ValorEuros = new JTextField();
		ValorEuros.setBounds(26, 52, 86, 20);
		Ventana.add(ValorEuros);
		ValorEuros.setColumns(10);
		
		// Dolares
		JLabel EtiquetaDolares = new JLabel("Dolares");
		EtiquetaDolares.setFont(EtiquetaDolares.getFont().deriveFont(EtiquetaDolares.getFont().getStyle() | Font.BOLD));
		EtiquetaDolares.setBounds(240, 29, 46, 14);
		Ventana.add(EtiquetaDolares);
		
		ValorDolares = new JTextField();
		ValorDolares.setBounds(223, 52, 86, 20);
		Ventana.add(ValorDolares);
		ValorDolares.setColumns(10);
		
		// Boton de conversión
		JButton BotonConvertir = new JButton("Convertir");
		BotonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros=Float.parseFloat(ValorEuros.getText());
				ValorDolares.setText(String.valueOf(euros * ValorConversion));
			}
		});
		BotonConvertir.setBounds(122, 51, 91, 23);
		Ventana.add(BotonConvertir);
		

	}
}
