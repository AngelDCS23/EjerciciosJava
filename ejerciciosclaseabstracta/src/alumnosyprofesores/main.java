package alumnosyprofesores;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno[] alumnos = {
				new Alumno("Alberto","Alba","Programación",7.5,9),
				new Alumno("Juan","Perez","Base de datos",8.5,10)
				};
		
		profesor[] profesores = {
				new profesor("Alberto","Ruiz","Programación",3000,"Enero"),
				new profesor("Bernardo","Perez","Sistemas",3000,"Febrero")
				};
		
		Trabajador[] trabajadores = {
				new Trabajador("Ángel","De Cara Salas", 1800,"Tarde","Enero"),
				new Trabajador("Sergio","Perez",1800,"Mañana","Febrero")
		};
		
		System.out.println("Datos de los alumnos: ");
		
		for(Alumno alumno : alumnos) {
			
			alumno.MostrarDatos();
			System.out.println();
			
		}
		
		System.out.println("Datos de profesores: ");
		
		for (profesor profesor : profesores) {
			
			profesor.MostrarDatos();
			System.out.println();
		}
		
		System.out.println("Datos de los trabajadores: ");
		
		for (Trabajador trabajador : trabajadores){
			
			trabajador.MostrarDatos();
			System.out.println();	
		}
		
		
	}

}
