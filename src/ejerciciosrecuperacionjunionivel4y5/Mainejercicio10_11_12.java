package ejerciciosrecuperacionjunionivel4y5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Mainejercicio10_11_12 {
	// Creo lista de alumnos con diferentes nombres.
	public static void main(String[] args) {
		List<Alumno> alumnos = Arrays.asList(
				new Alumno ("Augusto", 8.5),
				new Alumno ("Manuel", 6.25),
				new Alumno ("Fran",10),
				new Alumno ("Carlos", 6.25));
		// Ordeno la lista usando el comparator por longitud del nombre.
		Collections.sort(alumnos, new Alumnoporlongnombre());
		
		System.out.println("Ordenado por longitud de nombre: ");
		System.out.println(alumnos);
		
		Collections.sort(alumnos, new Comparadornotaynombre());
		
		System.out.println("Ordenado por nota y nombre: ");
		System.out.println(alumnos);
		
		//Aquí estoy creando el treeset
		Set<Alumno> alumnosordenados = new TreeSet<>(new Comparadornotaynombre());

		// Agrega los alumnos al TreeSet 
		alumnosordenados.addAll(alumnos);

		// muestra los alumnos ordenados en TreeSet
		System.out.println("Ordenado por treeset: ");
		System.out.println(alumnos);
}}
