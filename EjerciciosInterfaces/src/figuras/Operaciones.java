package figuras;

public class Operaciones implements FiguraInterfaz{
	
	@Override
	public double volumencuad(int a) {
		return a * a * a;
	}
	
	@Override
	public double areacuad(int a) {
		return a * a;
	}
	
	@Override
	public double areatria(int a, int b) {
		return (a * b) / 2;
	}

}
