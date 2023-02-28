package ejer;

public class TabletImp extends ProductoInformatico implements Tablet {
	private int tamañoPantalla;
	private boolean Wifi;

	// Método constructor
	public TabletImp(String nombre, double precio, int tamañoPantalla, boolean Wifi) {
		super(nombre, precio);
		this.tamañoPantalla = tamañoPantalla;
		this.Wifi = Wifi;
	}

	public boolean Wifi() {
		return Wifi;
	}

	public String getDescripcion() {
		return "Tablet " + getNombre() + " de " + tamañoPantalla + " pulgadas, " + (Wifi ? "con" : "sin")
				+ " wifi, precio: " + getPrecio();
	}

	@Override
	public void agregarCarrito() {
		super.agregarCarrito();
		System.out.println("Recibirá un estuche de cuero gratis con su compra de una tablet.");
	}

	@Override
	public int getTamañoPantalla() {
		return 0;
	}

}
