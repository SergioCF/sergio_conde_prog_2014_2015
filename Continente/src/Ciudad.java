
public class Ciudad {

	//Atributos
	private String nombreCiudad;
	public int poblacion=0;
	
	//Constructor
	public Ciudad(String defCiudad) {
		//Inicializaci�n "Otro lugar para atributos"
		this.nombreCiudad=defCiudad;
	}
	
	//M�todos
	public void setnombreCiudad(String defCiudad){
		this.nombreCiudad=defCiudad;
	}
	
	public String getnombreCiudad(){
		return this.nombreCiudad;
	}
}
