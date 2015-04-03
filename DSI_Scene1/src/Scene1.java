
public class Scene1 {

	public static void main(String[] args) {

		//Datos
		int[] valores={-4,0,0,4,5,134,34,-1,5,6,0};
		
		Statistic s=new Statistic(valores);

		System.out.println(s.average());
	}

}
