package ejer5;

import java.util.Scanner;

public class ejer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un primer número: ");
		Double n1 = sc.nextDouble();
		
		System.out.print("Introduce un segundo número: ");
		Double n2 = sc.nextDouble();
		
		sc.close();
		
		double resultado = suma(n1, n2);
		System.out.println("La suma de " + n1 + " y " + n2 + " es: " + resultado);
	}
	
	
	public static double suma(double a, double b) {
		return a + b;
	}
}