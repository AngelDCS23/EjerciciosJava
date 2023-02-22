package ejer8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samsung[] samsung = {
				new Samsung("A51","5G",1700,"1080"),
				new Samsung("A51","4G",1400,"1080")
		};
		
		Iphone[] iphone = {
				new Iphone("14","ProMax",2000,3080),
				new Iphone("10","Normal",1700,1080)
		};
		
		System.out.println("Datos de los moviles: ");
		System.out.println();
		
		for (Samsung Samsung : samsung) {
			System.out.println(Samsung);
			System.out.println();
			
		}
		
		for (Iphone Iphone : iphone) {
			System.out.println(Iphone);
			System.out.println();
			
		}
		
		
	}

}
