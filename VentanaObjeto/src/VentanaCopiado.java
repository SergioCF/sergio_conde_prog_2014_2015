import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCopiado extends JFrame{
	private JPanel contentPane;
	private JTextField caja1;
	private JLabel etiqueta2;
	private JTextField caja2;
	private JLabel etiqueta1;
	private JButton btnNewButton;
	
	public VentanaCopiado() {
		
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas Texto
		caja1 = new JTextField();
		caja1.setBounds(23, 37, 86, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(23, 104, 86, 20);
		contentPane.add(caja2);
		
		//Etiquetas
		etiqueta2 = new JLabel("Campo1");
		etiqueta2.setBounds(23, 11, 86, 20);
		contentPane.add(etiqueta2);

		etiqueta1 = new JLabel("Campo2");
		etiqueta1.setBounds(23, 78, 86, 20);
		contentPane.add(etiqueta1);
		
		//Botones
		btnNewButton = new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			caja2.setText(caja1.getText());
			}
		});
		btnNewButton.setBounds(143, 36, 91, 23);
		contentPane.add(btnNewButton);
	}
}
