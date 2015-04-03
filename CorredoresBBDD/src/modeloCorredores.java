import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;


public class modeloCorredores {
	//DEVOLVER CORREDORES
	private static String CORREDORES_LIST="SELECT * FROM corredores";
	
	private static String ID_COL="id";
	private static String NOMBRE_COL="nombre";
	private static String APELLIDOS_COL="apellidos";
	private static String TIME_COL="tiempo_medio";
	
	private static String COLUMNAS[]={ID_COL,NOMBRE_COL,APELLIDOS_COL,TIME_COL};
	
	//Conexion
	private Connection conexion = null;// maneja la conexión
	Statement instruccion = null;
	ResultSet conjuntoResultados = null;
	
	public modeloCorredores(Connection conexion) {
		this.conexion=conexion;
	}
	
	public void getDatosCorredores(){
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(CORREDORES_LIST);

			//Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				System.out.print(conjuntoResultados.getInt(ID_COL)+";");
				System.out.print(conjuntoResultados.getString(NOMBRE_COL)+";");
				System.out.print(conjuntoResultados.getString(APELLIDOS_COL)+";");
				System.out.println(conjuntoResultados.getTime(TIME_COL));
			}// fin de while
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
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
