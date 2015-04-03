
public class Trabajo {
	private String titulo="";
	private String ciudad="";

	public Trabajo(String titulo,String ciudad) {
		this.titulo=titulo;
		this.ciudad=ciudad;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public String getCiudad(){
		return this.ciudad;
	}

}
