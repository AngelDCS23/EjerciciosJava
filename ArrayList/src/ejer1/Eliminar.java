package ejer1;

import java.util.ArrayList;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> asigna = new ArrayList<String>();
		
		System.out.println("Nº de elementos: " + asigna.size());
		
		asigna.add("Entornos");
		asigna.add("Programación");
		asigna.add("Base de datos");
		asigna.add("Sistemas");
		asigna.add("Matematicas");
		
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println(asigna);
		
		//Función para recorrer el ArrayList.
		
		asigna.removeIf(asignatura -> asignatura.equals("Matematicas"));
		
		//Mostrar datos.
		
		System.out.println("Nº de elementos: " + asigna.size());
		System.out.println(asigna);
	}

}
