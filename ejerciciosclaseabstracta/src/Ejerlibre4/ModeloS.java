package Ejerlibre4;

public class ModeloS extends tesla{
	private String superiorcristal;

	public ModeloS(String modelo, int autonomia, String conduccionauto, String superiorcristal) {
		super(modelo, autonomia, conduccionauto);
		this.superiorcristal = superiorcristal;
	}

	public String getSuperiorcristal() {
		return superiorcristal;
	}

	public void setSuperiorcristal(String superiorcristal) {
		this.superiorcristal = superiorcristal;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es: " + getModelo());
		System.out.println("La autonomia de este modelo es de: " + getAutonomia());
		System.out.println("Conducción automática: " + getConduccionauto());
		System.out.println("Techo de cristal: " + getSuperiorcristal());
	}
	
	

}
