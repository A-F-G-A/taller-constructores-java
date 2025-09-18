class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La bicicleta avanza pedaleando.");
    }
}

public class MainEj2 {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Bicicleta(); // Polimorfismo

        v1.moverse();
        v2.moverse();
    }
}
