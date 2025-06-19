package ejerciciosrecuperacionjunionivel4y5;

import java.util.Comparator;

public class Alumnoporlongnombre implements Comparator<Alumno> {
	// Si el nombre de a1 es más corto devuelve un número negativo a1 va primero si es a2 pues seria al contrario .
	    public int compare(Alumno a1, Alumno a2) {
	    return Integer.compare(a1.nombre.length(), a2.nombre.length());
	    }
	}