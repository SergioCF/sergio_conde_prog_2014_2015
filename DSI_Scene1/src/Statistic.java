
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
			average=this.valores[i];
		}
		
		return average/this.valores.length;
	}

}
