
public class Continente {

	public static void main(String[] args) {
		//Estamos definiendo dos objetos diferentes
		Ciudad c1=new Ciudad("Valencia");
		Ciudad c2=new Ciudad("Barcelona");
		
		//Accediendo a los atributos
		
		System.out.println(c1.getnombreCiudad());
		
		//Acceder a atributos publicos
		c2.poblacion=1000;
		
	}

}
