package ejer;

public class AccesoriosImp extends ProductoInformatico implements Accesorios{

	private String marca;
	private String tipo;
	
	public AccesoriosImp(String nombre, double precio, String marca, String tipo) {
		super(nombre, precio);
		this.marca = marca;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " Marca; " + marca + ", Tipo: " + tipo;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
}
