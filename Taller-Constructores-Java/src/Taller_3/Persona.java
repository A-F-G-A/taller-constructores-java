package  Taller_3;
public class Persona {

    public Persona(String ana) {
    }
    private String Nombre;

    // Un método static no puede acceder a un atributo de instancia
    public static void MostrarNombre() {
        System.out.println("Nombre: " + Nombre); 
    }

    //Version incorrecta del ejercicio

    void mostrarNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

