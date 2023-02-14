package Ejerlibre2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConCable[] cable = {
				new ConCable("Razer","Kraken","USB"),
				new ConCable("Logitech","G335 ","USB")
		};
		
		CascosBluetooth[] bluetooth = {
				new CascosBluetooth("Apple","Airpods",800,5),
				new CascosBluetooth("Xiaomi","Max",1000,8),
		};
		
		System.out.println("Los datos de los moviles son: ");
		System.out.println();
		
		for (ConCable ConCable : cable) {
			ConCable.MostrarDatos();
			System.out.println();
		}
		
		for (CascosBluetooth CascosBluetooth: bluetooth) {
			CascosBluetooth.MostrarDatos();
			System.out.println();
		}
	}

}
