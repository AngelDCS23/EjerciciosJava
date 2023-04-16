package ejer3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ejer3 {
	public static void main(String[] args) {
try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//asignaturas.txt")); //Creación del archivo y luego la introducción de los datos en el mismo.
		
		bw.write("Programación\n");
		bw.write("Bases de datos\n");
		bw.write("Entornos de desarrollo\n");
		bw.write("Lenguajes de marcas\n");
		bw.write("Sistemas informáticos\n");
		bw.close();
		
		System.out.println("Archivo creado");

} catch (IOException e) {

		System.out.println("El archivo no se ha podido crear correctamente" + e.getMessage());
		
		}

	}
	
  }



