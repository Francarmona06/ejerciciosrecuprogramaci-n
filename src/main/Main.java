package main;

import conexionbd.Conexion;
import conexionbd.ConexionBaseDeDatos;
import dao.ClienteDAO;
import dao.HabitacionDAO;
import dao.ReservaDAO;
import dto.Cliente;
import dto.Habitacion;
import dto.Reserva;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conexion credenciales = new Conexion(
            "jdbc:mysql://localhost:3306/Hotel",
            "root",
            "Francarmona06" 
        );
        ConexionBaseDeDatos.conectar(credenciales);

        ClienteDAO clienteDAO = new ClienteDAO();
        HabitacionDAO habitacionDAO = new HabitacionDAO();
        ReservaDAO reservaDAO = new ReservaDAO();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Insertar habitación");
            System.out.println("3. Insertar reserva");
            System.out.println("4. Listar reservas");
            System.out.println("5. Actualizar reserva");
            System.out.println("6. Eliminar reserva");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Email del cliente: ");
                    String email = sc.nextLine();
                    Cliente c = new Cliente();
                    c.setNombre(nombre);
                    c.setEmail(email);
                    clienteDAO.insertar(c);
                    System.out.println(" Cliente insertado.");
                }
                case 2 -> {
                    System.out.print("Número de habitación: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de habitación: ");
                    String tipo = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    Habitacion h = new Habitacion();
                    h.setNumero(numero);
                    h.setTipo(tipo);
                    h.setPrecio(precio);
                    habitacionDAO.insertar(h);
                    System.out.println(" Habitación insertada.");
                }
                case 3 -> {
                    System.out.print("ID cliente: ");
                    int idCliente = sc.nextInt();
                    System.out.print("ID habitación: ");
                    int idHabitacion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Fecha entrada (YYYY-MM-DD): ");
                    Date entrada = Date.valueOf(sc.nextLine());
                    System.out.print("Fecha salida (YYYY-MM-DD): ");
                    Date salida = Date.valueOf(sc.nextLine());
                    Reserva r = new Reserva();
                    r.setIdCliente(idCliente);
                    r.setIdHabitacion(idHabitacion);
                    r.setFechaEntrada(entrada);
                    r.setFechaSalida(salida);
                    reservaDAO.insertar(r);
                    System.out.println("✅ Reserva insertada.");
                }
                case 4 -> {
                    List<Reserva> reservas = reservaDAO.obtenerTodas();
                    if (reservas.isEmpty()) {
                        System.out.println("No hay reservas registradas.");
                    } else {
                        System.out.println("\n-- LISTA DE RESERVAS --");
                        for (Reserva r : reservas) {
                            System.out.println(r);
                        }
                    }
                }
                case 5 -> {
                    System.out.print("ID de la reserva a actualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Reserva r = reservaDAO.obtenerPorId(id);
                    if (r != null) {
                        System.out.print("Nueva fecha entrada (YYYY-MM-DD): ");
                        r.setFechaEntrada(Date.valueOf(sc.nextLine()));
                        System.out.print("Nueva fecha salida (YYYY-MM-DD): ");
                        r.setFechaSalida(Date.valueOf(sc.nextLine()));
                        reservaDAO.actualizar(r);
                        System.out.println(" Reserva actualizada.");
                    } else {
                        System.out.println("Reserva no encontrada.");
                    }
                }
                case 6 -> {
                    System.out.print("ID de la reserva a eliminar: ");
                    int idEliminar = sc.nextInt();
                    reservaDAO.eliminar(idEliminar);
                    System.out.println("Reserva eliminada (si existía).");
                }
                case 0 -> System.out.println("Cerrando aplicación...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        ConexionBaseDeDatos.cerrarConexion();
        sc.close();
    }
}

