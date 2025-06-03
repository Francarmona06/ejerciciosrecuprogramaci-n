package ejerciciorecuperacionjunionivel1;

import java.util.ArrayList;


public class EjercicioList {
	public static void main (String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Jose");
		nombres.add("Adrián");
		nombres.add("Rafael");
		nombres.add("Gema");
		
		
		for (String nombre : nombres) {
			System.out.println(nombre);
			
		for (int n = 0; n < nombres.size(); n++) {
			String nombre1 = nombres.get(n);
			System.out.println(nombre1);
		}
		}
	}

	
	
	
	
}
