package Modelo;

public class Travel {
	
	private String Destino="";
	private String Hotel="";
	private String Tiempo="";
	private String Precio="";
	
	public Travel(String Destino,String Hotel,String Tiempo,String Precio) {
		this.Destino=Destino;
		this.Hotel=Hotel;
		this.Tiempo=Tiempo;
		this.Precio=Precio;
	}
	
	public String getDestino(){
		return this.Destino;
	}
	
	public String getHotel(){
		return this.Hotel;
	}
	
	public String getTiempo(){
		return this.Tiempo;
	}
	
	public String getPrecio(){
		return this.Precio;
	}
	
	public String toString(){
		return this.Destino;
	}

}
