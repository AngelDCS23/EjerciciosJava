package interfazabstracta;

public class libro extends producto{
	
	private String autor;
	
	public libro(String nombre, String descripcion, Double precio, String autor) {
		super(nombre, descripcion, precio);
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return super.toString() + " Autor" + autor;
	}
	
	
	

}
