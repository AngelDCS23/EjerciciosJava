package ejer6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		BufferedReader br = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//numerospares2.txt")); //Leer el archivo creado anteriormente.
	
		String linea = "";
		
		System.out.println("Números pares");
		
		while(linea != null) { //Bucle para mostrar los valores del archivo.
			
			linea = br.readLine(); 
			
			if(linea != null) {
				
				System.out.println(linea);
				
			}
		}
		
		br.close();
		
		} catch(IOException ioe){
		
			System.out.println("Error en la lectura del archivo " + ioe.getMessage());
	}

	}
}
