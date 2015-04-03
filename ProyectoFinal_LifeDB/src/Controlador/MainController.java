package Controlador;

import java.util.ArrayList;

import Controlador.MainController;
import Modelo.ConexionDB;
import Modelo.modeloNotas;
import Modelo.modeloUsuarios;
import Vista.VistaApp;
import Vista.VistaNotas;
import Vista.VistaPerfil;


public class MainController {

		// Instancia unica
		private static MainController instance = null;
		
		// Atributos de la BBDD
		ConexionDB lifeDB;
					
		// Mostramos las ventanas			
		VistaApp vistaApp;
		
		// Autenticar
		Autenticar auth;
		
		// Usuarios
		modeloUsuarios usuarios=null;
		
		// Notas
		modeloNotas Descripcion=null;
	
		// Conectamos y comprobamos	
		private MainController() {
			
			// Generado el objeto			
			lifeDB = ConexionDB.getInstance("localhost","gamedb","root","");
			if(lifeDB.connectDB()==true){
				System.out.println("CONECTADOS CON EXITO");
			}else{ 
				System.out.println("ERROR EN LA CONEXION");
			}
			this.showMain();
			
			auth = new Autenticar();
			Descripcion = new modeloNotas();
			
		}
		
		
	
		// Implementar SingleTon
		public static MainController getInstance() {
		      if(instance == null){
		         instance = new MainController();
		      }
		      return instance;
		}
		
		// AUTENTICAR: "Esqueleto, no se realiza comprobación de contraseña"
		public void logear(){
			this.auth.comprobarUser();
			// Entonces mostramos las vistas
			this.mostrarPerfil();
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
		
		// LANZAMIENTO DE VISTAS:
		
		// ****************** VENTANA VistaApp ******************
		// Lanzar vistaPrincipal
		public void  mostrarPrincipal() {
			// Cargamos vista y enviamos usuarios
			vistaApp.cardPrincipal(usuarios.getUsuarios());
		}
		
		// Lanzar mostrarPerfil
		public void mostrarPerfil() {	
			vistaApp.cardPerfil();		
		}
		
		// ****************** VENTANA VistaPerfil ******************
		
		// Lanzar mostrarDefault
		public void mostrarDefault() {	
			
		}
		
		// Lanzar mostrarNotas
		public void mostrarNotas() {
			vistaApp.mostrarNotas(Descripcion.getNotas());
		}
		

}