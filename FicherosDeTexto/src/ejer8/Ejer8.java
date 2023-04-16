package ejer8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		
		BufferedReader br = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//archivo1.txt")); //Con esto podremos leer el archivo seleccionado.
		
		String linea = "";
		
		System.out.println("Nombre: ");
		
		while(linea != null){ //bucle para ver los valores del archivo.
			
			linea = br.readLine();
			
			if(linea != null) {
				System.out.println(linea);
			}
		}
		
		br.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//archivo2.txt"));
		
		String linea2 = "";
		
		System.out.println(" ");
		System.out.println("Apellidos: ");
		
		while(linea2 != null){
			
			linea2 = br2.readLine();
			
			if(linea2 != null) {
				System.out.println(linea2);
			}
		}
		
		br2.close();
		
		BufferedReader br3 = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//archivo3.txt"));
		
		String linea3 = "";
		
		System.out.println(" ");
		System.out.println("Información completa: ");
		
		while(linea3 != null){
			
			linea3 = br3.readLine();
			
			if(linea3 != null) {
				System.out.println(linea3);
			}
		}
		
		br3.close();
		
		}catch(IOException ioe) {
			System.out.println("No se han podido leer los archivos " + ioe.getMessage());
		}
	}

}
