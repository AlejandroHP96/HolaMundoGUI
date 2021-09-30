package dad.holamundo.awt;

public class Main {

	public static void main(String[] args) {
		
		MiInterfaz mi1 = new MiInterfaz() {
			@Override
			public void saludar(String nombre, String apellidos) {
				System.out.println("Buenos días " + nombre);
			}
		};

		MiInterfaz mi2 = (n, a) -> System.out.println("Hola " + n + " " + a + "!!!");
		
		mi1.saludar("Manolito", "Gómez");
		mi2.saludar("Manolito", "Gómez");
		
	}

}
