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
	private JPanel contentPane, ventanas;
	private JMenu mnPrincipal, mnJuegos, mnPerfil;
	private JMenuBar menuBar;
	private JMenuItem mntmInicio, mntmNuevoJuego, mntmOpciones;
	
	VistaPrincipal vistaPrincipal = new VistaPrincipal(); // Creamos objeto vistaPrincipal
	VistaJuegos vistaJuegos = new VistaJuegos(); // Creamos objeto vistaJuegos
	
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 366);
		
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
		
		mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		mntmNuevoJuego = new JMenuItem("Nuevo Juego");
		mntmNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainController.getInstance().mostrarJuegos(); // Mostramos la ventana Juegos al hacer click
			}
		});
		mnJuegos.add(mntmNuevoJuego);
		
		mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		mntmOpciones = new JMenuItem("Opciones");
		mnPerfil.add(mntmOpciones);
	
		// Paneles
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		ventanas = new JPanel();
		contentPane.add(ventanas, BorderLayout.CENTER);
		ventanas.setLayout(new CardLayout(0, 0)); // CardLayout
		vistaPrincipal.setBackground(Color.WHITE);
		
		// Se añade el panel de vistaPrincipal al JPanel ventanas
		ventanas.add(vistaPrincipal, "panelVistaPrincipal"); 
		vistaPrincipal.setLayout(new BorderLayout(0, 0));
		
		// Se añade el panel de vistaJuegos al JPanel ventanas
		ventanas.add(vistaJuegos, "panelVistaJuegos"); 
		vistaJuegos.setLayout(new BorderLayout(0, 0));
		
	}
	
	// mostrarPrincipal
	public void cardPrincipal(ArrayList usuarios) {
		// Recibe un ArrayList usuarios desde MainController
		vistaPrincipal.sendUsers(usuarios); // Enviamos al metodo sendUsers de VistaPrincipal
		// Mostramos el CardLayout Ventanas
		CardLayout c = (CardLayout) this.ventanas.getLayout();
		c.show(ventanas, "panelVistaPrincipal");
	}
	
	// mostrarJuegos
	public void cardJuegos() {
		CardLayout c = (CardLayout) this.ventanas.getLayout();
		c.show(ventanas, "panelVistaJuegos");
	}
	
}
