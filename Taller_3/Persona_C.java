public class Persona_C {
    private String Nombre;

    public Persona_C(String Nombre) {
        this.Nombre = Nombre;
    }

    // Método static que recibe un objeto Persona
    public static void MostrarNombre(Persona_C p) {
        System.out.println("Nombre: " + p.Nombre);
    }
}

class MainPersona {
    public static void main(String[] args) {
        Persona_C Persona1 = new Persona_C("Nayibe");
        Persona_C.MostrarNombre(Persona1); // Se llama el metodo
    }
}
//Aqui mantenemos el metodo static