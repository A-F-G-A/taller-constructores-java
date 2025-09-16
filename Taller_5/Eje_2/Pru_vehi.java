
public class Pru_vehi {
    public static void main(String[] args) {
        // Vehiculo v = new Vehiculo("Automóvil"); // Error: Vehiculo no es accesible
        Motos m = new Motos ("Deportiva", 1000);
        // System.out.println(m.tipo); // Error: tipo tiene acceso de paquete
        System.out.println("Cilindrada: " + m.cilindrada); // OK: es público
    }
}