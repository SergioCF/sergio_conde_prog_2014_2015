
public class Corredores {
	static ConexionDB corredoresDB;
	static modeloCorredores mCorredor;
	
	public static void main(String[] args) {

		
		//Generado el objeto
		corredoresDB=ConexionDB.getInstance("localhost","usuarios","root","");

		if(corredoresDB.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
			mCorredor=new modeloCorredores(corredoresDB.getConexion());
			mCorredor.getDatosCorredores();
			System.out.println("LISTADO DE CORRREDORES");
		}
		else System.out.println("ERROR EN LA CONEXION");
	}

}
