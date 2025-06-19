package dao;

import dto.Cliente;
import conexionbd.ConexionBaseDeDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public void insertar(Cliente cliente) {
        String sql = "INSERT INTO Cliente (nombre, email) VALUES (?, ?)";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getEmail());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(" Error al insertar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> obtenerTodos() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";

        try (Connection conn = ConexionBaseDeDatos.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setEmail(rs.getString("email"));
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println(" Error al listar clientes: " + e.getMessage());
        }
        return lista;
    }
}

