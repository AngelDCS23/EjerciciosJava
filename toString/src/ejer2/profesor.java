package ejer2;

public class profesor extends persona{
	
	private int salario;
	private String mes;
	
	public profesor(String nombre, String apellidos, String asignatura, int salario, String mes) {
		super(nombre, apellidos, asignatura);
		this.salario = salario;
		this.mes = mes;
	}
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		return super.toString() + " salario: " + salario + " mes " + mes;
	}
}
