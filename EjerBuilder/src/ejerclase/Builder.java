package ejerclase;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				persona persona1 = new persona.PersonaBuilder().setNombre("Ángel").setEdad(21).setDireccion("Benjamin Franklin, Nº26")
						.build();
				System.out.println(persona1.getNombre() + " , " + persona1.getEdad() + " , " + persona1.getDireccion() + " , "
						+ persona1.getPuesto());
				
				persona persona2 = new persona.PersonaBuilder().setNombre("Laura").setEmail("laura@gmail.com").build();
				System.out.println(persona2.getNombre() + " ," + persona2.getEdad() + ", " + persona2.getDireccion() + " "
						+ persona2.getEmail() + " , " + persona1.getPuesto());
				
				persona persona3 = new persona.PersonaBuilder().setNombre("Javi").setPuesto("jefe").setEmpresa("Google").setSalario(2100.50).build();
				System.out.println(persona3.getNombre()+ "," + persona3.getPuesto() + ", " + persona3.getEmpresa() + ", " + persona3.getSalario());
				
				persona persona4 = new persona.PersonaBuilder().setNombre("Pedro").setEdad(25).setDireccion("Plaza del Sol, 1")
						.setEmail("pedro@example.com").setPuesto("Programador").setEmpresa("Xbox").setSalario(1500.65).build();
				System.out.println(persona4.getNombre() + ", " + persona4.getEdad() + ", " + persona4.getDireccion() + " "
						+ persona4.getEmail() + " , " + persona4.getDireccion() + " , " + persona4.getPuesto() + ", "+ persona4.getSalario());
	}

}
