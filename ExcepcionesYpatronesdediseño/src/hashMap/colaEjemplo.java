package hashMap;

import java.util.LinkedList;
import java.util.Queue;

public class colaEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear una cola
		Queue<String> cola = new LinkedList<>();
		
		//Agregar elementos a la cola
		
		cola.add("Blanco");
		cola.add("Verde");
		cola.add("Azul");
		cola.add("Amarillo");
		System.out.println("Los colores son " + cola);
		//Obtener el primer elemento de la cola
		String primerElemento = cola.peek();
		System.out.println("El primer color es: " + primerElemento);
		
		//mostrar todos los elementos de la cola
		System.out.println("Los colores ahora son: " + cola);
		//buscar un valor
		String valor="azul";
		if (cola.contains(valor)) {
			System.out.println("Se encontró el valor " + valor);
		}
		
		else {
			System.out.println("No se encontró el valor " + valor);
		}
		
		//eliminando el último de la cola
		LinkedList<String> lista = new LinkedList<>(cola);
		String ultimoElemento = lista.getLast();
		cola.remove(ultimoElemento);
		
		//Elimina toda la cola
		cola.clear();
		System.out.println("Los colores ahora son " + cola);
		
	}

}
