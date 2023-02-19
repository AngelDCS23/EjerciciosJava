package vehiculo;

public class Patin implements VehiculoInterfaz{

	private String modelo;
	private int bateria;
	private String color;
	
	public Patin(String modelo, int bateria, String color) {
		super();
		this.modelo = modelo;
		this.bateria = bateria;
		this.color = color;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo del patin es: " + modelo);
		System.out.println("La beteria del patin es de: " + bateria);
		System.out.println("El color patin es: " + color);
		
	}
	
	@Override
	public void Gracias() {
		System.out.println("Gracias por comprar su patinete con nosotros");
	}
	
	
}
