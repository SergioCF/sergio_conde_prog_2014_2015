package Controlador;

import Controlador.MainController;
import Modelo.ConexionDB;
import Modelo.modeloMisViajes;
import Modelo.modeloUsuarios;
import Vista.VistaApp;
import Vista.VistaMisViajes;
import Vista.VistaPerfil;


public class MainController {

		// Instancia unica
		private static MainController instance = null;
		
		// Atributos de la BBDD
		ConexionDB traveldb;
					
		// Mostramos las ventanas			
		VistaApp vistaApp;
		VistaPerfil vistaPerf;
		VistaMisViajes vistaMisViajes;
		
		// Autenticar
		Autenticar auth;
		
		// Modelos
		modeloUsuarios usuarios=null;
		modeloMisViajes destinos=null;
	
		// Conectamos y comprobamos	
		private MainController() {
			
			// Generado el objeto			
			traveldb = ConexionDB.getInstance("localhost","traveldb","root","");
			if(traveldb.connectDB()==true){
				System.out.println("CONECTADOS CON EXITO");
			}else{ 
				System.out.println("ERROR EN LA CONEXION");
			}
			this.showMain();
			
			auth = new Autenticar();
			destinos = new modeloMisViajes();
			vistaPerf = new VistaPerfil();
			vistaMisViajes = new VistaMisViajes();

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
		
		// Lanzar vistaPrincipal
		public void  mostrarPrincipal() {
			// Cargamos vista y enviamos usuarios
			vistaApp.cardPrincipal(usuarios.getUsuarios());
		}
		
		// Lanzar mostrarPerfil
		public void mostrarPerfil() {	
			vistaApp.cardPerfil();		
		}
		
		// Lanzar mostrarPerfilDef (Vista DEFAULT del panel de VistaPerfil)
		public void mostrarPerfilDef(){
			vistaApp.mostrarPerfilDef();
		}
		
		// Lanzar mostrarMisViajes
		public void mostrarMisViajes(){
			vistaApp.mostrarMisViajes(destinos.getDestinos());
		}

}