package Controlador;

import java.util.ArrayList;

import Controlador.MainController;
import Modelo.ConexionDB;
import Modelo.modeloUsuarios;
import Vista.VistaApp;


public class MainController {

		// Instancia unica
		private static MainController instance = null;
		
		// Atributos de la BBDD
		ConexionDB gameDB;
					
		// Mostramos las ventanas			
		VistaApp vistaApp;
			
		// Usuarios
		modeloUsuarios usuarios=null;
	
		// Conectamos y comprobamos	
		private MainController() {
			// Generado el objeto
			gameDB = ConexionDB.getInstance("localhost","gamedb","root","");

			if(gameDB.connectDB()==true){
				System.out.println("CONECTADOS CON EXITO");
			}else{ 
				System.out.println("ERROR EN LA CONEXION");
			}
			
			this.showMain();	
		}
	
		// Implementar SingleTon
		public static MainController getInstance() {
		      if(instance == null){
		         instance = new MainController();
		      }
		      return instance;
		}
		
		// ShowMain
		public void showMain() {
			// Cargamos modelos necesarios para la vista
			if (usuarios==null){
				usuarios=new modeloUsuarios();
			}
			// Lanzamos la ventana principal
			vistaApp = new VistaApp();
			// Mostramos la vista principal
			mostrarPrincipal();
			// Vuelve visible la VistaApp
			vistaApp.setVisible(true);
		}

		// Lanzar vistaPrincipal
		public void  mostrarPrincipal() {
			// Cargamos vista y enviamos usuarios
			vistaApp.cardPrincipal(usuarios.getUsuarios());
		}
		
		// Lanzar mostrarJuegos
		public void mostrarJuegos() {	
			vistaApp.cardJuegos();		
		}

}