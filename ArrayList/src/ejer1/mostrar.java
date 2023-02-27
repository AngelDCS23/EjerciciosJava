package ejer1;

import java.util.ArrayList;

public class mostrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> asigna = new ArrayList<String>();
		
		asigna.add("Entornos");
		asigna.add("Sistemas");
		asigna.add("Base de datos");
		asigna.add("Programacion");
		
		//Mostrar los datos.
		
		for (String a : asigna) {
			System.out.println(" - " + a);
		}
	}

}
