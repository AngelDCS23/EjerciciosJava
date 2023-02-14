package Ejerlibre4;

public class Modelo3 extends ModeloS{

	public Modelo3(String modelo, int autonomia, String conduccionauto, String superiorcristal) {
		super(modelo, autonomia, conduccionauto, superiorcristal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es: " + getModelo());
		System.out.println("La autonomia de este modelo es de: " + getAutonomia());
		System.out.println("Conducción automática: " + getConduccionauto());
		System.out.println("Techo de cristal: " + getSuperiorcristal());
	}
	

}
