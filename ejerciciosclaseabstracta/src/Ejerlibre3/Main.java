package Ejerlibre3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sobremesa[] mesa = {
				new Sobremesa("2060","i5",16),
				new Sobremesa("5000","i9",32)
		};
		
		portatil[] porta = {
				new portatil("1050Ti","i3",16,1080,5000),
				new portatil("2060","Radeon 3500",32,2400,7000)
		};
		
		System.out.println("Datos de ordenadores de sobremesa: ");
		System.out.println();
		
		for (Sobremesa Sobremesa : mesa) {
			Sobremesa.MostrarDatos();
			System.out.println();
		}
		
		for (portatil portatil : porta) {
			portatil.MostrarDatos();
			System.out.println();
		}
	}

}
