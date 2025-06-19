package ut8PartettodeFicherosdetexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarPalabraDelArchivo {

public static void eliminarPalabraDelArchivo(String nombreArchivo, String palabraAEliminar) {
    try {
        // Crear nombre del nuevo archivo
        String nuevoNombre = nombreArchivo.replace(".txt", "_2.txt");

        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        FileWriter fw = new FileWriter(nuevoNombre);

        String linea;
        while ((linea = br.readLine()) != null) {
            // Elimina la palabra (exacta) de la línea, respetando los espacios
            String nuevaLinea = linea.replaceAll("\\b" + palabraAEliminar + "\\b", "");
            // Elimina dobles espacios que quedan y limpia extremos
            nuevaLinea = nuevaLinea.replaceAll("\\s{2,}", " ").trim();
            fw.write(nuevaLinea + "\n");
        }

        br.close();
        fw.close();

        System.out.println("Se creó el archivo sin la palabra '" + palabraAEliminar + "': " + nuevoNombre);
    } catch (IOException e) {
        System.out.println("Error al procesar el archivo: " + e.getMessage());
    }
}}
