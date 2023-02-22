package ejer7;

public class CascosBluetooth extends Cascos{
	
	private int bateria;
	private int duracionbeteria;
	
	public CascosBluetooth(String marca, String modelo, int bateria, int duracionbeteria) {
		super(marca, modelo);
		this.bateria = bateria;
		this.duracionbeteria = duracionbeteria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public int getDuracionbeteria() {
		return duracionbeteria;
	}

	public void setDuracionbeteria(int duracionbeteria) {
		this.duracionbeteria = duracionbeteria;
	}
	
	@Override
	public String toString() {
		return super.toString() + " este modelo cuenta con una bateria de " + bateria + " que le da una autonomia de " + duracionbeteria;
	}
	
	
}
