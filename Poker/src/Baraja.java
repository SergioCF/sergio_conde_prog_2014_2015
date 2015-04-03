import java.util.ArrayList;
import java.util.Iterator;


public class Baraja {
	//Mazo Cartas
	private Carta cartas[];
	private int numCartas;
	
	//Mazo de cartas con ArrayList
	private ArrayList<Carta> mazoCartas = new ArrayList<Carta>();
	
	//TIPOS BARAJAS
	static final int FRANCESA=52;
	
	public Baraja() {
		this.numCartas=Baraja.FRANCESA;
		cartas=new Carta[this.numCartas];
	}
	
	public void ordenar(){
		int posicion=0;
		for(int i=0;i<Carta.PALOS.length;i++)
		{
			for(int j=1;j<14;j++){
				Carta cartaActual=new Carta(j,Carta.PALOS[i]);
				cartas[posicion]=cartaActual;
				posicion++;
				//Para el caso del ArrayList
				mazoCartas.add(cartaActual);
			}
		}
	}
	
	
	public String toString(){
		String baraja="";
		/*
		for(int i=0;i<this.numCartas;i++){
			baraja=baraja+cartas[i].toString()+"\n";
		}*/
		//Usamos el iterator
		Iterator<Carta> it= mazoCartas.iterator();
		while(it.hasNext()){
			baraja=baraja+it.next().toString()+"\n";
		}
		return baraja;
	}
}
