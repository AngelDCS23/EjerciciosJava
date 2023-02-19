package operaciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora cal = new Calculadora();
		
		System.out.println("La suma es: " + cal.sumar(5, 3));
		
		System.out.println("La resta es: " + cal.restar(5, 3));
		
		System.out.println("La multiplicación es: " + cal.multiplicar(5, 3));
		
		System.out.println("La division es: " + cal.division(5, 3));
		
		System.out.println("La potencia es: " + cal.potencia(5, 3));
		
		System.out.println("La raiz es: " + cal.raiz(5));
	}

}
