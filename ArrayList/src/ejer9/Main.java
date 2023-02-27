package ejer9;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libros> libros = new ArrayList<Libros>();
		
		libros.add(new Libros("El señor de los anillos","Tolkein","Aventura"));
		libros.add(new Libros("El Hobbit","Tolkein","Aventura"));
		libros.add(new Libros("Dune","Frank Herbert","Ciencia ficción"));
		
		System.out.println("La lista de libros sin ordenar: ");
		for (Libros libro : libros ) {
			System.out.println(libro);
		}
		
		Collections.sort(libros);
		
		System.out.println("La lista de libros ordenados: ");
		for (Libros libro : libros ) {
			System.out.println(libro);
		}
	}

}
