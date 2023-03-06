package ejer3;

import java.util.Scanner;

public class refactorizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double altura = obtenerDato("Introduce tu altura en metros: ", sc);
        double peso = obtenerDato("Introduce tu peso en kilogramos: ", sc);
        sc.close();
        
        mostrarDatos("Altura", altura);
        mostrarDatos("Peso", peso);
    }
    
    private static double obtenerDato(String mensaje, Scanner sc) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }
    
    private static void mostrarDatos(String mensaje, double valor) {
        System.out.println(mensaje + ": " + valor);
    }
}
