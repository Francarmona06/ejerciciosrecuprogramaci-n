package ut8PartettodeFicherosdetexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pagina36 {
// metodo para contar palabras.
public static void contarPalabras(String nombreArchivo) {
try {
int palabras = 0;
FileReader fr = new FileReader(nombreArchivo);
BufferedReader br = new BufferedReader(fr);
String linea;
while ((linea = br.readLine()) != null) {
String[] palabrasLinea = linea.split("\\s+");
palabras += palabrasLinea.length;
}
//al cerrar el BufferedReader se cierra también el FileReader
br.close();
System.out.println(nombreArchivo + " tiene " + palabras + " palabras");
} catch (IOException e) {
System.out.println("Error al leer el archivo: " + e.getMessage());
}
}
// metodo para crear archivo.
public static void crearArchivo(String nombreArchivo) {
	try {
		FileWriter fw = new FileWriter(nombreArchivo);
		fw.write("esto es una prueba");
		fw.write("con lineas y palabras para contar");
		fw.close();
		System.out.println("Archivo bien creado");
		
	}catch (IOException e) {
		System.out.println("Error al crear archivo: " + e.getMessage());
	}
}}