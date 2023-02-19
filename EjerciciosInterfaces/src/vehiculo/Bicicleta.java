package vehiculo;

public class Bicicleta implements VehiculoInterfaz{

	private String modelo;
	private String tipo;
	private String color;
	
	public Bicicleta(String modelo, String tipo, String color) {
		super();
		this.modelo = modelo;
		this.tipo = tipo;
		this.color = color;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo de la bici es: " + modelo);
		System.out.println("Es una bici de: " + tipo);
		System.out.println("El color es: " + color);
		
	}
	
	@Override
	public void Gracias() {
		System.out.println("Gracias por comprar su bicicleta con nosotros");
	}
	
	
}
