package ejer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer1 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        File f = new File("//Users//angeldecarasalas//1");
        String[] ficheros = f.list();
        String[] ficherosClon = ficheros.clone();
        int i = 0;
        
        for (String nomfile : ficheros) {
            i = i + 1;
            System.out.println(i + " " + nomfile);

        }

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//nombrearchivos.txt"));
            StringBuilder sb = new StringBuilder();
            
            for (String fichero : ficherosClon) {
                sb.append(fichero + "\n");
            }
            
            bw.write(sb.toString());
            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir el array en el archivo" + ioe.getMessage());
        }
    }
}
