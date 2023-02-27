package ejer1;

import java.util.ArrayList;

public class Agregar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> asigna = new ArrayList<String>();
		
		System.out.println("Nº de elementos: " + asigna.size());
		
		asigna.add("Entornos");
		asigna.add("Programación");
		asigna.add("Base de datos");
		
		System.out.println("Nº de elementos: " + asigna.size());
		
		asigna.add("Sistemas");
		
		System.out.println("Nº de elementos: " + asigna.size());
		
		System.out.println("El elemento que se encuentra en la posicion 0 es:  " + asigna.get(0));
		System.out.println("El elemento que se encuentra en la posicion 3 es:  " + asigna.get(3));

	}

}
