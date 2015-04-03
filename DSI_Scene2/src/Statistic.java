
public class Statistic {
	private int[] valores;
	
	//Constructor
	public Statistic(int[] valores) {
		this.valores=valores;
	}
	
	public int average(){
		int average=0;
		
		for (int i=0;i<this.valores.length;i++)
		{
			average=this.valores[i]+average;
		}
		
		return average/this.valores.length;
	}
	
	public int standardDeviation(){
		//Primero calvulamos la media
		int media=average();
		int stdDeviation=0;
		int i=0;
		
		//Despues calculamos la desviacion media
		while(i<this.valores.length)
		{
			stdDeviation=Math.abs(this.valores[i+1]-media);
		}
		
		return stdDeviation/this.valores.length;
				
	}


}
