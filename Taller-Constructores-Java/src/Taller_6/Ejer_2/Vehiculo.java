package Taller_6.Ejer_2;
class Vehiculo {
    protected String Tipo;
    protected String Marca;

    public Vehiculo(String Tipo, String Marca) {
        this.Tipo = Tipo;
        this.Marca = Marca;
    }

    protected void MostrarDatos() {
        System.out.println("Tipo: " + Tipo + " | Marca: " + Marca);
    }
}