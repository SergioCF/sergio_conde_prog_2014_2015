package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class modeloNotas {
	
		// Consultas SQL
		private final static String NOTAS_SEL="SELECT Descripcion FROM notas";
		private final static String NOTAS_DESC="Descripcion";
		
		// Conexión
		private Connection conexion = null; // Maneja la conexión
		private Statement instruccion = null;
		private ResultSet conjuntoResultados = null;
		
		// Usuarios DB
		private ArrayList<String> Descripcion =null;

	public modeloNotas() {
		// Obtenemos la conexión de datos
		conexion=ConexionDB.getConexion();
	}
	
	public ArrayList getNotas(){
		
		Descripcion = new ArrayList<String>();
		
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(NOTAS_SEL);

			// Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				Descripcion.add(conjuntoResultados.getString(NOTAS_DESC));
			}
			return Descripcion;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return Descripcion;
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
				//conexion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	}

}
