
public class Carta {
	//Numero de la baraja
	//el 0 es el JOKER
	private int numero;
	//Palo de la baraja
	private String palo;
	
	static final String PICAS="PICAS";
	static final String CORAZONES="CORAZONES";
	static final String DIAMANTES="DIAMANTES";
	static final String TREBOLES="TREBOLES";
	static final String[] PALOS={PICAS,CORAZONES,DIAMANTES,TREBOLES};
	
	public Carta() {
		this(1,Carta.PICAS);
		//this.numero=1;
		//this.palo=Carta.PICAS;
	}
	
	public Carta(int numero,String palo){
		this.setNumero(numero);
		this.palo=palo;		
	}

	public String getPalo(){
		return this.palo;
	}
	
	public void setPalo(String palo){
		this.palo=palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "La Carta tiene un numero "+this.numero+" y es del palo "+this.palo;
	}
}
