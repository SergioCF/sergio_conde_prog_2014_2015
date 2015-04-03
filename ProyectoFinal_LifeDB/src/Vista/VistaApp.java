package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Controlador.MainController;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaApp extends JFrame {
	
	// Inicialización de variables
	private JMenu mnPrincipal, mnOpciones, mnAyuda;
	private JMenuBar menuBar;
	private JMenuItem mntmInicio, mntmPerfil, mntmOpciones, mntmAcercade, mntmConfig;
	private JPanel panel, ventanas;
	
	VistaPrincipal vistaPrincipal = new VistaPrincipal(); // Creamos objeto vistaPrincipal
	VistaPerfil vistaPerfil = new VistaPerfil(); // Creamos objeto vistaPerfil
	VistaNotas vistaNotas = new VistaNotas();
	
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 380);
		
		// Menu y botones
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		mntmInicio = new JMenuItem("Inicio");
		mntmInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainController.getInstance().mostrarPrincipal(); // Mostramos la ventana Principal al hacer click
			}
		});
		mnPrincipal.add(mntmInicio);
		
		mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().mostrarPerfil(); // Mostramos la ventana Perfil al hacer click
			}
		});
		mnOpciones.add(mntmPerfil);
		
		mntmConfig = new JMenuItem("Configuraci\u00F3n");
		mnOpciones.add(mntmConfig);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmOpciones = new JMenuItem("Soporte");
		mnAyuda.add(mntmOpciones);
		
		mntmAcercade = new JMenuItem("Acerca de");
		mnAyuda.add(mntmAcercade);
		getContentPane().setLayout(null);
		
		// Paneles
		panel = new JPanel();
		panel.setBounds(0, 0, 464, 332);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		ventanas = new JPanel();
		ventanas.setBounds(0, 0, 464, 332);
		panel.add(ventanas);
		ventanas.setLayout(new CardLayout(0, 0)); // CardLayout
		
		// Se añade el panel de vistaPrincipal al JPanel ventanas
		ventanas.add(vistaPrincipal, "panelVistaPrincipal"); 
		vistaPrincipal.setLayout(new BorderLayout(0, 0));
				
		// Se añade el panel de vistaPerfil al JPanel ventanas
		ventanas.add(vistaPerfil, "panelVistaPerfil"); 
		vistaPerfil.setLayout(new BorderLayout(0, 0));
		
	}
	
	// mostrarPrincipal
	public void cardPrincipal(ArrayList usuarios) {
		// Recibe un ArrayList usuarios desde MainController
		vistaPrincipal.sendUsers(usuarios); // Enviamos al metodo sendUsers de VistaPrincipal
		// Mostramos el CardLayout Ventanas
		CardLayout c = (CardLayout) this.ventanas.getLayout();
		c.show(ventanas, "panelVistaPrincipal");
	}
	
	// mostrarPerfil
	public void cardPerfil() {
		// Mostramos el CardLayout Ventanas
		CardLayout c = (CardLayout) this.ventanas.getLayout();
		c.show(ventanas, "panelVistaPerfil");
	}
	
	// mostrarNotas
	public void mostrarNotas(ArrayList Descripcion) {
		vistaNotas.sendNotas(Descripcion);
		vistaPerfil.cardNotas();
	}
	
}
