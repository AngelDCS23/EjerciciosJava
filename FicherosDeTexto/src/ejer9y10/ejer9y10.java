package ejer9y10;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ejer9y10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//Libros.txt")); //Creación del archivo e introducción de datos.
	
		bw.write("El título es: Hamlet\n");
		bw.write("Su Género es: Drama\n");
		bw.write("Número de páginas: 270\n");
		bw.close();
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//Autores.txt"));
		
		bw2.write("El autor es: Shakespeare\n");
		bw2.write("Nacionalidad: Reino unido\n");
		bw2.write("Fecha de nacimiento: 23 de Abril de 1564\n");
		bw2.write("Fecha de muerte: 23 de Abril de 1616\n");
		bw2.close();
		
		BufferedReader br = new BufferedReader(new FileReader(("//Users//angeldecarasalas//1//Libros.txt")));
		BufferedReader br2 = new BufferedReader(new FileReader(("//Users//angeldecarasalas//1//Autores.txt")));
		
		String linea1 = "";
		String linea2 = "";
		
		while(linea1 != null) { //bucle para ver los valores de los archivos
			
			linea1 = br.readLine(); //valores de archivo 1
			linea2 = br2.readLine(); //valores de archivo 2
			
			if (linea1 != null) { //mostrar los valores en la consola
				System.out.println(linea1); 
				System.out.println(" ");
				System.out.println(linea2);
			}
		}
		
		br.close();
		br2.close();
	
		}catch(IOException ioe) {
			
			System.out.println("Error en la lectura del archivo" + ioe.getMessage());
			
		}
		

	}
}
