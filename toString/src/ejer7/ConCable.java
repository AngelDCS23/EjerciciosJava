package ejer7;

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
	
	@Override
	public String toString() {
		return super.toString() + " estos cascos cuentan con una conexión de tipo " + conexion;
	}
}
