package ejer4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejer4 {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//asignaturas.txt")); //Leemos el archivo creado en el ejercicio anterior
			
			String linea = "";
			
			System.out.print("Asignaturas de 1º de DAM: ");
			
			while(linea != null) { //Con este bucle mostramos por consola los datos dentro del archivo
				
				linea = br.readLine();
				
				if(linea != null) {
					
					System.out.println(linea);
					
				}
			}
			
			br.close();
			
		} catch (IOException ioe){
			
			System.out.println("No se puede leer el fichero asignatura.txt");
		}
	}
}
