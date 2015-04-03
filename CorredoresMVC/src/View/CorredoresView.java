package View;

import javax.swing.JPanel;
import javax.swing.JButton;

import Controller.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CorredoresView extends JPanel {

	/**
	 * Create the panel.
	 */
	public CorredoresView() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().showInicio();
			}
		});
		btnNewButton.setBounds(10, 11, 357, 23);
		add(btnNewButton);

	}

}
