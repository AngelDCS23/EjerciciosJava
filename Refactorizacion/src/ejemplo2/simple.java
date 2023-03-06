package ejemplo2;

import java.util.Scanner;

public class simple {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double[] notas = new double[2];
		
		System.out.println("Introduce la nota de la asignatura de base de datos: ");
		notas[0] = s.nextDouble();
		
		System.out.println("Introduce la ntoa de la asignatura entorno de desarrollo");
		notas[1] = s.nextDouble();
		
		System.out.println("La nota de Base de Datos es " + notas[0]);
		System.out.println("La nota de Entornos de desarrollo es  " + notas[1]);
		
		s.close();
	}
}
