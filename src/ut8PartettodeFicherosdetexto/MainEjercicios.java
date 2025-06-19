package ut8PartettodeFicherosdetexto;



public class MainEjercicios {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        String palabraAEliminar = "prueba"; // palabra a eliminar del archivo

        // 1. Crear archivo con contenido
        pagina36.crearArchivo(nombreArchivo);

        // 2. Capitalizar palabras del archivo
        Ponerpalabrasdearchivoenmayuscula.capitalizarPalabrasArchivo(nombreArchivo);

        // 3. Eliminar la palabra indicada y generar archivo nuevo
        EliminarPalabraDelArchivo.eliminarPalabraDelArchivo(nombreArchivo, palabraAEliminar);

        // 4. Contar palabras del archivo original (opcional, como extra)
        pagina36.contarPalabras(nombreArchivo);
    }
}
