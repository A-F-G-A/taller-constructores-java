public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llama al constructor de Persona
        this.matricula = matricula;
    }

   
    public void MostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Matrícula: " + matricula);
    }
}
