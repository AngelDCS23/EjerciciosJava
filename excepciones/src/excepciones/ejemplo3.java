package excepciones;

public class ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//LLamamos al método dividir
			int resultado = dividir(10,0);
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: división entre cero.");
		}
	}

	public static int dividir(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
