package ejer5;

import java.util.Scanner;

public class refactorizado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		Double primerNumero = scanner.nextDouble();

		System.out.print("Introduce el segundo número: ");
		Double segundoNumero = scanner.nextDouble();

		scanner.close();

		double resultadoSuma = suma(primerNumero, segundoNumero);
		System.out.println("La suma de " + primerNumero + " y " + segundoNumero + " es: " + resultadoSuma);
	}

	public static double suma(double n1, double n2) {
		return n1 + n2;
	}
}
