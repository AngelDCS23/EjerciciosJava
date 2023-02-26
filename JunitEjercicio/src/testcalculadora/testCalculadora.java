package testcalculadora;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class testCalculadora {


	@Test
	public void testSuma() {
		int espera = 5;
		int actual = Calculadora.suma(2, 3);
		assertEquals(espera, actual);
	}

	@Test
	 public void testResta() {
	 int espera = 2;
	 int actual = Calculadora.resta(5,3);
	 assertEquals(espera, actual);
}
	@Test
	 public void testMultiplicacion() {
	 int espera = 15;
	 int actual = Calculadora.multiplicacion(5,3);
	 assertEquals(espera, actual);
}
	@Test
	 public void testDivision() {
	 double espera = 3;
	 double actual = Calculadora.division(5,3);
	 assertEquals(espera, actual,espera);
}
	@Test
	 public void testRaiz() {
	 double espera = 2;
	 double actual = Calculadora.raiz(4);
	 assertEquals(espera, actual,espera);
}
	@Test
	 public void testPotencia() {
	 double espera = 125;
	 double actual = Calculadora.potencia(5,3);
	 assertEquals(espera, actual,espera);
}
}
