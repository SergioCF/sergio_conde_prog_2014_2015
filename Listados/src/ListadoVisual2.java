import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ListadoVisual2 extends JFrame {

	private JPanel contentPane;
	Color colores[] = { Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,
			Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};
	JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoVisual2 frame = new ListadoVisual2();
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
	public ListadoVisual2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		
		//Listado de colores
		String nombresColores[] = {"Negro","Azul","Cyan",
				"Gris oscuro","Gris","Verde","Gris claro","Magenta",
				"Naranja","Rosa","Rojo","Blanco","Amarillo" };

		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		list = new JList(nombresColores);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(list);
		
		//EVENTO De SELECCION
		list.addListSelectionListener(
				new ListSelectionListener(){					
					public void valueChanged( ListSelectionEvent evento ){
						getContentPane().setBackground(
								colores[ list.getSelectedIndex() ] );
					}// fin del método valueChanged
				}
		);
		contentPane.add(scrollPane);
	}

}
