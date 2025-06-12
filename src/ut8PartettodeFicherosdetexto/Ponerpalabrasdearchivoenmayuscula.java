package ut8PartettodeFicherosdetexto;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Ponerpalabrasdearchivoenmayuscula {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        // Si el archivo no existe, lo creo con contenido de prueba
        crearArchivoSiNoExiste(nombreArchivo);

        // Capitaliza palabras del archivo
        capitalizarPalabrasArchivo(nombreArchivo);
    }

    // Creo el archivo con contenido de ejemplo si no existe
    public static void crearArchivoSiNoExiste(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                FileWriter fw = new FileWriter(nombreArchivo);
                fw.write("hola mundo desde java.\nesto es una prueba del archivo.");
                fw.close();
                System.out.println("Archivo creado con contenido de prueba.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }
    }

    // Lee el archivo y modifica su contenido capitalizando cada palabra
    public static void capitalizarPalabrasArchivo(String nombreArchivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            StringBuilder contenidoModificado = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].length() > 0) {
                        palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
                    }
                }
                contenidoModificado.append(String.join(" ", palabras)).append("\n");
            }
            br.close();

            FileWriter fw = new FileWriter(nombreArchivo, false); // Sobrescribe el archivo
            fw.write(contenidoModificado.toString());
            fw.close();

            System.out.println("Contenido del archivo modificado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al modificar el archivo: " + e.getMessage());
        }
    }
}


