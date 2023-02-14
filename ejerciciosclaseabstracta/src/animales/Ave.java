package animales;

public class Ave extends animal{
	
	private String TipoPlumaje;

	public Ave(String nombre, String tipoPlumaje) {
		super(nombre);
		TipoPlumaje = tipoPlumaje;
	}

	public String getTipoPlumaje() {
		return TipoPlumaje;
	}

	public void setTipoPlumaje(String tipoPlumaje) {
		TipoPlumaje = tipoPlumaje;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Tipo de plumaje: " + getTipoPlumaje());
	}
}
