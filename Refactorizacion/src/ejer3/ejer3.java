package ejer3;

import java.util.Scanner;

public class ejer3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduce tu altura: ");
			double altura = sc.nextDouble();
			
			System.out.print("Introduce tu peso: ");
			double peso = sc.nextDouble();
			
			sc.close();
	
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
		}
	}
