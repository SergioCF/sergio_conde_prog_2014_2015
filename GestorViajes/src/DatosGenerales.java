
public class DatosGenerales {
	
	// Definimos los elementos que va a contener el array (texto y valores de conversion a euro)
	final static String textDolares="Dolares";
	final static float valorDolares=1.13f;
	final static String textLibras="Libras";
	final static float valorLibras=0.75f;
	final static String textYen="Yen";
	final static float valorYen=132.47f;
	
	// Array de texto y valores de conversion
	private String textoMonedas[]={textDolares,textLibras,textYen};
	private float valoresConversion[]={valorDolares,valorLibras,valorYen};
	
	public DatosGenerales() {
	
	}
	
	// Devolvemos nombre monedas
	public String[] getMonedas(){
		return textoMonedas;
	}
	
	// Devolvemos valores de Conversion a Euro
	public float[] getValoresConversion(){
		return valoresConversion;
	}

}
