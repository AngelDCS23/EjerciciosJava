package alumnosyprofesores;

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

	void MostrarDatos() {
		
		System.out.println("Nombre: " + getNombre() + " " + getApellidos());
		System.out.println("Su turno es el de: " + getTurno());
		System.out.println("Salario: " + getSalario() + " en el mes de " + getMes());
	}
}
