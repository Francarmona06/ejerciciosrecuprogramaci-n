package ejercicioMapinventariodeproductos;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

	public static void main(String[] args) {
		Map<String,Integer> gestioninventario = new HashMap<>();
		//Añadir producto
		gestioninventario.put("coches", 2);
		gestioninventario.put("motos", 4);
		gestioninventario.put("caravanas", 7);
		gestioninventario.put("Furgonetas", 9);
		//Actualizar producto
		gestioninventario.put("coches", gestioninventario.getOrDefault("coches", 0)+ 1);
		gestioninventario.put("motos", gestioninventario.getOrDefault("motos", 6));
		gestioninventario.put("camiones", gestioninventario.getOrDefault("coches", 5)+ 1);
		gestioninventario.put("caravanas", gestioninventario.getOrDefault("caravanas", 3));
		gestioninventario.put("Furgonetas", gestioninventario.getOrDefault("Furgonetas", 0));
		// Cantidad de un producto
		String productobuscar= "caravanas";
		if (gestioninventario.containsKey(productobuscar)) {
			Integer cantidad= gestioninventario.get(productobuscar);
			System.out.println("Cantidad: " + cantidad);
			
		// Cantidad total
			int total = 0;
		for (Integer cantidad1 : gestioninventario.values()) {
			total += cantidad1;
		}
			System.out.println("Cantidad total inventario: " + total);
		}
		//Eliminar producto
		gestioninventario.remove("caravanas", 7);
		System.out.println("Inventario actualizado: " + gestioninventario);
	}

}
