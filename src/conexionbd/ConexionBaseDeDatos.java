package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static Connection conexion = null;

    // Establece la conexión con la base de datos usando los datos proporcionados.Solo se conecta si no existe una conexión activa.
     
    public static void conectar(Conexion datos) {
        if (conexion != null) {
            try {
                if (!conexion.isClosed()) return;
            } catch (SQLException e) {
                System.err.println("Error comprobando el estado de la conexión: " + e.getMessage());
            }
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                datos.getUrl(), datos.getUsuario(), datos.getContraseña()
            );
            System.out.println("Conexión establecida correctamente.");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL no encontrado.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    /**
     * Devuelve la conexión activa actual.
     */
    public static Connection getConnection() {
        return conexion;
    }

    // Cierra la conexión si está abierta.
    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}


