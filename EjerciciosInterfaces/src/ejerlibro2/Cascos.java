package ejerlibro2;

public class Cascos implements Libre2Interfaz{
	
	private String modelo;
	private int bateria;
	private String color;
	
	public Cascos(String modelo, int bateria, String color) {
		super();
		this.modelo = modelo;
		this.bateria = bateria;
		this.color = color;
	}
	
	@Override
	public double cal (int a) {
		return a / 100;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es: " + modelo);
		System.out.println("La baria es de: " + bateria);
		System.out.println("El de color : " + color);
	}
	
	
}
