
public class ConversorDolares {

	public static void main(String[] args) {
		// Valor del dolar vs euro
		float ValorConversion=1.25f;
		// Se pasa el valor al constructor
		VentanaConversor ventana = new VentanaConversor(ValorConversion);
		ventana.setVisible(true);
	}

}