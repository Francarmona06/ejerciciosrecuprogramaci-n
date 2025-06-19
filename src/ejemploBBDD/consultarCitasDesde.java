package ejemploBBDD;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class consultarCitasDesde {

	public static void consultarCitasDesde(Connection conn, LocalDateTime desdeFecha) throws SQLException {
        String sql = "SELECT * FROM citas WHERE fecha >= ? ORDER BY fecha";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(desdeFecha));
            ResultSet rs = stmt.executeQuery();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                java.sql.Timestamp fecha = rs.getTimestamp("fecha");

                System.out.printf("Nombre: %s, Descripción: %s, Fecha: %s%n",
                        nombre, descripcion, fecha.toLocalDateTime().format(formatter));
            }
        }
    }
}