package dao;

import dto.Habitacion;
import conexionbd.ConexionBaseDeDatos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HabitacionDAO {
    public void insertar(Habitacion habitacion) {
        String sql = "INSERT INTO Habitacion (numero, tipo, precio) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, habitacion.getNumero());
            stmt.setString(2, habitacion.getTipo());
            stmt.setDouble(3, habitacion.getPrecio());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(" Error al insertar habitación: " + e.getMessage());
        }
    }

    public List<Habitacion> obtenerTodas() {
        List<Habitacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Habitacion";

        try (Connection conn = ConexionBaseDeDatos.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setId(rs.getInt("id_habitacion"));
                h.setNumero(rs.getInt("numero"));
                h.setTipo(rs.getString("tipo"));
                h.setPrecio(rs.getDouble("precio"));
                lista.add(h);
            }

        } catch (SQLException e) {
            System.out.println(" Error al listar habitaciones: " + e.getMessage());
        }
        return lista;
    }
}


