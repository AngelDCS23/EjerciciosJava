package alumnosyprofesores;

public class Alumno extends persona {

	private double evaluaacion;
	private int nota;
	
	public Alumno(String nombre, String apellidos, String asignatura, double evaluaacion, int nota) {
		super(nombre, apellidos, asignatura);
		this.evaluaacion = evaluaacion;
		this.nota = nota;
	}

	public double getEvaluaacion() {
		return evaluaacion;
	}

	public void setEvaluaacion(double evaluaacion) {
		this.evaluaacion = evaluaacion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	void MostrarDatos() {
		
		System.out.println("Nombre: " + getNombre() + " " + getApellidos());
		System.out.println("Asignatura: " + getAsignatura());
		System.out.println("Evaluación: " + getEvaluaacion());
		System.out.println("Nota: " + getNota());
	}
	
	
}
