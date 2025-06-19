package ejerciciosrecuperacionjunionivel4y5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Crear el mapa de productos y precios
        Map<String, Double> productos = new HashMap<>();
        productos.put("Manzana", 0.2);
        productos.put("Plátano", 0.8);
        productos.put("Leche", 1.5);

     // Convierto el mapa en una lista que podemos modificar, usando entrySet() para obtener los pares clave-valor.
        List<Map.Entry<String, Double>> listaOrdenada = new ArrayList<>(productos.entrySet());

     // Ordeno la lista por precio en orden ascendente con Comparator.comparing(getValue).
        listaOrdenada.sort(Comparator.comparing(Map.Entry::getValue));

        // Mostrar los productos ordenados
        for (Map.Entry<String, Double> entry : listaOrdenada) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "€");
        }
    }
}


        