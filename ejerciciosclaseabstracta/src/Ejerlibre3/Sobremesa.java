package Ejerlibre3;

public class Sobremesa extends Pc{

	public Sobremesa(String grafica, String cpu, int ram) {
		super(grafica, cpu, ram);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El módelo de gráfica es: " + getGrafica());
		System.out.println("La CPU es: " + getCpu());
		System.out.println("Tiene " + getRam() + " de ram");
	}
	
	
	
}
