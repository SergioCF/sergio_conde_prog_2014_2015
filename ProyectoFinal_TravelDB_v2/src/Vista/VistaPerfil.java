package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.CardLayout;
import java.util.ArrayList;

import Controlador.MainController;

public class VistaPerfil extends JPanel {
	
	// Inicialización de variables
	private JPanel panelVistaPerfil, cardVistaPerfil;
	private JButton btnViajes, btnOfertas, btnReservas, btnVolver, btnMisViajes, btnCalendario;
	
	// Objetos
	VistaMisViajes vistaMisViajes = new VistaMisViajes();
	VistaPerfilDef vistaPerfDef = new VistaPerfilDef();

	public VistaPerfil() {
		
		setLayout(null);
		
		// Botones
		
		btnViajes = new JButton("Viajes");
		btnViajes.setBounds(25, 25, 91, 23);
		add(btnViajes);
		
		btnOfertas = new JButton("Ofertas");
		btnOfertas.setBounds(126, 25, 91, 23);
		add(btnOfertas);
		
		btnReservas = new JButton("Reservas");
		btnReservas.setBounds(227, 25, 91, 23);
		add(btnReservas);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().mostrarPerfilDef();
			}
		});
		btnVolver.setBounds(328, 25, 91, 23);
		add(btnVolver);
		
		btnMisViajes = new JButton("Mis viajes");
		btnMisViajes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().mostrarMisViajes(); // Mostramos la ventana misViajes al hacer click
			}
		});
		btnMisViajes.setBounds(126, 59, 91, 23);
		add(btnMisViajes);
		
		btnCalendario = new JButton("Calendario");
		btnCalendario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCalendario.setBounds(227, 59, 91, 23);
		add(btnCalendario);
		
		// Paneles
		
		panelVistaPerfil = new JPanel();
		panelVistaPerfil.setBounds(25, 101, 394, 188);
		add(panelVistaPerfil);
		panelVistaPerfil.setLayout(null);
		
		cardVistaPerfil = new JPanel();
		cardVistaPerfil.setBounds(0, 0, 394, 188);
		panelVistaPerfil.add(cardVistaPerfil);
		cardVistaPerfil.setLayout(new CardLayout(0, 0));
			
		cardVistaPerfil.add(vistaPerfDef, "panelVistaDef");
			
		cardVistaPerfil.add(vistaMisViajes, "panelVistaMisViajes");
	}

	// cardMisViajes
	public void cardMisViajes(ArrayList destinos){
		// Recibe un ArrayList destinos desde MainController
		vistaMisViajes.sendDestinos(destinos);
		CardLayout c = (CardLayout) this.cardVistaPerfil.getLayout();
		c.show(cardVistaPerfil, "panelVistaMisViajes");
	}
	
	// cardPerfilDef
	public void cardPerfilDef(){
		CardLayout c = (CardLayout) this.cardVistaPerfil.getLayout();
		c.show(cardVistaPerfil, "panelVistaDef");
	}
	
}