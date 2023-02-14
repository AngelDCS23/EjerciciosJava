package Ejerlibre4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ModeloS[] s = {
				new ModeloS("Model S",600,"Sí","No")
		};
		
		Modelo3[] a = {
				new Modelo3("Modelo 3",602,"Sí","Sí")
		};
		
		System.out.println("Modelos a la venta: ");
		System.out.println();
		
		for (ModeloS ModeloS : s) {
			ModeloS.MostrarDatos();
			System.out.println();
		}
		
		for (Modelo3 Modelo3 : a) {
			Modelo3.MostrarDatos();
			System.out.println();
		}
	}

}
