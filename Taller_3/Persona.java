public class Persona {
    private String Nombre;

    // Un método static no puede acceder a un atributo de instancia
    public static void MostrarNombre() {
        System.out.println("Nombre: " + Nombre); 
    }

    //Version incorrecta del ejercicio
}

