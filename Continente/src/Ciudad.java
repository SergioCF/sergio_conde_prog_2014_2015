
public class Ciudad {

	//Atributos
	private String nombreCiudad;
	public int poblacion=0;
	
	//Constructor
	public Ciudad(String defCiudad) {
		//Inicialización "Otro lugar para atributos"
		this.nombreCiudad=defCiudad;
	}
	
	//Métodos
	public void setnombreCiudad(String defCiudad){
		this.nombreCiudad=defCiudad;
	}
	
	public String getnombreCiudad(){
		return this.nombreCiudad;
	}
}
