package interfazabstracta;

public class electrodomestico extends producto {
	
	private String marca;
	
	public electrodomestico(String nombre, String descripcion, Double precio, String marca) {
		super(nombre, descripcion, precio);
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return super.toString() + " marca" + marca;
	}
}
