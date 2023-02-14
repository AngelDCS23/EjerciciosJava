package Ejerlibre3;

public abstract class Pc {
	private String grafica;
	private String cpu;
	private int ram;
	
	public Pc(String grafica, String cpu, int ram) {
		super();
		this.grafica = grafica;
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	abstract void MostrarDatos();
	
}
