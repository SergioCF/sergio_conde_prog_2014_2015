
public class Cesar {
	
	private String abecedario="abcdefghijklmnopqrstuvwxyz";
	private String textoCifrandose="";
	
	Ventana test = new Ventana();
	
	String texto1=test.getTexto();
	String numDesplaz1=test.getNumDesplz();

	public Cesar() {
	
	}
	
	public String EncriptarEnigma (String  texto1, String numDesplaz1){
		
		System.out.println("Texto 1 (Cesar Java): ");
		System.out.println(texto1);
		System.out.println("Numero Desplaz 1 (Cesar Java): ");
		System.out.println(numDesplaz1);
		
		try{
			
			textoCifrandose="";

			int numD = Integer.parseInt(numDesplaz1);
			
			System.out.println("Texto (Ventana): ");
			System.out.println(texto1);
			System.out.println("Numero (Ventana): ");
			System.out.println(numDesplaz1);
			
			for(int i=0; i<=texto1.length(); i++){
				for(int j = 0; j<abecedario.length(); j++){
					// Con charAt estraigo cada valor del string "texto" de cada posicion "i"
					// y lo comparo a la vez con "abecedario"
					if(texto1.charAt(i)== abecedario.charAt(j)){ // 
						if (j + numD >= abecedario.length()){
							textoCifrandose += abecedario.charAt((j + numD) % abecedario.length());
						}
						else{
							textoCifrandose += abecedario.charAt(j + numD);
						}
					}
				}
			}
		
			}catch (Exception  a){
			
			}
		
		return textoCifrandose;
		}
		
	
}