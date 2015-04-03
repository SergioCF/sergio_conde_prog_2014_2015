import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;


public class GridLayoutExample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutExample frame = new GridLayoutExample();
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
	public GridLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		
		JButton btnBoton = new JButton("boton 1");
		contentPane.add(btnBoton);
		
		JButton btnBoton_1 = new JButton("boton 2");
		contentPane.add(btnBoton_1);
		
		JButton btnBoton_3 = new JButton("boton 4");
		contentPane.add(btnBoton_3);
		
		JButton btnBoton_2 = new JButton("boton 3");
		contentPane.add(btnBoton_2);
		
		JButton btnBoton_4 = new JButton("boton 5");
		contentPane.add(btnBoton_4);
	}

}
