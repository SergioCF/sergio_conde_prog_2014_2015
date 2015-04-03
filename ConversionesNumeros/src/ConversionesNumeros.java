
public class ConversionesNumeros {
	static String numeroTxt="5";
	static int numero=6;
	static Integer numeroInt;
	static int resultado=0;
	static String resultadoTxt="";
	public static void main(String[] args) {
		
		resultado = numero + Integer.parseInt(numeroTxt);
		
		System.out.println(resultado);
		
		resultadoTxt=String.valueOf(resultado);
		
		System.out.println(resultado);
	
	}

}
