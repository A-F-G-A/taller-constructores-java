package  Taller_2;
public class Estudiante {
    private String Nombre;
    private int Edad;

    // Constructor por defecto
    public Estudiante() {
        this("Sin nombre", 0); // Se llama al constructor con parámetros
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public void MostrarEstudiante() {
        System.out.println("Estudiante: " + this.Nombre + ", Edad: " + this.Edad);
    }

    public static void main(String[] args) {
        Estudiante Estudiante1 = new Estudiante();
        Estudiante Estudiante2 = new Estudiante("Andrés", 22);

        Estudiante1.MostrarEstudiante();
        Estudiante2.MostrarEstudiante();
    }
}
