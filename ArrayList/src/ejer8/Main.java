package ejer8;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<GatoComprar> gatos = new ArrayList<GatoComprar>();
		
		gatos.add(new GatoComprar ("Gato","Negro","Persa"));
		gatos.add(new GatoComprar ("Gato","Blanco","Persa"));
		gatos.add(new GatoComprar ("Aato","Gris","Persa"));
		
		System.out.println("Lista de gatos sin ordenar: ");
		for (GatoComprar gato : gatos) {
			System.out.println(gato);
		}
		
		Collections.sort(gatos);
		
		System.out.println("\nLista de gatos ordenada alfabéticamente por nombre");
		for (GatoComprar gato : gatos) {
			System.out.println(gato);
		}
	}
}
