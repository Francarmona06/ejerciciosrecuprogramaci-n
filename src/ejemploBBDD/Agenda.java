package ejemploBBDD;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Agenda {
	
	


	    // Cambia estos datos según tu configuración
	   /* private static final String DB_URL = "jdbc:mariadb://localhost:3307/agenda";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = " ";*/

	    public static void main(String[] args) {
	    	
	    	String DB_URL = "jdbc:mysql://localhost:3306/agenda";
		    String DB_USER = "root";
		    String DB_PASSWORD = "";
	    	
	        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
	            System.out.println("Conexión exitosa.");

	            insertarCita cita = new insertarCita();
	            // Insertar una nueva cita
	            cita.insertarCita(conn, "María González", "Dentista", LocalDateTime.of(2025, 6, 14, 16, 0));

	            // Consultar citas posteriores a cierta fecha
	            consultarCitasDesde.consultarCitasDesde(conn, LocalDateTime.of(2025, 6, 12, 0, 0));

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }}