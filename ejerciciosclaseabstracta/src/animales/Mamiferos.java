package animales;

public class Mamiferos extends animal {
	
	private String TipoPelo;

	public Mamiferos(String nombre, String tipoPelo) {
		super(nombre);
		TipoPelo = tipoPelo;
	}

	public String getTipoPelo() {
		return TipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		TipoPelo = tipoPelo;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Tipo de pelo: " + getTipoPelo());
	}
	
}
