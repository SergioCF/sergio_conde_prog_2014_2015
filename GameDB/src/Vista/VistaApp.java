package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VistaApp extends JFrame {
	
	// Inicialización de variables

	private JPanel contentPane;
	VistaPrincipal vistaPrincipal = new VistaPrincipal(); // llamamos al panel

	
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 366);
		
		//Menu y botones
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmInicio = new JMenuItem("Inicio");
		mnPrincipal.add(mntmInicio);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmNuevoJuego = new JMenuItem("Nuevo Juego");
		mnJuegos.add(mntmNuevoJuego);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmOpciones = new JMenuItem("Opciones");
		mnPerfil.add(mntmOpciones);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Paneles
		JPanel ventanas = new JPanel();
		contentPane.add(ventanas, BorderLayout.CENTER);
		ventanas.setLayout(new BorderLayout(0, 0));
		//Se añade el panel de vistaPrincipal al JPanel ventanas
		ventanas.add(vistaPrincipal, BorderLayout.CENTER); 
		vistaPrincipal.setLayout(new BorderLayout(0, 0));
		
		
	}
}
