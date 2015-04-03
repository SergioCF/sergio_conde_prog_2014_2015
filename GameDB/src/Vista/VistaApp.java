package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaApp extends JFrame {
	
	// Inicialización de variables

	public JPanel contentPane;
	public JPanel ventanas;
	
	VistaPrincipal vistaPrincipal = new VistaPrincipal(); // Creamos el objeto VistaPrincipal
	VistaJuegos vistaJuegos = new VistaJuegos(); // Creamos el objeto VistaJuegos

	
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 366);
		
		// Menu y botones
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmInicio = new JMenuItem("Inicio");
		mntmInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c = (CardLayout) ventanas.getLayout();
				c.show(ventanas, "vistaPrincipal");	
			}
		});
		mnPrincipal.add(mntmInicio);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmNuevoJuego = new JMenuItem("Nuevo Juego");
		mntmNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) ventanas.getLayout();
				c.show(ventanas, "vistaJuegos");	
			}
		});
		mnJuegos.add(mntmNuevoJuego);		
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmOpciones = new JMenuItem("Opciones");
		mnPerfil.add(mntmOpciones);
		
		// PANELES
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ventanas = new JPanel();
		contentPane.add(ventanas, BorderLayout.CENTER);
		ventanas.setLayout(new CardLayout(0, 0));
		
		ventanas.add(vistaPrincipal, "vistaPrincipal");
		ventanas.add(vistaJuegos, "vistaJuegos");
		
		
	}
}
