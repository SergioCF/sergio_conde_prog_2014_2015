package Vista;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Modelo.Travel;
import Modelo.modeloMisViajes;

public class VistaMisViajes extends JPanel {
	
	// Inicialización de variables
	private JList list;
	private DefaultListModel listModel;
	private JLabel lblHotel, lblTiempo, lblPrecio;
	private JTextField cajaTiempo, cajaPrecio, cajaHotel;
	
	// Datos para la carga de destinos
	modeloMisViajes destinos;

	public VistaMisViajes() {
		
		setLayout(null);
		
		// LABELS:
		
		lblHotel = new JLabel("Hotel");
		lblHotel.setBounds(259, 12, 86, 14);
		add(lblHotel);
		
		lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(259, 71, 86, 14);
		add(lblTiempo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(259, 126, 46, 14);
		add(lblPrecio);
		
		// CAJASTEXTOS:		
		
		cajaHotel = new JTextField();
		cajaHotel.setBounds(259, 38, 124, 20);
		add(cajaHotel);
		cajaHotel.setColumns(10);
		
		cajaTiempo = new JTextField();
		cajaTiempo.setBounds(259, 96, 124, 20);
		add(cajaTiempo);
		cajaTiempo.setColumns(10);
		
		cajaPrecio = new JTextField();
		cajaPrecio.setBounds(259, 151, 124, 20);
		add(cajaPrecio);
		cajaPrecio.setColumns(10);
		
		// JLIST
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// Evento para mostrar en los campos los datos
		list.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent listSelectionEvent){
				Travel travel=(Travel)listModel.getElementAt(list.getSelectedIndex());
				cajaHotel.setText(travel.getHotel());
				cajaTiempo.setText(travel.getTiempo());
				cajaPrecio.setText(travel.getPrecio());
			}
		});
		list.setBounds(28, 11, 221, 160);
		add(list);
	}
	
	// sendDestinos & rellenado
	public void sendDestinos(ArrayList destinos){
		Iterator<Travel> it =destinos.iterator();
		listModel.removeAllElements();
			while (it.hasNext()){
				Travel travel=(Travel)it.next();
				listModel.addElement(travel);
			}		
	}

}