package ejerciciositerableiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLibros implements Iterable<Libro> {

    // Lista donde se almacenan los libros
    private ArrayList<Libro> libros = new ArrayList<>();

    // Implementación del método iterator() para Iterable
    public Iterator<Libro> iterator() {
        return libros.iterator();
    }
    // Método para obtener copia de la lista que lo usa la clase de catalogofiltrado.
    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }
    // Método main: prueba del catálogo
    public static void main(String[] args) {
        CatalogoLibros catalogo = new CatalogoLibros();

        // Añadir libros al catálogo
        catalogo.libros.add(new Libro("El principito", "Saint-Exupéry", 1943));
        catalogo.libros.add(new Libro("Las campanas de Santiago", "Isabel San Sebastián", 2020));
        catalogo.libros.add(new Libro("El código Da Vinci", "Dan Brown", 2003));
        catalogo.libros.add(new Libro("Harry Potter y el legado maldito", "J.K. Rowling", 2016));

        // Bucle for-each 
        System.out.println("Todos los libros:");
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
        // clase para probar CatalogoFiltrado
        System.out.println("Libros publicados después del año 2000:");
        CatalogoFiltrado filtrado = new CatalogoFiltrado(catalogo);
        for (Libro libro : filtrado) {
            System.out.println(libro);
        }
    }
}

