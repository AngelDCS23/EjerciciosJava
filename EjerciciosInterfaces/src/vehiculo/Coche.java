package vehiculo;

public class Coche implements VehiculoInterfaz{
	
	private String modelo; 
	private String color; 
	private String motor;
	
	public Coche(String modelo, String color, String motor) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
	}
	
	@Override
	public void Gracias() {
		System.out.println("Gracias por su compra");
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo del coche es: " + modelo);
		System.out.println("El color del coche es: " + color);
		System.out.println("El motor del coche es: " + motor);
		
	}	
	
}
