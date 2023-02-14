package Ejelibre1;

public class Iphone extends Movil{

	private int camara;
	
	public Iphone(String nombre, String modelo, int bateria, int camara) {
		super(nombre, modelo, bateria);
		this.camara = camara;
	}
	
	public int getCamara() {
		return camara;
	}
	
	public void setCamara(int camara) {
		this.camara = camara;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Detalles movil: ");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Bateria: " + getBateria());
		System.out.println("Camaras: " + getCamara());
	}
}
