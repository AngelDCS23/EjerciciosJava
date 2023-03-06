package restaysuma;

public class main {

	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static int resta(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacion (int a, int b) {
		return a * b;
	}
	
	public static int division (int a, int b) {
		return a % b;
	}
	
	public static double potencia (double a, double b) {
		
	double resultado = Math.pow(a, b);
	return resultado;
		
	}
	
	public static double MostrarDatos (double resultado) {
		System.out.println("El resultado de la operación es: " + resultado);
		return resultado;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		int suma = suma(a,b);
		int resta = resta(a,b);
		int multiplicacion = multiplicacion(a,b);
		int division = division(a,b);
		double potencia = potencia (a,b);
		
		MostrarDatos(suma);
		MostrarDatos(resta);
		MostrarDatos(multiplicacion);
		MostrarDatos(division);
		MostrarDatos(potencia);
		
	}
}
