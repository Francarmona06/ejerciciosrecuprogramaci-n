package ejerciciorecuperacionjunionivel1;

import java.util.HashSet;
import java.util.Set;

public class Animalesparte2 {

	public static void main(String[] args) {
		
		Set<Animales> zoo = new HashSet<>();
		
		Animales n1 = new Animales("Cabra", "346BE", 3);
		Animales n2 = new Animales("Gallina", "309AW", 1);
		Animales n3 = new Animales("Gallina", "309AW", 1);
		Animales n4 = new Animales("Vaca", "309AW", 8);
		
		zoo.add(n1); //Cabra
		zoo.add(n2); // Cabra y gallina
		zoo.add(n3); // no mete a la gallina otra vez porque ya existe con el mismo id.
		zoo.add(n4); // no mete a la vaca porque tiene el mismo id que la gallina.
		zoo.add(n1); 
		zoo.add(new Animales("Gallina", "309S", 1)); 
		
		for (Animales animal : zoo) {
		    System.out.println(animal);
		}
	}
}
	
