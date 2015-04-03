import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class VentanaExcepciones extends JFrame {

	private JPanel contentPane;
	private JTextField cajaA;
	private JTextField cajaB;
	private JTextField cajaC;
	private JTextField txtOp;

	/**
	 * Create the frame.
	 */
	public VentanaExcepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cajaA = new JTextField();
		cajaA.setBounds(33, 40, 86, 20);
		contentPane.add(cajaA);
		cajaA.setColumns(10);
		
		cajaB = new JTextField();
		cajaB.setBounds(33, 103, 86, 20);
		contentPane.add(cajaB);
		cajaB.setColumns(10);
		
		//Botón multiplicación
		JButton btnNewButton = new JButton("x");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=0;
				int b=0;
				int c=0;
				
				try{
					a=Integer.parseInt(cajaA.getText());
					b=Integer.parseInt(cajaB.getText());
				
					c=a*b;
				
					cajaC.setText(String.valueOf(c));
				
					//Fenomenal
					txtOp.setText("Todo de PM");
				}catch(Exception e){
					//Fallo
					txtOp.setText("Algo ha fallado");
				}
			}
		});
		btnNewButton.setBounds(136, 64, 49, 33);
		contentPane.add(btnNewButton);
		
		cajaC = new JTextField();
		cajaC.setBounds(209, 70, 86, 20);
		contentPane.add(cajaC);
		cajaC.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mensaje");
		lblNewLabel.setBounds(33, 157, 86, 14);
		contentPane.add(lblNewLabel);
		
		txtOp = new JTextField();
		txtOp.setBounds(33, 182, 86, 20);
		contentPane.add(txtOp);
		txtOp.setColumns(10);
	}
}
