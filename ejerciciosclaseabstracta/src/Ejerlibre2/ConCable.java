package Ejerlibre2;

public class ConCable extends Cascos{

	private String conexion;

	public ConCable(String marca, String modelo, String conexion) {
		super(marca, modelo);
		this.conexion = conexion;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}
	
	public void MostrarDatos() {
		
		System.out.println("La marca de los cascos es: " + getMarca());
		System.out.println("El modelo es: " + getModelo());
		System.out.println("El tipo de conexión es: " + getConexion());
		
	}
}
