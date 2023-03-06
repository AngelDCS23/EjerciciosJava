package ejer7;

import java.util.Scanner;

public class factorizado {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nombre = askForData("introduce tu nombre", s);
		String usuario = askForData("Introduce el usuario", s);
		
	}
	
	private static String askForData(String label, Scanner s) {
		System.out.println();
		return label;
	}
}
