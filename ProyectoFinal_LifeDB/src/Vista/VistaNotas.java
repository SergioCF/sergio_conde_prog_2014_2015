package Vista;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class VistaNotas extends JPanel {
	
	// Inicialización de variables
	private JList list;
	private DefaultListModel jModel;
	private JButton btnNuevaNota, btnEditarNota, btnVolver;

	public VistaNotas() {
		
		setLayout(null);
		
		jModel = new DefaultListModel();
		list = new JList(jModel);
		list.setBounds(28, 11, 221, 160);
		add(list);
		
		btnNuevaNota = new JButton("Nueva");
		btnNuevaNota.setBounds(283, 31, 91, 23);
		add(btnNuevaNota);
		
		btnEditarNota = new JButton("Editar");
		btnEditarNota.setBounds(283, 75, 91, 23);
		add(btnEditarNota);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(283, 122, 91, 23);
		add(btnVolver);

	}
	
	// sendDescripcion & rellenado
		public void sendNotas(ArrayList Descripcion){
			Iterator<String> it =Descripcion.iterator();
			while (it.hasNext()){
				jModel.addElement(it);;
			}		
	}
}
