import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

//Ejemplo de Lista
public class ListadoVisual extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoVisual frame = new ListadoVisual();
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
	public ListadoVisual() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		
		//Listado de colores
		String labels[] = { "A", "B", "C", "D","E", "F", "G", "H","I", "J" ,"A", "B", "C", "D","E", "F", "G", "H","I", "J"};
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList(labels);
		JScrollPane scrollPane = new JScrollPane(list);
		
		contentPane.add(scrollPane);
	
		

	}
}
