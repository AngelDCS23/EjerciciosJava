package ejer9;

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
	public String toString() {
		return super.toString() + " El ordenador cunta con una " + grafica + " como gráfica, un " + cpu + " como procesador y "  + ram + " de ram"; 
	}
	
	
}
