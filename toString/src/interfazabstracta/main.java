package interfazabstracta;

public class main {
	public static void main(String[] args) {
	
		producto libro = new libro("El señor de los anillos", "Novela de aventura", 120.0, "tolstoi");
		producto electrodomestico = new electrodomestico("Refrigerador", "Refrigerador", 120.0, "LG");
		
		
		System.out.println(libro);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(electrodomestico);
		
	}
}

