package ejerciciosrecuperacionjunionivel4y5;

import java.util.Comparator;

public class Comparadornotaynombre implements Comparator<Alumno> {
	public int compare(Alumno a1, Alumno a2) {
		int resultadoNota = Double.compare(a2.getNota(), a1.getNota());
		
		// Si las notas son diferentes ordena por nota sino ordena por orden alfabetico
		return (resultadoNota != 0) ? resultadoNota : a1.getNombre().compareTo(a2.getNombre());

	}

}
