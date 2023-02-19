package vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche = new Coche("Ford GT","Negro","5000");
		Moto moto = new Moto("Kawasaki","Verde","1600");
		Patin patin = new Patin("A2",7200,"Negro");
		Bicicleta bici = new Bicicleta("A400","Montaña","Azul");
		
		coche.MostrarDatos();
		coche.Gracias();
		System.out.println();
		
		moto.MostrarDatos();
		moto.Gracias();
		System.out.println();
		
		patin.MostrarDatos();
		patin.Gracias();
		System.out.println();
		
		bici.MostrarDatos();
		bici.Gracias();
		System.out.println();
	}

}
