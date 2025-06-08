package ejerciciorecuperacionjunionivel1;

import java.util.HashMap;
import java.util.Map;

public class EjercicioMap1 {

	public static void main(String[] args) {
		Map<String,Double> productosyprecios = new HashMap<>();
		
		productosyprecios.put("Pan", 1.5);
		productosyprecios.put("Pescado", 8.5);
		productosyprecios.put("Carne", 12.5);
		productosyprecios.put("Fruta", 5.25);
		
		System.out.println("Productos con sus respectivos precios: ");
		for (Map.Entry<String, Double> producto : productosyprecios.entrySet()) {
			
			System.out.println(producto.getKey() + "  " + producto.getValue());
		}
	}

}
