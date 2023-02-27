package ejer4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Gato> gato = new ArrayList<Gato>();
		
		gato.add(new Gato("Gato","Negro","persa"));
		gato.add(new Gato("Juan","Blanco","gato"));
		gato.add(new Gato("Pedro","Amarillo","persa"));
		gato.add(new Gato("Carlos","Azul","persa"));
		
		System.out.println("Los datos de los gatos son: ");
		
		for (Gato gatos : gato) {
			System.out.println(gatos.toString());
		}
	}
}
