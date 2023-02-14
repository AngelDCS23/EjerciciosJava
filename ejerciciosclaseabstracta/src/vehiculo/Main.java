package vehiculo;

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
			Coche.MostrarDatos();
			Coche.acelerar();
			Coche.frenar();
			System.out.println();
		}
		
		for (Bicicleta Bicicleta : mbike) {
			Bicicleta.MostrarDatos();
			Bicicleta.acelerar();
			Bicicleta.frenar();
			System.out.println();
		}
		
		for (Moto Moto : moto) {
			Moto.MostrarDatos();
			Moto.acelerar();
			Moto.frenar();
			System.out.println();
		}
		
	}

}
