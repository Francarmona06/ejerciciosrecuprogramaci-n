package ejerciciosrecuperacionjunionivel4y5;

public class Alumno {
 String nombre;
 double nota;
public Alumno(String nombre, double nota) {
	super();
	this.nombre = nombre;
	this.nota = nota;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}
@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
}}
 
 