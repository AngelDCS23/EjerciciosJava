package ejer5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//numerospares2.txt")); //Creación del archivo.
		
		for(int i = 0; i < 100; i++) { //Bucle para introducir 100 números consecutivos
			
			if (i % 2 == 0) { //Con el condicional filtramos los que son pares.
				bw.write(Integer.toString(i) + "\n"); //Con esto pasamos los números a una cadena de caracteres.
			}
			
		}
		
		bw.close();
		System.out.println("Archivo creado");
		
		}catch(IOException ioe) {
			System.out.print("El archivo no se ha podido crear" + ioe.getMessage());
		}
	}

}
