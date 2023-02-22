package ejer3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamiferos lobo = new Mamiferos("Lobo", "Negro");
		
		Ave aguila = new Ave("Águila","Negro y blanco");
		
		Peces esturion = new Peces("Esturión","Dulce");
		
		System.out.println("Datos del lobo: ");
		System.out.println(lobo);
		System.out.println();
		
		System.out.println("Datos del Águila: ");
		System.out.println(aguila);
		System.out.println();
		
		System.out.println("Datos del Esturión: ");
		System.out.println(esturion);
		System.out.println();
	}

}
