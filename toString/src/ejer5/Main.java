package ejer5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche[] renault = {
				new Coche ("rojo",4,"Renault",1600)
		};

		Bicicleta[] mbike = {
				new Bicicleta ("negro",2,"Mbike","montaña")
		};
		
		Moto[] moto = {
				new Moto ("Negra",2,"Kawasaki",1600)
		};
		
		System.out.println("Vehículos: ");
		System.out.println();
		
		for (Coche Coche : renault) {
			System.out.println(Coche);
			Coche.acelerar();
			Coche.frenar();
			System.out.println();
		}
		
		for (Bicicleta Bicicleta : mbike) {
			System.out.println(Bicicleta);
			Bicicleta.acelerar();
			Bicicleta.frenar();
			System.out.println();
		}
		
		for (Moto Moto : moto) {
			System.out.println(Moto);
			Moto.acelerar();
			Moto.frenar();
			System.out.println();
		}
		
	}

}
