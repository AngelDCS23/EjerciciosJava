package ejer2;

public abstract class persona {

	private String nombre;
	private String apellidos;
	private String asignatura;
	
	public persona(String nombre, String apellidos, String asignatura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignatura = asignatura;
	}
	
	public persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " apellidos " + apellidos + " asignaturas " + asignatura;
	}
}
