package ejer3;

import java.util.ArrayList;

public class Productos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> asigna = new ArrayList<String>();
		
		System.out.println(" ");
		System.out.println("Lista de produtos: ");
		System.out.println(" ");
		
		asigna.add("Guitarra");
		asigna.add("Violin");
		asigna.add("Piano");
		asigna.add("Bajo");
		asigna.add("Contrabajo");
		
		
		for (String a: asigna) {
			System.out.println( " - " + a);
		}
		
		System.out.println(" ");
		System.out.println("Alteración 1 (Borrar un elemento y añadir otro en su misma posición)");
		System.out.println(" ");
		
		//Aquí estoy buscado si bajo se encuenta en alguna parte del ArrayList, si es así, modificara "bajo" y en su lugar introducira "Viola"
		int posicionBajo = asigna.indexOf("Bajo"); 
		if (posicionBajo != -1) {
			asigna.remove("Bajo");
		    asigna.add(posicionBajo, "Viola");
		}
		
		for (String a: asigna) {
			System.out.println( " - " + a);
		}
		
		System.out.println(" ");
		System.out.println("Alteración 2 (Mostrar datos concretos del ArrayList)");
		System.out.println(" ");
		
		int posimostrar = asigna.indexOf("Guitarra");
		
		System.out.println(posimostrar);
		System.out.println(" ");
		System.out.println("Esta es la posición donde se encuentra la palabra Guitarra");
		
	}
}
