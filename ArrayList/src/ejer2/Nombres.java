package ejer2;

import java.util.ArrayList;

public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> asigna = new ArrayList<String>();
		
		System.out.println(" ");
		System.out.println("Alteración 0 ");
		System.out.println(" ");
		
		asigna.add("Alberto");
		asigna.add("Juan");
		asigna.add("Pablo");
		
		for (String a: asigna) {
			System.out.println( " - " + a);
		}
		
		System.out.println(" ");
		System.out.println("Alteración 1 ");
		System.out.println(" ");
		
		asigna.removeIf(nombre -> nombre.equals("Pablo"));
		
		asigna.add("Pedro");
		
		for (String a: asigna) {
			System.out.println( " - " + a);
		}
		
		System.out.println(" ");
		System.out.println("Alteración 2 ");
		System.out.println(" ");
		
		int posicion = asigna.indexOf("Pedro");
		
		asigna.set(posicion, "Ana");
		
		for (String a: asigna) {
			System.out.println( " - " + a);
		}
		
		System.out.println(" ");
		System.out.println("Alteración 3 ");
		System.out.println(" ");
		
		int posicion2 = asigna.indexOf("Ana");
		
		asigna.set(posicion2, "Laura");
		
		for (String a: asigna) {
			System.out.println( " - " + a);
		}
		
	}

}
