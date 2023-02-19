package ejerlibre4;

public class ModeloS implements ModeloInterfaz{

	private String color;
	private String bateria;
	private String autonomia;
	
	public ModeloS(String color, String bateria, String autonomia) {
		super();
		this.color = color;
		this.bateria = bateria;
		this.autonomia = autonomia;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El color es: " + color);
		System.out.println("La bateria es de: " + bateria);
		System.out.println("Cuenta con " + autonomia + " de autonomia");
	}
}
