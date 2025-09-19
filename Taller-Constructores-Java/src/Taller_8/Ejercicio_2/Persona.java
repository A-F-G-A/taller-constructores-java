package Taller_8.Ejercicio_2;
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void MostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}