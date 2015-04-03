import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CArdLayout extends JFrame {

	private JPanel contentPane;
	private JPanel Inferior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CArdLayout frame = new CArdLayout();
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
	public CArdLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel Superior = new JPanel();
		contentPane.add(Superior);
		Superior.setLayout(new BoxLayout(Superior, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("Panel 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout) Inferior.getLayout();
				c.show(Inferior, "PANEL1");
			}
		});
		Superior.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Panel 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout) Inferior.getLayout();
				c.show(Inferior, "PANEL2");
			}
		});
		Superior.add(btnNewButton_1);
		
		Inferior = new JPanel();
		contentPane.add(Inferior);
		Inferior.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		Inferior.add(panel1, "PANEL1");
		panel1.setLayout(null);
		
		JLabel lblPanel = new JLabel("PANEL 1");
		lblPanel.setBounds(10, 11, 46, 14);
		panel1.add(lblPanel);
		
		JButton btnNewButton_2 = new JButton(">>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout) Inferior.getLayout();
				c.show(Inferior, "PANEL2");
			}
		});
		btnNewButton_2.setBounds(10, 36, 89, 23);
		panel1.add(btnNewButton_2);
		
		JPanel panel2 = new JPanel();
		Inferior.add(panel2, "PANEL2");
		panel2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel 2");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel2.add(lblNewLabel);
		
		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout) Inferior.getLayout();
				c.show(Inferior, "PANEL1");
			}
		});
		button.setBounds(10, 36, 89, 23);
		panel2.add(button);
	}
}
