public class Coche {
    private String m;
    private String modelo;
    // Atributo estático compartido entre todas las instancias
    private static int contadorCoches = 0;

    // Constructor
    public Coche(String m, String modelo) {
        this.m = m;
        this.modelo = modelo;
        contadorCoches++; // Cada vez que se crea un coche, aumenta el contador
    }

    // Método estático para mostrar cuántos coches hay
    public static void mostrarContador() {
        System.out.println("Número total de coches creados: " + contadorCoches);
    }

    // Método para mostrar la información de un coche
    public void mostrarDetalles() {
        System.out.println("m: " + m + " | Modelo: " + modelo);
    }
}

class MainCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "CX-5");
        Coche c3 = new Coche("Chevrolet", "Onix");

        c1.mostrarDetalles();
        c2.mostrarDetalles();
        c3.mostrarDetalles();

        // Se llama al método estático desde la clase
        Coche.mostrarContador();
    }
}
