package ejer8;

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
	public String toString() {
		return super.toString() + " estos moviles cuenta con una pantalla de " + pantalla;
	}
}
