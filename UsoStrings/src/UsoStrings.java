
public class UsoStrings {

	public static void main(String[] args) {
		//Creación de un objeto String
		String frase="Este es un objeto String";
		String frase2="Este es otro objeto";
		String resultado="";
		
		//Imprimir un String
		System.out.println(frase+". "+frase2);
		
		//Operaciones con String
		resultado=frase+frase2;
		System.out.println(resultado);
		System.out.println("La longitud de frase es: "+frase.length());
		System.out.println("La longitud de frase es: "+resultado.length());
		
		//Operaciones con String II
		resultado=frase2.toUpperCase();
		System.out.println("frase2: "+frase2);
		System.out.println("frase2: "+resultado);
		
		//Quitar espacios
		resultado=frase2.trim();
		System.out.println("frase2: "+frase2);
		System.out.println("frase2: "+resultado);
		
		//Comparar Strings
		System.out.println(frase2.compareTo(frase));
		
		

	}

}
