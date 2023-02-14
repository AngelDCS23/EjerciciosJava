package Ejerlibre3;

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
	public void MostrarDatos() {
		System.out.println("El módelo de gráfica es: " + getGrafica());
		System.out.println("La CPU es: " + getCpu());
		System.out.println("Tiene " + getRam() + " de ram");
		System.out.println("Tiene una beteria de " + getBateria());
		System.out.println("La resolución de la pantalla es de " + getResumonitor());
	}
	
	
	
}
