package ejer9;

public class Libros implements Comparable<Libros> {
	private String nombre;
	private String autor;
	private String genero;
	
	public Libros(String nombre, String autor, String genero) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return "El nombre del libro es: " + nombre + " el autor es: " + autor + " y el genero: " + genero;
	}
	
	@Override
    public int compareTo(Libros o) {
        // Comparar por nombre
        return this.nombre.compareTo(o.nombre);
    }   
	
}
