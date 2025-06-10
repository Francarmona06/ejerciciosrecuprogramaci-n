package ejerciciowriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		String texto = "Este es un ejemplo de uso de FileWriter en JAVA";
		String fichero = "fichero.txt";
		
		try {
			FileWriter fileWriter = new FileWriter(fichero);
			
			fileWriter.write(texto);
			
			fileWriter.close();
			
			System.out.println("Se ha escrito en el fichero correctamente");
			
			FileReader fileReader = new FileReader(fichero);
			
			int caracter;
			System.out.println("Contenido del archivo " +fichero+ ":");
			while ((caracter = fileReader.read()) != -1) {
				System.out.print((char) caracter);
			}
			fileReader.close();
			
			
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error al escribir en el fichero");
			e.printStackTrace();
		}

	}
}