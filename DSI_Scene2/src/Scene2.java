import java.util.Random;


public class Scene2 {

	public static void main(String[] args) {
		//Generador de numeros aleatorios
		Random r=new Random();
		//Datos
		int[] valores=new int[20];
		
		//Generamos los valores aleatorios de valores entre -10 y 10
		 for(int i = 1; i<=valores.length; i++)
			 valores[i] = r.nextInt(100);
		 
		 //Llamamos a las estadísticas
		Statistic s=new Statistic(valores);

		//Mostramos los resultados
		System.out.println("Media aritmética: "+s.average());
	}

}
