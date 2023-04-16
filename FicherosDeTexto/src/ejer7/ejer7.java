package ejer7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = s.nextLine();
        System.out.println("¿Cuales son tus apellidos?");
        String apellidos = s.nextLine();

        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//archivo1.txt"));
            bw1.write(nombre);
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//archivo2.txt"));
            bw2.write(apellidos);

            bw1.close();
            bw2.close();
            s.close();
            System.out.println("Archivos creados");

            try {
                BufferedReader br1 = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//archivo1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//archivo2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//archivo3.txt"));

                String linea1 = br1.readLine();
                String linea2 = br2.readLine();

                while (linea1 != null || linea2 != null) {

                    if (linea1 != null) {
                        bw.write(linea1 + "\n");
                        linea1 = br1.readLine();
                    }

                    if (linea2 != null) {
                        bw.write(linea2 + "\n");
                        linea2 = br2.readLine();
                    }
                }

                br1.close();
                br2.close();
                bw.close();
                System.out.println("archivo3.txt creado");
                
            } catch (IOException ioe) {

                System.out.println("Error de creación o escritura de alguno de los archivos");
                System.err.println(ioe.getMessage());

            }
        } catch (IOException ioe) {

            System.out.println("Error de creación o escritura de alguno de los archivos");
            System.err.println(ioe.getMessage());

        }
    }
}