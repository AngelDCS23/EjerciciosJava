package testcalculadora;

public class Calculadora {

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int multiplicacion(int a, int b) {
		return a * b;
	}

	public static double division(int a, int b) {
		return a / b;
	}
	
	public static double raiz(int a) {
		return Math.sqrt(a);
	}
	
	public static double potencia (int a, int b) {
		return Math.pow(a, b);
	}
}
