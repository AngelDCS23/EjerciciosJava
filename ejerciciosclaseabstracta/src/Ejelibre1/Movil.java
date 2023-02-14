package Ejelibre1;

public abstract class Movil {
	
	private String nombre;
	private String modelo;
	private int bateria;
	
	public Movil(String nombre, String modelo, int bateria) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.bateria = bateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	abstract void MostrarDatos();
	
	
}
