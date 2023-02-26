package selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SeleniumTest {
	private Libro libro;
	@BeforeEach
	public void inicializarLibro() {
		libro = new Libro();
		libro.setIsbn("123-456-789");
		libro.setTitulo("asdasd");
		libro.setAutor("Autor");
		libro.setNumeroDePaginas(200);
	}

	@AfterEach
	public void limpiarLibro() {
		libro = null;
	}

	@Test
	void testGetIsbn() {
		String resultadoEsperado = "123-456-789";
		String resultadoObtenido = libro.getIsbn(); 
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testGetTitulo() {
		String resultadoEsperado = "asdasd"; 
		String resultadoObtenido = libro.getTitulo(); 
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testGetAutor() {
		String resultadoEsperado = "Autor"; 
		String resultadoObtenido = libro.getAutor(); 
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testGetNumeroDePaginas() {
		int resultadoEsperado = 200;
		int resultadoObtenido = libro.getNumeroDePaginas(); 
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
