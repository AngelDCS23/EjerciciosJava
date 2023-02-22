package interfazabstracta;

public abstract class producto {
	private String nombre;
	private String descripcion;
	private Double precio;
	
	public producto(String nombre, String descripcion, Double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "descripcion: " + descripcion + "Precio" + precio;
	}
}
