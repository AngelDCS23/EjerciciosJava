package ejer6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Málaga");
		a.add("Sevilla");
		a.add("Cadiz");
		a.add("Almeria");
		
		System.out.println("\nNúmeros en el orden original: ");
		
		for (String numero : a) {
			System.out.println(numero);
		}
		
		Collections.sort(a);
		System.out.println("\nNúmeros ordenados: ");
		
		for (String numero : a) {
			System.out.println(numero);
		}
	}
}
