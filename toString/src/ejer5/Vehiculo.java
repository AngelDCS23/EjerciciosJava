package ejer5;

public abstract class Vehiculo {

	private String color;
	private int ruedas;
	private String modelo;
	
	public Vehiculo(String color, int ruedas, String modelo) {
		super();
		this.color = color;
		this.ruedas = ruedas;
		this.modelo = modelo;
	}

	abstract void acelerar();
	
	abstract void frenar();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "El color es: " + color + " , tiene " + ruedas + " ruedas " + " , y el modelo es " + modelo;
	}
	
}
