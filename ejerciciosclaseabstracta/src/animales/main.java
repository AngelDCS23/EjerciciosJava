package animales;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamiferos lobo = new Mamiferos("Lobo", "Negro");
		
		Ave aguila = new Ave("Águila","Negro y blanco");
		
		Peces esturion = new Peces("Esturión","Dulce");
		
		System.out.println("Datos del lobo: ");
		lobo.MostrarDatos();
		System.out.println();
		
		System.out.println("Datos del Águila: ");
		aguila.MostrarDatos();
		System.out.println();
		
		System.out.println("Datos del Esturión: ");
		esturion.MostrarDatos();
		System.out.println();
	}

}
