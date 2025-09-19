package Taller_6.Ejer_2;
class Moto extends Vehiculo {
    private int Cilindrada;

    public Moto(String Tipo, String Marca, int Cilindrada) {
        super(Tipo, Marca);
        this.Cilindrada = Cilindrada;
    }

    
    protected void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("Cilindrada: " + Cilindrada + " cc");
    }
}
