package vehiculo;

public class Moto extends Vehiculo{

	private int cilindrada;

	public Moto(String color, int ruedas, String modelo, int cilindrada) {
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
		System.out.println("Acelerando Moto");
	}
	
	@Override
	void frenar() {
		System.out.println("Frenando Moto");
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Color: " + getColor());
		System.out.println("Número ruedas: " + getRuedas());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cilindrada: " + getCilindrada());
	}
}
