package ejer6;

public class portatil extends Pc{

	private int resumonitor;
	private int bateria;
	
	public portatil(String grafica, String cpu, int ram, int resumonitor, int bateria) {
		super(grafica, cpu, ram);
		this.resumonitor = resumonitor;
		this.bateria = bateria;
	}

	public int getResumonitor() {
		return resumonitor;
	}

	public void setResumonitor(int resumonitor) {
		this.resumonitor = resumonitor;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	@Override
	public String toString() {
		return super.toString() + " la pantalla del ordenador cuenta con una resolución de " + resumonitor + " y una beteria de " + bateria;
	}
	
	
	
}
