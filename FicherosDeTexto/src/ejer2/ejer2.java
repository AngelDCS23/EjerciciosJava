package ejer2;

import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException;

public class ejer2 {
public static void main(String[] args) {
try {
BufferedWriter bw = new BufferedWriter(new FileWriter("//Users//angeldecarasalas//1//nombre.txt")); //no añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo bw.write("naranja\n");
bw.write("Ángel\n");
bw.write("Leda\n");
bw.write("Antonio\n");
System.out.println("Fichero creado");
bw.close();
} catch (IOException ioe) {
System.out.println("No se ha podido escribir en el fichero");
} }
}