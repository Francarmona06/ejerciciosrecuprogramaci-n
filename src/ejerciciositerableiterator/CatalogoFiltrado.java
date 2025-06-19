package ejerciciositerableiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoFiltrado implements Iterable<Libro> {

    private CatalogoLibros catalogo;

    // coge un catálogo original que se lo da la clase catalogo libro
    public CatalogoFiltrado(CatalogoLibros catalogo) {
        this.catalogo = catalogo;
    }

    // iterador para filtrar libros que se hayan publicado después del 2000
    @Override
    public Iterator<Libro> iterator() {
        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : catalogo.getLibros()) {
            if (libro.getAnioPublicacion() > 2000) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados.iterator();
    }
}
