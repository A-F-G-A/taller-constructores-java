public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); // Llama al constructor de Vehiculo
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
