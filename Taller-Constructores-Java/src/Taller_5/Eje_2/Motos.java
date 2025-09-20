package Taller_5.Eje_2;
public class Motos extends Vehiculo {
    public int cilindrada;

    public Motos(String tipo, int cilindrada) {
        super(tipo); // funciona porque Motos hereda de Vehiculo
        this.cilindrada = cilindrada;
        
    }
}
