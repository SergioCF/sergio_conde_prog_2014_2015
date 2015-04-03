
public class Datos {
	//VARIABLES De DEFINICION DE IDIOMA
	final static int SP_LANG=0;
	final static int EN_LANG=1;
	
	private int language;
	
	//Datos
	private String tiposDireccDatos[]={"calle","avenida","carretera","plaza"};
	private String tiposDireccDatosEng[]={"street","avenue","road","square"};
	
	public Datos(int language) {
		this.language=language;
		
	}
	
	public String[] getTiposDirecc(){
		switch (this.language){
			case Datos.SP_LANG:
				return tiposDireccDatos;
			case Datos.EN_LANG:
				return tiposDireccDatosEng;
			default:
				return tiposDireccDatos;
		}		
	}

}
