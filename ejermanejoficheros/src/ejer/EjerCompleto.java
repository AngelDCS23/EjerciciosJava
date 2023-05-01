package ejer;

import java.io.File;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjerCompleto{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        String ruta="//Users//angeldecarasalas//1";

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("A - Crear carpeta");
            System.out.println("B - Borrar carpeta");
            System.out.println("C - Listar y crear archivo con los nombres");
            System.out.println("D - Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
            
                case "A":
                    System.out.println("Introduzca el nombre de la carpeta:");
                    String nombreCarpeta = scanner.nextLine();
                   
                    File carpeta = new File(ruta+nombreCarpeta);

                    if (!carpeta.exists()) {
                    
                    	carpeta.mkdirs(); // crea la carpeta si no existe
                        System.out.println("La carpeta " + nombreCarpeta + " se ha creado correctamente.");
                        
                    } else {
                        System.out.println("La carpeta " + nombreCarpeta + " ya existe.");
                    }
                    break;

                case "B":
                    System.out.println("Introduzca el nombre de la carpeta que desea borrar:");
                    String nombreCarpetaBorrar = scanner.nextLine();
                    File carpetaBorrar = new File(ruta+nombreCarpetaBorrar);

                    if (carpetaBorrar.exists()) {
                        carpetaBorrar.delete();
                        System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente.");
                    } else {
                        System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe.");
                    }
                    break;
                    
                case "C":
            		File fa = new File("//Users//angeldecarasalas//1");
                    String[] ficheross = fa.list();// list es listar, y lo ponemos en un array para que se
                    // guarden todos los archivos tanto carpetas como ficheros.

                    int a = 0;
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//nombrearchivos.txt"));

                        for (String nomfile : ficheross) {
                            a = a + 1;
                            System.out.println(a + "-" + nomfile); // muestra el nombre.
                            bw.write(a + "-" + nomfile + "\n"); // graba/escribe los nombres.
                        }
                        bw.close();

                    } catch (IOException e) {
                        System.out.println("Error al escribir o leer el fichero: " + e.getMessage());

                    }

                	break;

                case "D":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (!opcion.equals("D"));

        scanner.close();
    }
}
