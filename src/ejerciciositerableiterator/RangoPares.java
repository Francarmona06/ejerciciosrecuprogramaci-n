package ejerciciositerableiterator;

// Importa la interfaz Iterator de Java
import java.util.Iterator;

// Clase RangoPares que implementa Iterable<Integer>
public class RangoPares implements Iterable<Integer> {
	private int inicio;  // Límite inferior del rango
	private int fin;     // Límite superior del rango
	
	// Constructor: guarda los valores de inicio y fin
	public RangoPares(int inicio, int fin) {
		this.inicio = inicio;
		this.fin = fin;
	}
	// Método obligatorio al implementar Iterable: devuelve un iterador
	public Iterator<Integer> iterator() {
		return new IteradorPar(); // Devuelve una instancia del iterador personalizado
	}
	// Clase interna que define el comportamiento del iterador
	private class IteradorPar implements Iterator<Integer> {
		private int actual; // Número actual que se va a devolver en next()
		// Constructor del iterador: inicializa 'actual' al primer número par dentro del rango
		public IteradorPar() {
			if (inicio % 2 == 0) {
				actual = inicio; // Si inicio es par, lo usamos
			} else {
				actual = inicio + 1; // Si no, comenzamos en el siguiente número par
			}
		}
		// Indica si aún quedan números pares por devolver
		public boolean hasNext() {
			return actual <= fin; // Mientras 'actual' no pase del fin, hay más pares
		}
		// Devuelve el número par actual y avanza al siguiente (sumando 2)
		public Integer next() {
			int temp = actual; // Guardamos el valor actual
			actual += 2;       // Saltamos al siguiente número par
			return temp;       // Devolvemos el par actual
		}
	}
}
