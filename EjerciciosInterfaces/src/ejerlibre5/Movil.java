package ejerlibre5;

public class Movil implements InterfazMovil{
	
	private String nombre;
	private String modelo;
	private int bateria;
	
	public Movil(String nombre, String modelo, int bateria) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.bateria = bateria;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El modelo es: " + modelo);
		System.out.println("Cuenta con una beteria de " + bateria);
	}
	
	
}
