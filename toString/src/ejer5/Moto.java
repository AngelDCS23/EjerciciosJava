package ejer5;

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
	public String toString() {
		return super.toString() + " cuenta con una cilindrada de " + cilindrada;
	}
}
