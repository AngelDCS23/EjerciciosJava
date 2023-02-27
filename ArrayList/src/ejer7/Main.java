package ejer7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(32);
		a.add(12);
		a.add(8);
		a.add(60);
		a.add(20);
		
		System.out.println("\nNúmeros en el orden origial: ");
		for (Integer numero : a) {
			System.out.println(numero);
		}
		
		Collections.sort(a);
		System.out.println("\nNúmero ordenados");
		for (Integer numero : a) {
			System.out.println(numero);
		}
	}

}
