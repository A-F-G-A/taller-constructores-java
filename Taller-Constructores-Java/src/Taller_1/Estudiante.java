package  Taller_1;
public class Estudiante {
    private String nombre;
    private int edad;
    private String Curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.Curso = "Ninguno";
    }

    // Constructor con 2 parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.Curso = "Ninguno";
    }

    // Constructor con 3 parámetros usando this()
    public Estudiante(String nombre, int edad, String Curso) {
        this(nombre, edad); // llama al constructor de 2 parámetros
        this.Curso = Curso;
    }

    // Mostrar detalles
    public void MostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + Curso);
    }

    
    public String toString() {
        return "Estudiante [Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + Curso + "]";
    }
}
