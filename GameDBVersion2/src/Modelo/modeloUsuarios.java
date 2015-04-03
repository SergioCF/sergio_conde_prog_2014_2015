package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;


public class modeloUsuarios {
	
	//DEVOLVER CORREDORES
	private final static String USUARIOS_SEL="SELECT usuario FROM usuarios";
	private final static String USUARIO_COL="usuario";
	
	//Conexión
	private Connection conexion = null;// maneja la conexión
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;
	
	//Usuarios DB
	private ArrayList<String> usuarios =null;
	
	public modeloUsuarios() {
		//Obtenemos la conexión de datos
		conexion=ConexionDB.getConexion();
		//Inicializamos el array de usuarios
		usuarios=new ArrayList<String>();
	}

	//UsuariosDB
	public ArrayList getUsuarios(){
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);

			//Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				usuarios.add(conjuntoResultados.getString(USUARIO_COL));
			}// fin de while
			return usuarios;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return usuarios;
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
				conexion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	}
	
	

}