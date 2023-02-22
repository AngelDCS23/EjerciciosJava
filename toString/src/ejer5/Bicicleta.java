package ejer5;

public class Bicicleta extends Vehiculo{

	private String tipo;
	
	public Bicicleta(String color, int ruedas, String modelo, String tipo) {
		super(color, ruedas, modelo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	void acelerar() {
		System.out.println("Acelerando Bicicleta");
	}
	
	@Override
	void frenar() {
		System.out.println("Frenando bicicleta");
	}
	
	@Override
	public String toString() {
		return super.toString() + " la bicicleta es de tipo: " + tipo;
	}
}
