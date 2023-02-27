package ejer10;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ProductosInformaticos> produc = new ArrayList<ProductosInformaticos>();
		
		produc.add(new ProductosInformaticos("Iphone","Teléfono","Apple"));
		produc.add(new ProductosInformaticos("Ipad","Tablet","Apple"));
		produc.add(new ProductosInformaticos("Pencil","lapiz","Apple"));
		produc.add(new ProductosInformaticos("Macbook","Portatil","Apple"));
		
		System.out.println("Los datos de los productos son: ");
		
		for (ProductosInformaticos pro : produc) {
			System.out.println(pro.toString());
			
		
		}
		
		Collections.sort(produc);
		
		System.out.println("Los datos ordenados alfabeticamente: ");
		
		for (ProductosInformaticos pro : produc) {
			System.out.println(pro.toString());
		}
	}
}
