package ejer;

import java.io.File;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ruta="//Users//angeldecarasalas//1//";
		System.out.println("Introduze el nombre de la carpeta que quieres borrar");
		String nombrecarpeta = s.nextLine();
		 File carpetaBorrar = new File(ruta+nombrecarpeta);

         if (carpetaBorrar.exists()) {
             carpetaBorrar.delete();
             System.out.println("La carpeta " + nombrecarpeta + " se ha borrado correctamente.");
         } else {
             System.out.println("La carpeta " + nombrecarpeta + " no existe.");
         }
         s.close();
	}

}
