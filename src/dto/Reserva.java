package dto;

import java.sql.Date;

public class Reserva {
    private int id;
    private int idCliente;
    private int idHabitacion;
    private Date fechaEntrada;
    private Date fechaSalida;

    public Reserva() {}

    public Reserva(int id, int idCliente, int idHabitacion, Date fechaEntrada, Date fechaSalida) {
        this.id = id;
        this.idCliente = idCliente;
        this.idHabitacion = idHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getId() { 
    	return id; }
    
    public void setId(int id) { 
    	this.id = id; }

    public int getIdCliente() { 
    	return idCliente; }
    
    public void setIdCliente(int idCliente) { 
    	this.idCliente = idCliente; }

    public int getIdHabitacion() { 
    	return idHabitacion; }
    
    public void setIdHabitacion(int idHabitacion) { 
    	this.idHabitacion = idHabitacion; }

    public Date getFechaEntrada() { 
    	return fechaEntrada; }
    
    public void setFechaEntrada(Date fechaEntrada) { 
    	this.fechaEntrada = fechaEntrada; }

    public Date getFechaSalida() { 
    	return fechaSalida; }
    
    public void setFechaSalida(Date fechaSalida) { 
    	this.fechaSalida = fechaSalida; }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", idCliente=" + idCliente + ", idHabitacion=" + idHabitacion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + '}';
    }
}


