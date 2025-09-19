package Taller_5.Eje_3;
public class Pru_Persona {
    public static void main(String[] args) {
        Persona p = new Persona("Andrés", 21);

        // Acceso al atributo default (edad) directamente
        System.out.println("Edad (acceso directo): " + p.edad);

        // Acceso al atributo private (nombre) mediante métodos públicos
        System.out.println("Nombre via get(): " + p.getNombre());
        p.setNombre("Felipe");
        System.out.println("Nombre actualizado: " + p.getNombre());

        // Mostrar toda la info
        p.MostrarInfo();
    }
}
