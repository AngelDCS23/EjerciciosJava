package ejerlibro3;

public class Pc implements PcInterfaz{

	private String grafica;
	private String cpu;
	private int ram;
	
	public Pc(String grafica, String cpu, int ram) {
		super();
		this.grafica = grafica;
		this.cpu = cpu;
		this.ram = ram;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("La grafica del ordenador es: " + grafica);
		System.out.println("La CPU es: " + cpu);
		System.out.println("El ordenador cuenta con: " + ram + " de ram");
	}
	
	
}
