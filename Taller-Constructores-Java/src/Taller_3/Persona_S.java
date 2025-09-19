package  Taller_3;
public class Persona_S {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Ahora es un método normal 
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana");
        p1.mostrarNombre(); // Esta es la version  que funciona correctamente quitando el static
    }
}
