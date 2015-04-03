package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class modeloMisViajes {

	// Consultas SQL
	private final static String VIAJES_SEL="SELECT Destino FROM misviajes";
	private final static String VIAJE_COL="Destino";
			
	// Conexión
	private Connection conexion = null; // Maneja la conexión
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;
			
	// Viajes DB
	private ArrayList<String> destinos =null;

	public modeloMisViajes() {
		// Obtenemos la conexión de datos
		conexion=ConexionDB.getConexion();
	}
		
		public ArrayList getDestinos(){
			
			destinos = new ArrayList<String>();
			
			try{
				instruccion = this.conexion.createStatement();
				conjuntoResultados = instruccion.executeQuery(VIAJES_SEL);

				// Listaremos por pantalla los datos
				while( conjuntoResultados.next() ) {
					destinos.add(conjuntoResultados.getString(VIAJE_COL));
				}
				return destinos;
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
				return destinos;
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