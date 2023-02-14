package Ejerlibre2;

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
	
	public void MostrarDatos() {
		
		System.out.println("La marca de los cascos es: " + getMarca());
		System.out.println("El modelo es: " + getModelo());
		System.out.println("La beteria es de: " + getBateria());
		System.out.println("La duracion en horas es de: " + getDuracionbeteria());
	}
	
	
}
