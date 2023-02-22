package ejer4;

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
			System.out.println(ModeloS);
			System.out.println();
		}
		
		for (Modelo3 Modelo3 : a) {
			System.out.println(Modelo3);
			System.out.println();
		}
	}

}
