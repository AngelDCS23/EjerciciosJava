package ejer3;

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
	public String toString() {
		return super.toString() + "Tipo de plumaje: " + TipoPlumaje;
	}
}
