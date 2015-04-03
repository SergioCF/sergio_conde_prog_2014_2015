
public class Juego {

	public static void main(String[] args) {
		Carta c1=new Carta();
		Carta c2=new Carta(2,Carta.PALOS[3]);

		//System.out.println(c2.getNumero());
		//System.out.println(c2.getPalo());
		
		//System.out.println(c2);
		//System.out.println(c1);
		
		Baraja b=new Baraja();
		b.ordenar();
		
		System.out.println(b);
	}

}
