package ejerciciosrecuperacionjunionivel4y5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio15 {

	public static void main(String[] args) {
        // Mapa de asignaturas con listas de alumnos
        Map<String, List<String>> asignaturas = new HashMap<>();
        asignaturas.put("Matemáticas", Arrays.asList("Carlos", "Fran", "David"));
        asignaturas.put("Historia", Arrays.asList("Fran", "Bernardo", "Carlos"));
        asignaturas.put("Lengua", Arrays.asList("David", "Carlos", "Elena"));

        // Mapa para contar cuántas veces aparece cada alumno
        Map<String, Integer> contador = new HashMap<>();

        // Recorre cada lista dentro del mapa
        for (List<String> lista : asignaturas.values()) {
            for (String alumno : lista) {
                // Si el alumno ya está en el contador, sumamos 1 sino se pone 1
                contador.put(alumno, contador.getOrDefault(alumno, 0) + 1);
            }
        }

        // Mostrar los alumnos que aparecen en más de una asignatura
        System.out.println("Alumnos en varias asignaturas:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            // Si el valor que es la cantidad de veces que aparece es mayor a 1 lo imprimimos
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }}


