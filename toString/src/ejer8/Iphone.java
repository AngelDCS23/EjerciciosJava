package ejer8;

public class Iphone extends Movil{

	private int camara;
	
	public Iphone(String nombre, String modelo, int bateria, int camara) {
		super(nombre, modelo, bateria);
		this.camara = camara;
	}
	
	public int getCamara() {
		return camara;
	}
	
	public void setCamara(int camara) {
		this.camara = camara;
	}

	@Override
	public String toString() {
		return super.toString() + " y cuentan con " + camara + " camaras";
	}
}
