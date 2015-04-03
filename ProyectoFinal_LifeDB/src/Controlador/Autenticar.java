package Controlador;

public class Autenticar {
	
	// Definimos un boolean que en un primer momento será "false"
	private boolean autenticado=false;
	
	public Autenticar() {
		
	}
	
	public boolean estaLogin(){
		return this.autenticado;
	}
	
	public boolean comprobarUser(){
		this.autenticado=true;
		return this.autenticado;
	}

}
