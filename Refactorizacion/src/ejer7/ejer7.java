package ejer7;

import java.util.Scanner;

public class ejer7 {

	public static String nombre(String nombre) { //podría comprimir la pregunta de datos en un solo método.
		return nombre;
	}
	
	public static String usuario(String usuario) {
		return usuario;
	}
	
	public static String MostrarDatos(String mostrardatos) {
		System.out.println("Los datos introducidos son: " + mostrardatos);
		return mostrardatos;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el nombre");
		String nombre = s.nextLine();
		
		System.out.println("Introduce el usuario");
		String usuario = s.nextLine();
		
		MostrarDatos(nombre);
		MostrarDatos(usuario);
	}
}
