package animales;

public class Peces extends animal {
	
	private String agua;

	public Peces(String nombre, String agua) {
		super(nombre);
		this.agua = agua;
	}

	public String getAgua() {
		return agua;
	}

	public void setAgua(String agua) {
		this.agua = agua;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Tipo de plumaje: " + getAgua());
	}
}
