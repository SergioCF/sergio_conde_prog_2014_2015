import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class VentanaCondiciones  extends JFrame {
	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textMsg;

	public VentanaCondiciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(10, 47, 149, 22);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduce un n\u00FAmero positivo");
		lblNewLabel.setBounds(10, 24, 170, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mensaje");
		lblNewLabel_1.setBounds(10, 95, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		textMsg = new JTextField();
		textMsg.setEditable(false);
		textMsg.setBounds(10, 120, 149, 20);
		contentPane.add(textMsg);
		textMsg.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtCaja="";
				int numCaja=0;
				
				txtCaja=textNum.getText();
				numCaja=Integer.parseInt(txtCaja);
				
				System.out.println(numCaja);
				
				//Condición
				if(numCaja>=0){
					//Si es verdadera la condición
					textMsg.setText("OK");
				}else{
					//Si no es verdadera que hago
					textMsg.setText("No es un número positivo");
				}
			}
		});
		btnNewButton.setBounds(186, 47, 144, 23);
		contentPane.add(btnNewButton);
	}
}
