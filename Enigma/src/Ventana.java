import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Ventana extends JFrame {
	
	// Variables en la ventana
	private JPanel contentPane;
	private JTextField texto;
	private JTextField numDesplaz;
	private JTextField textoCifrado;
	
	// Variables para la encriptación
	String textoCifrandose="";
	
	// Llamamos a la clase constructor Cesar para poder utilizar métodos de Cesar
	Cesar Datos=new Cesar();
	
	// Ventana
	public Ventana() {
		
		// Propiedades de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Inicio: Propiedades de los atributos de ventana ----------->
		JLabel lblIntroduceUnaFrase = new JLabel("Introduce una frase corta o palabra:");
		lblIntroduceUnaFrase.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduceUnaFrase.setBounds(29, 44, 389, 14);
		contentPane.add(lblIntroduceUnaFrase);
		
		texto = new JTextField();
		texto.setBounds(29, 69, 389, 20);
		contentPane.add(texto);
		texto.setColumns(10);
		
		JLabel lblIntroduceUnValor = new JLabel("Introduce un valor para encriptar el mensaje:");
		lblIntroduceUnValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduceUnValor.setBounds(29, 113, 389, 14);
		contentPane.add(lblIntroduceUnValor);
		
		numDesplaz = new JTextField();
		numDesplaz.setBounds(29, 138, 44, 20);
		contentPane.add(numDesplaz);
		numDesplaz.setColumns(10);
		
		JLabel lblMensajeCifrado = new JLabel("Mensaje Cifrado:");
		lblMensajeCifrado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMensajeCifrado.setBounds(29, 206, 100, 14);
		contentPane.add(lblMensajeCifrado);
		
		textoCifrado = new JTextField();
		textoCifrado.setBounds(29, 231, 389, 20);
		contentPane.add(textoCifrado);
		textoCifrado.setColumns(10);
		
		// Botón de cifrado
		JButton botonCifraElMensaje = new JButton("Cifra el mensaje !");
		botonCifraElMensaje.setBounds(160, 164, 132, 23);
		contentPane.add(botonCifraElMensaje);
		// Acción de hacer click en el botón "botonCifraElMensaje"
		botonCifraElMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					// Vuelvo a inicializar la variable textoCifrandose para evitar futuros errores
					textoCifrandose="";
					
					// Variables y transformación para su uso dentro de este método exclusivamente
					
					String numero=numDesplaz.getText(); // Se añade el contenido del JTextField a un string para:
					int numD = Integer.parseInt(numero);// convertirlo a un número entero con "parseInt" y poder usarlo después
					
					String abecedario=Datos.getAbc();// Se añade el contenido del abecedario que viene desde el constructor Cesar
													 // para su posterior uso también en los bucles for posteriores
					
					String text = texto.getText(); // Se añade el contenido del JTextField a un string por los motivos anteriores
					
					// ENCRIPTADOR
					// En primer lugar, recorreremos los 2 strings caracter a caracter para su posterior comparación
					for(int i=0; i<=text.length(); i++){
						for(int j = 0; j<abecedario.length(); j++){
							// Con charAt estraigo cada valor del string "texto" de cada posicion "i"
							// y lo comparo a la vez con "abecedario"
							if (text.charAt(i) == abecedario.charAt(j)){ // Comparamos los 2 caracteres de cada String y si son iguales:
								// Comparamos a la vez si el tamaño de j + numD es mayor que en este caso 26(abecedario)
								// Esto se hace para poder volver a la misma posición del string de la siguiente forma:
								if (j + numD >= abecedario.length()){ // Si es mayor que el abecedario, se pasa de la "z" el recorrido:
									
									// Con % se obtiene el valor del resto de dividir j+desplazamiento con el tamaño del abecedario
									// Ejemplo:
									// Si j+desplazamiento = 27 y estamos comparando una "Z", el desplazamiento es 1,
									// el resto de dividir 27 entre 26 seria = 1 por lo tanto:
									// si llegasemos a la z tendriamos que volver a empezar por la A, ese 1 del resto nos situa en la A
									// Sobretodo para desplazamientos más grandes (ejemplo: "numD=1256"), esté método le hace más eficaz.
									
									// Y por supuesto, se añade ese caracter transformado al string textoCifrandose concatenadose con "+="
									textoCifrandose += abecedario.charAt((j + numD) % abecedario.length());
								}
								else{ // Si no es mayor, el recorrido es simple por lo tanto añadimos el caracter transformado al string
									textoCifrandose += abecedario.charAt(j + numD);
								}
							}
						}
					}
				
					}catch (Exception  a){
						
					}
					// Se añade a "textoCifrado" el contenido de "textoCifrandose"
					// de esta forma se mostará en el JTextField "textoCifrado" el mensaje encriptado
					textoCifrado.setText(textoCifrandose);
			}
		}); // END Botón
		// <----------- Fin: Propiedades de los atributos de Ventana
	}

}
