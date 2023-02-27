package ejer5;

public class ProductosInformaticos {
	private String nombre;
	private String descripcion;
	private String proveedor;
	
	public ProductosInformaticos(String nombre, String descripcion, String proveedor) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.proveedor = proveedor;
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

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	public String toString() {
		return "Nombre: " + nombre + " descripcion del producto: " + descripcion + " y el proveedor es: " + proveedor;
	}
}
