import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class BorderLayoutExample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutExample frame = new BorderLayoutExample();
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
	public BorderLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		JButton btnCabecera = new JButton("Cabecera");
		contentPane.add(btnCabecera, BorderLayout.NORTH);
		
		JButton btnPie = new JButton("Pie");
		contentPane.add(btnPie, BorderLayout.SOUTH);
		
		JButton btnIzquierda = new JButton("Izquierda");
		contentPane.add(btnIzquierda, BorderLayout.WEST);
		
		JButton btnDerecha = new JButton("Derecha");
		contentPane.add(btnDerecha, BorderLayout.EAST);
		
		JButton btnCentral = new JButton("Central");
		contentPane.add(btnCentral, BorderLayout.CENTER);
	}

}
