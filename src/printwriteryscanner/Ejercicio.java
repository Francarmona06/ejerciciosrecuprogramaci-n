package printwriteryscanner;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		try {
			String nombreFichero = "FicheroEnteros.txt";
			PrintWriter pwr = new PrintWriter(nombreFichero);
			
			for (int i = 1; i <= 1000; i++) {
				pwr.print(i + " ");
				if (i % 100 == 0) pwr.println();
			}
			pwr.close();
			
			Scanner scn = new Scanner(new FileReader(nombreFichero));
			while(scn.hasNext())
				System.out.println("Valor leido: " + scn.nextInt());
			scn.close();
			
		}catch (IOException e) { System.out.println("Problemas en el fichero"); }

	}

}
