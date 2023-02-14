package Ejelibre1;

public class Samsung extends Movil{

	private String pantalla;

	public Samsung(String nombre, String modelo, int bateria, String pantalla) {
		super(nombre, modelo, bateria);
		this.pantalla = pantalla;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Detalles movil: ");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Bateria: " + getBateria());
		System.out.println("Pantalla: " + getPantalla());
	}
}
