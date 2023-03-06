package ejer2;

import java.util.Scanner;

public class refactorizado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double[2];
		
		pedirNota("Base de Datos", notas, 0, input);
		pedirNota("Entorno de Desarrollo", notas, 1, input);
		
		mostrarNotas(notas);
		input.close();
	}

	public static void pedirNota(String asignatura, double[] notas, int index, Scanner input) {
		System.out.print("Introduce la nota de " + asignatura + " ");
		notas[index] = input.nextDouble();
	}

	public static void mostrarNotas(double[] notas) {
		System.out.println("La nota de Base de Datos es " + notas[0]);
		System.out.println("La nota de Entorno de Desarrollo es " + notas[1]);
	}
}
