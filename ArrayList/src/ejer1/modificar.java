package ejer1;

import java.util.ArrayList;

public class modificar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String buscar = "angel";
		
		ArrayList <String> asigna = new ArrayList<String>();
		
		asigna.add("juan");
		asigna.add("Sergio");
		asigna.add("Pedro");
		asigna.add("Marina");
		asigna.add("Laura");
		asigna.add("angel");
		
		System.out.println(asigna);
		
		int posicion = asigna.indexOf(buscar);
		System.out.println(" La posicion del nombre es: " + posicion);
		asigna.set(posicion, "Alberto");
		System.out.println(asigna);
	}

}
