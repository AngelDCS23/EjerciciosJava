package ejer3;

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
	public String toString() {
		return super.toString() + "Tipo de pelo: " + TipoPelo;
	}
	
}
