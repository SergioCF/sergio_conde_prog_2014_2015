import Modelo.ConexionDB;
import Modelo.modeloUsuarios;
import Vista.VistaApp;

public class GamesDBApp {

	public static void main(String[] args) {
		
		//Establecemos la conexion a la base de datos
		ConexionDB gameDB;
		//Generado el objeto
		gameDB = new ConexionDB("localhost","gamedb","root","");

				if(gameDB.connectDB()==true)System.out.println("CONECTADOS CON EXITO");
				else System.out.println("ERROR EN LA CONEXION");
		
		// Mostramos la ventana VistaApp
		VistaApp vistaApp = new VistaApp();
		vistaApp.setVisible(true);

	}

}
