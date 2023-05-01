package ejer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Crear una carpeta con el nombre que usuario introduzca y en su interior crea una archivo con el nombre de usurio y la contradeña que desee.
    	
		 Scanner s = new Scanner(System.in);
	     String ruta="//Users//angeldecarasalas//1//";
	        
    	System.out.println("Introduzca el nombre de la carpeta:");
        String Carpeta = s.nextLine();  
        System.out.println("Introduzca el nombre del usuario");
        String usuario = s.nextLine();
        System.out.println("Introduce la contraseña del usuario");
        String contraseña = s.nextLine();
        File carpetaa = new File(ruta+Carpeta);
        String rutacarp = "//Users//angeldecarasalas//1//"+Carpeta;
        String nombrearchivo = "//usuario.txt";

        if (!carpetaa.exists()) {
        
        	try {
        	carpetaa.mkdirs(); // crea la carpeta si no existe
            System.out.println("La carpeta " + Carpeta + " se ha creado correctamente.");
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutacarp + nombrearchivo)); //Guarda en memoria y crea la ruta de la carpeta con el nombre del archivo
            bw.close();
        	}catch(IOException ioe) { //Manejo de excepciones
        		System.out.println("Error" + ioe.getMessage());
        	}
            
        	try {
        		 BufferedWriter bw = new BufferedWriter(new FileWriter(rutacarp + nombrearchivo));  //Guarda en memoria y crea la ruta de la carpeta con el nombre del archivo
                 bw.write(usuario+"\n"); //Guarda la información introducida por el usuario dentro del fichero de texto.
                 bw.write(contraseña+"\n");
                 bw.close();
        	}catch(IOException ioee) {
        		System.out.println("Error en la creación de la carpeta o en la creación de los ficheros" + ioee.getMessage());
        	}
        } else {
            System.out.println("La carpeta " + Carpeta + " ya existe.");
        }
        s.close();
	}

}
