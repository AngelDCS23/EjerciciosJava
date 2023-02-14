package animales;

public abstract class animal {

	private String nombre;

	public animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void MostrarDatos();
}
