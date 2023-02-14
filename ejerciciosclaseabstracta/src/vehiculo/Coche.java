package vehiculo;

public class Coche extends Vehiculo{
	
	private int cilindrada;
	
	public Coche(String color, int ruedas, String modelo, int cilindrada) {
		super(color, ruedas, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	void acelerar() {
		System.out.println("Acelerando el coche");
	}
	
	@Override
	void frenar() {
		System.out.println("Frenando el coche");
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Color: " + getColor());
		System.out.println("Número ruedas: " + getRuedas());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cilindrada: " + getCilindrada());
	}
}
