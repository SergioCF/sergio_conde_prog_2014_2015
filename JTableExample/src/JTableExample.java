import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class JTableExample extends 	JFrame{
	
	// Objetos visuales del ejemplo
	private	JPanel		topPanel;
	private	JTable		table;
	private	JScrollPane scrollPane;
	JTextField texto;

	// Constructor
	public JTableExample()
	{
		// Caracteristicas gen;erales
		setTitle( "JTable Ejemplo" );
		setSize( 300, 200 );
		setBackground( Color.gray );

		// Contenedor del JTable
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Columnas
		String columnNames[] = { "Col1", "Col2", "Col3" };

		// Datos
		String dataValues[][] =
		{
			{ "12", "234", "67" },
			{ "-123", "43", "853" },
			{ "93", "89.2", "109" },
			{ "279", "9033", "3092" }
		};

		// Añadimos datos y columnas a la JTable
		table = new JTable( dataValues, columnNames );
		
		table.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent evnt) {
		        if (evnt.getClickCount() == 1) {
		        	texto.setText((String)table.getValueAt(table.getSelectedRow(),1));
		         }
		     }
		});

		//Comprobacion de la seleccion
		texto = new JTextField(20);
		// Añadimos scrolling al PAnel
		scrollPane = new JScrollPane( table );
		topPanel.add( scrollPane, BorderLayout.CENTER );
		topPanel.add(texto, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		// Create an instance of the test application
		JTableExample mainFrame	= new JTableExample();
		mainFrame.setVisible( true );

	}

}
