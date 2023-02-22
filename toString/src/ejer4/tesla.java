package ejer4;

public abstract class tesla {
	private String modelo;
	private int autonomia;
	private String conduccionauto;
	
	public tesla(String modelo, int autonomia, String conduccionauto) {
		super();
		this.modelo = modelo;
		this.autonomia = autonomia;
		this.conduccionauto = conduccionauto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public String getConduccionauto() {
		return conduccionauto;
	}

	public void setConduccionauto(String conduccionauto) {
		this.conduccionauto = conduccionauto;
	}
	
	@Override
	public String toString() {
		return "modelo" + modelo + "autonomia" + autonomia + " , ¿Cuenta con cundicción automática?: " + conduccionauto;
	}
	
}
