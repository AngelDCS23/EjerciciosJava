package ejer4;

public class Gato {
	private String nombre;
	private String color;
	private String tipo;
	
	public Gato(String nombre, String color, String tipo) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	
	public String toString() {
		return "Nombre: " + nombre + " Color: " + color + " Tipo: " + tipo; 
	}
	
	
}
