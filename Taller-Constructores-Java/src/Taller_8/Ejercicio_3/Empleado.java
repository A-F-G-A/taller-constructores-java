package Taller_8.Ejercicio_3;
public class Empleado {
    protected String nombre;  // protegido para que las subclases lo usen
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar detalles
    public void MostrarDetalles() {
        System.out.println("Empleado: " + nombre + ", Salario: " + salario);
    }
}


