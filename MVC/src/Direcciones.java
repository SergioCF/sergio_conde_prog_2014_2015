import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Direcciones extends JFrame {

	private JPanel contentPane;
	private JComboBox tiposDireccion;
	private JButton mostrarDirecc;
	private JTextField cajaDirecc;
	
	Datos datos;
	private String tiposDireccionesDatos[];

	/**
	 * Create the frame.
	 */
	public Direcciones(int language) {
		
		//Generamos y configuramos  la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*Configurando los elementos*/
		tiposDireccion = new JComboBox();
		tiposDireccion.setBounds(10, 34, 224, 20);
		contentPane.add(tiposDireccion);
		
		mostrarDirecc = new JButton("Cargar");
		mostrarDirecc.setBounds(284, 33, 89, 23);
		contentPane.add(mostrarDirecc);
		
		cajaDirecc = new JTextField();
		cajaDirecc.setBounds(10, 101, 224, 20);
		contentPane.add(cajaDirecc);
		cajaDirecc.setColumns(10);
		
		datos=new Datos(language);
		tiposDireccionesDatos=datos.getTiposDirecc();
		/*Cargar datos en combobox*/
		for(int i=0;i<tiposDireccionesDatos.length;i++)
		{
			tiposDireccion.addItem(tiposDireccionesDatos[i]);
		}
		
		/*Accion del boton*/
		mostrarDirecc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cajaDirecc.setText((String)tiposDireccion.getSelectedItem());
			}
		});
	}
}
