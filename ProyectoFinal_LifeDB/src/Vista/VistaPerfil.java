package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import Controlador.MainController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JScrollPane;

public class VistaPerfil extends JPanel {
	
	// Inicialización de variables
	private JButton btnAgenda, btnCorreo, btnNotasRpidas, btnRss, btnNominas, btnDRenta, btnFacturacin, btnOtros;
	private JPanel panelVistaPerfil, cardVistaPerfil;
	
	VistaNotas vistaNotas = new VistaNotas(); // Creamos objeto vistaNotas
	VistaPerfilDef vistaPerfDef = new VistaPerfilDef(); // Creamos objeto vistaPerfDef

	public VistaPerfil() {
		
		setLayout(null);
		
		btnAgenda = new JButton("Agenda");
		btnAgenda.setBounds(25, 33, 91, 23);
		add(btnAgenda);
		
		btnCorreo = new JButton("Correo");
		btnCorreo.setBounds(126, 33, 91, 23);
		add(btnCorreo);
		
		btnNotasRpidas = new JButton("Notas r\u00E1pidas");
		btnNotasRpidas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNotasRpidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().mostrarNotas(); // Mostramos la ventana Notas al hacer click
			}
		});
		btnNotasRpidas.setBounds(328, 33, 91, 23);
		add(btnNotasRpidas);
		
		btnRss = new JButton("RSS");
		btnRss.setBounds(227, 33, 91, 23);
		add(btnRss);
		
		btnNominas = new JButton("N\u00F3minas");
		btnNominas.setBounds(227, 67, 91, 23);
		add(btnNominas);
		
		btnDRenta = new JButton("D. Renta");
		btnDRenta.setBounds(25, 67, 91, 23);
		add(btnDRenta);
		
		btnFacturacin = new JButton("Facturaci\u00F3n");
		btnFacturacin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFacturacin.setBounds(126, 67, 91, 23);
		add(btnFacturacin);
		
		btnOtros = new JButton("Otros");
		btnOtros.setBounds(328, 67, 91, 23);
		add(btnOtros);
		
		// Paneles
		panelVistaPerfil = new JPanel();
		panelVistaPerfil.setBounds(25, 101, 394, 188);
		add(panelVistaPerfil);
		panelVistaPerfil.setLayout(null);
		
		cardVistaPerfil = new JPanel();
		cardVistaPerfil.setBounds(0, 0, 394, 188);
		panelVistaPerfil.add(cardVistaPerfil);
		cardVistaPerfil.setLayout(new CardLayout(0, 0));
		
		// Panel por defecto
		// Se añade el panel de vistaPerfDef al JPanel cardVistaPerfil
		cardVistaPerfil.add(vistaPerfDef, "panelPerfilDef"); 
//		vistaPerfDef.setLayout(new BorderLayout(0, 0));
		
		// Se añade el panel de vistaNotas al cardLayout cardVistaPerfil
		cardVistaPerfil.add(vistaNotas, "panelVistaNotas");
//		vistaNotas.setLayout(new BorderLayout(0, 0));
		
	}
	
	// mostrarDefault
	public void cardDefault() {
		CardLayout c = (CardLayout) this.cardVistaPerfil.getLayout();
		c.show(cardVistaPerfil, "panelPerfilDef");
	}
	
	// mostrarNotas
	public void cardNotas() {
		CardLayout c = (CardLayout) this.cardVistaPerfil.getLayout();
		c.show(cardVistaPerfil, "panelVistaNotas");
	}
}
