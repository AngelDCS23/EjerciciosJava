package ejer7;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce tu nombre");
		String nombre = s.nextLine();

		System.out.println("Introduce el primer apellido");
		String ape1 = s.nextLine();

		System.out.println("Introduce el segundo apellido");
		String ape2 = s.nextLine();

		System.out.println("Introduce tu edad");
		int edad = s.nextInt();

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//nombreyapellidos.txt")); //Creación del archivo y luego introduce los datos proporcionados por el usuario por el terminal

			bw.write(nombre);
			bw.newLine();
			bw.write(ape1);
			bw.newLine();
			bw.write(ape2);
			bw.newLine();

			BufferedWriter bw2 = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//edad.txt")); //Creación del segundo archivo con la edad.

			bw2.write(Integer.toString(edad)); //Pasar la variable de tipo númerica a cadena de caracteres.
			bw2.newLine();

			BufferedWriter bw3 = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//datoscompletos2.txt")); //Creación del tercer archivo.

			String linea1, linea2;

			BufferedReader br = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//nombreyapellidos.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//edad.txt"));

			while ((linea1 = br.readLine()) != null && (linea2 = br2.readLine()) != null) { //Tendría que introducir los datos de ambos archivos en uno creado, pero no funciona. Aparentemente el código está bien, pero no funciona.
				bw3.write(linea1);
				bw3.write(" Edad: ");
				bw3.write(linea2);
				bw3.newLine();
			};

			s.close();
			bw.close();
			bw2.close();
			bw3.close();
			br.close();
			br2.close();

		} catch (IOException ioe) {
			System.out.println("Error en el proceso" + ioe.getMessage());
		}
	}
}
