package ejer8;

import ejer4.Gato;

public class GatoComprar implements Comparable<GatoComprar>{
	private String nombre;
	private String color;
	private String raza;
	
	public GatoComprar(String nombre, String color, String raza) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String toString() {
		return "El nombre es: " + nombre + " , el color: " + color + " y la raza: " + raza;
	}
	
	public int compareTo(Gato g) {
		return (this.nombre).compareTo(g.getNombre());
	}
	
	@Override
	public int compareTo(GatoComprar o) {
		return 0;
	}
	
	
}
