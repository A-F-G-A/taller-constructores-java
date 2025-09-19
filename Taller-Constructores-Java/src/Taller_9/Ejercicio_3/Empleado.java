package Taller_9.Ejercicio_3;
public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    public void mostrar() {
        // 'nombre' es privado en Persona, no se puede acceder con super
        // System.out.println("Nombre: " + super.nombre);
        System.out.println("Departamento: " + departamento);
    }
}
/* super sirve para reutilizar constructores y métodos de la clase base.

 No funciona fuera de la herencia.

 No puede acceder a atributos private. */