package Modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConexionDB {
	// DATOS DE LA CONEXION
	//Carga en ejecución - JDBC que conecta con MYSQL
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS DE LA BBDD
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	private String url;
	
	//Conexion
	private static Connection conexion = null;// maneja la conexión
	
	//Instancia unica
	private static ConexionDB instance = null;
	
	public ConexionDB(String HOST,String BBDD,String USER,String PASS) {
		// PARAMETROS que necesita la conexión
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
	}
	
	//Implementar SingleTon
	public static ConexionDB getInstance(String HOST,String BBDD,String USER,String PASS) {
	      if(instance == null) {
	         instance = new ConexionDB(HOST,BBDD,USER,PASS);
	      }
	      return instance;
	   }
	
	public boolean connectDB(){
		try{ // INTENTA CARGAR LA CLASE
			//Lo primero es cargar el controlador MySQL el cual automáticamente se registra
			Class.forName(CONTROLADOR_MYSQL);
			//Conectarnos a la BBDD
			conexion = DriverManager.getConnection(this.url,this.user,this.pass);
		}
		// CATCH DriverManager
		catch( SQLException excepcionSql ) // ERROR al intentar conectar
		{
			excepcionSql.printStackTrace();
			return false;
		}
		catch( ClassNotFoundException noEncontroClase) // SI NO ENCUENTRA LA CLASE
		{
			noEncontroClase.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static Connection getConexion(){
		return conexion;
	}


}
