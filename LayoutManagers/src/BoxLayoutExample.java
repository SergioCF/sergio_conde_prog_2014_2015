import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;


public class BoxLayoutExample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxLayoutExample frame = new BoxLayoutExample();
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
	public BoxLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JButton btnBoton = new JButton("Boton1");
		btnBoton.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnBoton);
		
		JButton btnBoton_1 = new JButton("Boton2");
		btnBoton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnBoton_1);
		
		JButton btnBoton_2 = new JButton("Boton3");
		btnBoton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnBoton_2);
		
		JButton button = new JButton("Boton3");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Boton3");
		button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Boton3");
		button_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(button_2);
	}

}
