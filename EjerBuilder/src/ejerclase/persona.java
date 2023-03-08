package ejerclase;

public class persona {
	private String nombre;
	private int edad;
	private String direccion;
	private String email;
	private String puesto;
	private String empresa;
	private double salario;
	
	private persona(String nombre, int edad, String direccion, String email, String puesto, String empresa, double salario ) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
		this.puesto = puesto;
		this.empresa = empresa;
		this.salario =salario;	
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public int getEdad() {
		return edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public double getSalario() {
		return salario;
	}

	public static class PersonaBuilder {
		private String nombre;
		private int edad;
		private String direccion;
		private String email;
		private String puesto;
		private String empresa;
		private double salario;
		
		public PersonaBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public PersonaBuilder setEdad(int edad) {
			this.edad = edad;
			return this;
		}

		public PersonaBuilder setDireccion(String direccion) {
			this.direccion = direccion;
			return this;
		}

		public PersonaBuilder setEmail(String email) {
			this.email = email;
			return this;
		}	
		
		public PersonaBuilder setPuesto(String puesto) {
			this.puesto = puesto;
			return this;
		}
		
		public PersonaBuilder setEmpresa(String empresa) {
			this.empresa = empresa;
			return this;
		}
		public PersonaBuilder setSalario(double salario) {
			this.salario = salario;
			return this;
		}

		public persona build() {
			return new persona(nombre, edad, direccion, email, puesto, empresa, salario);
		}
	}
}
