package ejemplo2;

import java.util.Scanner;

public class main {

	public static double[] notas (double[] notas ) {
		return notas;
	}
	
	public static double[] MostrarDatos(double[] notas) {
		System.out.println("ELos datos introducidos son: " + notas);
		return notas;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		double [] notas = new double[2];
		
		System.out.println("Introduce la primera nota de Sistemas");
		notas[0] = s.nextDouble();
		
		System.out.println("Introduce la primera nota de Entornos");
		notas[1] = s.nextDouble();
		
		MostrarDatos(notas);
	}
}
