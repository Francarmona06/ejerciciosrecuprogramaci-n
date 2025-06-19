package dao;

import dto.Reserva;
import conexionbd.ConexionBaseDeDatos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    public void insertar(Reserva reserva) {
        String sql = "INSERT INTO Reserva (id_cliente, id_habitacion, fecha_entrada, fecha_salida) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, reserva.getIdCliente());
            stmt.setInt(2, reserva.getIdHabitacion());
            stmt.setDate(3, reserva.getFechaEntrada());
            stmt.setDate(4, reserva.getFechaSalida());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(" Error al insertar reserva: " + e.getMessage());
        }
    }

    public Reserva obtenerPorId(int id) {
        String sql = "SELECT * FROM Reserva WHERE id_reserva = ?";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return construir(rs);
            }

        } catch (SQLException e) {
            System.out.println(" Error al buscar reserva: " + e.getMessage());
        }
        return null;
    }

    public List<Reserva> obtenerTodas() {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reserva";

        try (Connection conn = ConexionBaseDeDatos.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(construir(rs));
            }

        } catch (SQLException e) {
            System.out.println(" Error al listar reservas: " + e.getMessage());
        }
        return lista;
    }

    public void actualizar(Reserva reserva) {
        String sql = "UPDATE Reserva SET id_cliente = ?, id_habitacion = ?, fecha_entrada = ?, fecha_salida = ? WHERE id_reserva = ?";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, reserva.getIdCliente());
            stmt.setInt(2, reserva.getIdHabitacion());
            stmt.setDate(3, reserva.getFechaEntrada());
            stmt.setDate(4, reserva.getFechaSalida());
            stmt.setInt(5, reserva.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(" Error al actualizar reserva: " + e.getMessage());
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM Reserva WHERE id_reserva = ?";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(" Error al eliminar reserva: " + e.getMessage());
        }
    }

    private Reserva construir(ResultSet rs) throws SQLException {
        Reserva r = new Reserva();
        r.setId(rs.getInt("id_reserva"));
        r.setIdCliente(rs.getInt("id_cliente"));
        r.setIdHabitacion(rs.getInt("id_habitacion"));
        r.setFechaEntrada(rs.getDate("fecha_entrada"));
        r.setFechaSalida(rs.getDate("fecha_salida"));
        return r;
    }
}


