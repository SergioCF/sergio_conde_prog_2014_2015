
public class ett {

	public static void main(String[] args) {
		Bolsa bolsaTrabajos=new Bolsa(5);

		Trabajo t1=new Trabajo("Programador Junior","Valencia");
		Trabajo t2=new Trabajo("Programador Senior","Barcelona");
		
		bolsaTrabajos.add(t1);
		bolsaTrabajos.add(t2);
		
		for (Object o:bolsaTrabajos) {
			Trabajo t=(Trabajo)o;
			System.out.println(t.getTitulo()+" en la ciudad, "+t.getCiudad());
		}
	}

}
