package Vista;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JList;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextField;
import javax.swing.JLabel;

import Modelo.modeloMisViajes;

public class VistaMisViajes extends JPanel {
	
	// Inicialización de variables
	private JList list;
	private DefaultListModel jModel;
	private JLabel lblDestino, lblTiempo, lblPrecio;
	private JTextField cajaTiempo, cajaPrecio, cajaDestino;
	
	// Datos para la carga de destinos
	modeloMisViajes destinos;

	public VistaMisViajes() {
		
		setLayout(null);
		
		// LABELS:
		
		lblDestino = new JLabel("Destino");
		lblDestino.setBounds(259, 12, 86, 14);
		add(lblDestino);
		
		lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(259, 71, 86, 14);
		add(lblTiempo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(259, 126, 46, 14);
		add(lblPrecio);
		
		// CAJASTEXTOS:		
		
		cajaDestino = new JTextField();
		cajaDestino.setBounds(259, 38, 124, 20);
		add(cajaDestino);
		cajaDestino.setColumns(10);
		
		cajaTiempo = new JTextField();
		cajaTiempo.setBounds(259, 96, 124, 20);
		add(cajaTiempo);
		cajaTiempo.setColumns(10);
		
		cajaPrecio = new JTextField();
		cajaPrecio.setBounds(259, 151, 124, 20);
		add(cajaPrecio);
		cajaPrecio.setColumns(10);
		
		// JLIST
		
		jModel = new DefaultListModel();
		list = new JList(jModel);
		list.setBounds(28, 11, 221, 160);
		add(list);
	}
	
	// sendDestinos & rellenado
	public void sendDestinos(ArrayList destinos){
		Iterator<String> it =destinos.iterator();
			while (it.hasNext()){
				jModel.addElement((String)it.next());;
			}		
	}

}