package ejemploBBDD;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class insertarCita {

	public void insertarCita(Connection conn, String nombre, String descripcion, LocalDateTime fecha) throws SQLException {
        String sql = "INSERT INTO citas (nombre, descripcion, fecha) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setTimestamp(3, Timestamp.valueOf(fecha));
            stmt.executeUpdate();
            System.out.println("Cita insertada.");
        }
    }
}