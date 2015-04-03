
public class CalcularMayor {

	public static void main(String[] args) {
		//Ejemplo numero mayor
		System.out.println("El numero mayor entre [5,6] es: "+numeroMayor(5,6));
		System.out.println("El numero mayor entre [1,-3] es: "+numeroMayor(1,-3));
		//Ejemplo media aritmetica
		int []num={3,5,-3,6,15,-4,0};
		System.out.println("La media de {3,5,-3,6,15,-4,0} es: "+numeroMedia(num));
		
	}
	
	static private int numeroMayor(int a,int b){
		if(a>b) return a;
		else return b;
	}
	
	static private float numeroMedia(int num[]){
		float media=0;
		for(int i=0;i<num.length;i++){
			media=media+num[i];
		}
		return media/num.length;
	}
}
