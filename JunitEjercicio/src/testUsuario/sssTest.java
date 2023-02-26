package testUsuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sssTest {

	@Test
	void testCompareusuario() {
		String nombre = "angel";
		String nombre2 = "angel";
		boolean actual = sss.compareusuario(nombre,nombre2);
		assertEquals(true,actual);
	}
	
	@Test
	void comparecontraseña() {
		int numero = 1234;
		int contraseña = 1234;
		boolean actual = sss.comparecontraseña(numero,contraseña);
		assertEquals(true,actual);
	}
}
