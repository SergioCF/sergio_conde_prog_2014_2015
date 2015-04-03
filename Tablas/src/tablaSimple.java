import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;


public class tablaSimple extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablaSimple frame = new tablaSimple();
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
	public tablaSimple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Datos para la tabla
		String[] nombresColumnas = {"Nombre",
                "Apellidos",
                "Deporte",
                "Años",
                "Vegetariano"};
		Object[][] datos = {
			    {"Paco", "Gómez",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"Pedro", "Ramírez",
			     "Football", new Integer(3), new Boolean(true)},
			    {"Maria", "Sempere",
			     "Basketball", new Integer(2), new Boolean(false)},
			    {"Juan", "Domingo",
			     "Football", new Integer(20), new Boolean(true)},
			    {"Mercedes", "Luna",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		
		JTable table = new JTable(datos, nombresColumnas);
		//Cambio de la fuente de la cabecera
		table.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
		//Ocultar el grid
		table.setShowGrid(false);
		//Cambiar la fuente
		table.setFont(new Font("Tahoma",Font.ITALIC,10));
		table.setBackground(Color.ORANGE);
		
		JScrollPane scrollPane = new JScrollPane(table); //Scroll Vertical
		scrollPane.getViewport().setBackground(Color.ORANGE);
		
		
		contentPane.add(scrollPane);
	}

}
