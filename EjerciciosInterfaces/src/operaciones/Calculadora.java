package operaciones;

public class Calculadora implements OperacionesInterfaz{
	
	@Override
	public int sumar (int a, int b) {
		return a + b;
	}
	
	@Override
	public int restar (int a, int b) {
		return a - b;
	}
	
	@Override
	public double multiplicar (int a, int b) {
		return a * b;
	}
	
	@Override
	public double division (int a, int b) {
		return a / b;
	}
	
	@Override
	public double potencia (int a, int b) {
		return Math.pow(a, b);
	}
	
	@Override
	public double raiz (int a) {
		return Math.sqrt(a);
	}
	
}
