package ejer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejer1 {

public static void main(String[] args) {

try {
BufferedReader br = new BufferedReader(new FileReader("//Users//angeldecarasalas//1//malaga.txt"));
String linea = "";
while (linea != null) {
System.out.println(linea);
linea = br.readLine();
}
br.close();
} catch (FileNotFoundException fnfe) { // que hacer si no se encuentra el fichero
System.out.println("No se encuentra el fichero malaga.txt");
} catch (IOException ioe) { // que hacer si hay un error en la lectura del fichero
System.out.println("No se puede leer el fichero malaga.txt");
}
}
}