package Controller;

import java.awt.CardLayout;
import java.util.ArrayList;

import Model.ConexionDB;
import Model.UsuariosModel;
import Model.User;
import View.MainAppView;


public class MainController {
	
	//Instancia unica
	private static MainController instance = null;
	//Atributos de bases de datos
	ConexionDB corredoresDB;
	
	//VentanaPrincipal
	private MainAppView vMain;
	
	//Autenticador
	private Autenticar auth;
	private User usuarioRegistrado=null;

	private MainController() {
		//Creamos la conexion con la base de datos
		corredoresDB=ConexionDB.getInstance("localhost","corredoresDB","root","");
		if(corredoresDB.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
		//Creamos el objeto de autenticacion
		auth=new Autenticar();
		
		this.showMain();
	}
	
	
	//Implementar SingleTon
	public static MainController getInstance() {
	      if(instance == null) {
	         instance = new MainController();
	      }
	      return instance;
	}
	
	//Lanzar vista Inicial
	public void showMain(){
		//Consultamos los usuarios
		UsuariosModel uModel=new UsuariosModel();
		ArrayList<String> usuarios=uModel.getUsuarios();
		//Lanzamos la ventana principal
		vMain = new MainAppView();
		//Cargamos datos de Usuarios
		vMain.showInicial(usuarios);
		//Hacemos visible la pantalla inicial
		vMain.setVisible(true);	
	}
	
	//Lanzar corredores
	public void showCorredores(){
		if(usuarioRegistrado==null){
			vMain.mensajeInf("No se ha iniciado con usuario");
		}else{
			vMain.showCorredores();
		}
	}
	
	//Lanzar Inicio
	public void showInicio(){
		vMain.showInicial();
	}
	
	//Comprobar usuarios
	public void checkUser(String usuario,char[] pass){
		//Aquí comprobaríamos el usuario
		usuarioRegistrado=new User();
		vMain.showCorredores();
	}
}
