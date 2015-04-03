
public class ConversorDolares {

	public static void main(String[] args) {
		
		//Array Valores conversion (Libras, Dolares, Yen)
		float valores []=new float[3];
		valores[0]=0.79f;
		valores[1]=1.25f;
		valores[2]=147.97f;
		
		//Se pasa el array al conversor
		VentanaConversor ventana = new VentanaConversor(valores);
		ventana.setVisible(true);
	}

}