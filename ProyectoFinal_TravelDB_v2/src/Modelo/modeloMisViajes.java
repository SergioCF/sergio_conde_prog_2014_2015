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
	private final static String HOTEL_COL="Hotel";
	private final static String TIEMPO_COL="Tiempo";
	private final static String PRECIO_COL="Precio";
			
	// Conexión
	private Connection conexion = null; // Maneja la conexión
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;
			
	// Viajes DB
	private ArrayList<Travel> destinos =null;

	public modeloMisViajes() {
		// Obtenemos la conexión de datos
		conexion=ConexionDB.getConexion();
		// Creamos el objeto destinos
		destinos = new ArrayList<Travel>();
	}
		
		public ArrayList getDestinos(){
			
			try{
				instruccion = this.conexion.createStatement();
				conjuntoResultados = instruccion.executeQuery(VIAJES_SEL);
				destinos.clear();
				// Listaremos por pantalla los datos
				while(conjuntoResultados.next()) {
					Travel travel=new Travel(conjuntoResultados.getString(VIAJE_COL),
											 conjuntoResultados.getString(HOTEL_COL),
											 conjuntoResultados.getString(TIEMPO_COL),
											 conjuntoResultados.getString(PRECIO_COL));
					destinos.add(travel);
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