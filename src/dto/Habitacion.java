package dto;

public class Habitacion {
    private int id;
    private int numero;
    private String tipo;
    private double precio;

    public Habitacion() {}

    public Habitacion(int id, int numero, String tipo, double precio) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getId() { 
    	return id; }
    
    public void setId(int id) { 
    	this.id = id; }

    public int getNumero() { 
    	return numero; }
    
    public void setNumero(int numero) { 
    	this.numero = numero; }

    public String getTipo() { 
    	return tipo; }
    
    public void setTipo(String tipo) { 
    	this.tipo = tipo; }

    public double getPrecio() { 
    	return precio; }
    
    public void setPrecio(double precio) { 
    	this.precio = precio; }
}
