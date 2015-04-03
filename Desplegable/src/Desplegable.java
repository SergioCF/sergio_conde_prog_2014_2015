import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class Desplegable extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desplegable frame = new Desplegable();
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
	public Desplegable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		comboBox.setBounds(10, 24, 162, 20);
		contentPane.add(comboBox);
		
		comboBox.addItem("Paco");
		String nombre="Pepe";
		comboBox.addItem(nombre);
		comboBox.addItem("Pedro");
		
		comboBox.setSelectedItem("Pepo");
		
		
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println(comboBox.getSelectedItem());
			}
		});
	}

}
