package ejer3;

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
	public String toString() {
		return super.toString() + "Se encuentra en agua " + agua;
	}
}
