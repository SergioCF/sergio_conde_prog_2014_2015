import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class UnBoton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnBoton frame = new UnBoton();
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
	public UnBoton() {
		
		//Panel visual
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 172, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja 1
		JLabel lblValor = new JLabel("Valor1");
		lblValor.setBounds(27, 25, 78, 20);
		contentPane.add(lblValor);
		
		JTextPane caja1 = new JTextPane();
		caja1.setBounds(27, 56, 78, 20);
		contentPane.add(caja1);
		
		//Caja 2
		JLabel lblValor_1 = new JLabel("Valor2");
		lblValor_1.setBounds(27, 87, 78, 20);
		contentPane.add(lblValor_1);
		
		JTextPane caja2 = new JTextPane();
		caja2.setBounds(27, 122, 78, 20);
		contentPane.add(caja2);
	}
}
