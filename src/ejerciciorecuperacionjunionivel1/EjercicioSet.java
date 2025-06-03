package ejerciciorecuperacionjunionivel1;

import java.util.HashSet;
import java.util.Set;

public class EjercicioSet {

	public static void main(String[] args) {
		Set<String> zoo = new HashSet<>();
		String a1 = new String("Perro");
		String a2 = new String("Tigre");
		String a3 = new String("Perro");
		String a4 = new String("Serpiente");
		
		zoo.add(a1);
		zoo.add(a2);
		zoo.add(a3);
		zoo.add(a4);
		
		System.out.println(zoo.size());
		
	}

}
