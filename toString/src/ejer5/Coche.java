package ejer5;

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
	public String toString() {
		return super.toString() + " cuenta con una cilindrada de " + cilindrada;
	}
}
