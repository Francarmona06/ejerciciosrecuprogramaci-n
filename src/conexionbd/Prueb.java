package conexionbd;

import java.sql.Connection;

public class Prueb {

    public static void main(String[] args) {
        // Configura tus datos de acceso aquí
        Conexion datos = new Conexion(
            "jdbc:mysql://localhost:3306/Hotel", 
            "root",                              
            "Francarmona06"                      
        );

        // Establece conexión
        ConexionBaseDeDatos.conectar(datos);
        Connection con = ConexionBaseDeDatos.getConnection();

        if (con != null) {
            System.out.println(" Conectado correctamente a la base de datos.");
            ConexionBaseDeDatos.cerrarConexion();
        } else {
            System.out.println(" Error al conectar a la base de datos.");
        }
    }
}
