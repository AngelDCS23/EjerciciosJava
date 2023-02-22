package ejer2;

public class Trabajador extends profesor{
	
	private String turno;
	private String mes;

	public Trabajador(String nombre, String apellidos, int salario, String turno, String mes) {
		super(nombre, apellidos, turno, salario, turno);
		this.turno = turno;
		this.mes = mes;
	}
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return super.toString() + " turno: " + turno + " mes " + mes;
	}
}
