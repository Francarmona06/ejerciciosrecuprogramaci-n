package ejerciciosrecuperacionjunionivel4y5;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio13 {

	public static void main(String[] args) {
        // Crea un mapa donde cada producto tiene un precio
        Map<String, Double> productos = new HashMap<>();
        productos.put("Manzana", 0.2);
        productos.put("Platano", 0.8);
        productos.put("Leche", 1.5);

        // Recorre el mapa e imprimir cada producto con su precio
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            // entry.getKey() es el nombre del producto
            // entry.getValue() es el precio
            System.out.println(entry.getKey() + ": " + entry.getValue() + "€");
        }
    }}




