package ejerciciorecuperacionjunionivel1;

public class Animales {

	private String nombre;
	private String id;
	private int edad;
	
	public Animales(String nombre, String id, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		
		
	}

	@Override
	public boolean equals(Object objeto) {
	    // Se compara con el mismo (el objeto)
	    if (this == objeto) return true;

	    // Aqui lo que se verifica es si el objeto es nulo o de otra clase
	    if (objeto == null || getClass() != objeto.getClass()) return false;
	    
	    // Lo convierto a Animal porque ya sé que es seguro
	    Animales animal = (Animales) objeto;

	    // Se comparan los IDS
	    return this.id.equals(animal.id);
	}
	@Override
	public int hashCode() {
	    // Se usa solo el 'id' para calcular el hash, porque 'equals()' también solo usa el 'id' para comparar animales.
	    // dos objetos iguales tienen mismo hassh

	    return id.hashCode(); // Genera un número único a partir del ID.
	}


	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", id=" + id + ", edad=" + edad + "]";
	}
	
}

	
	
	
	
	
