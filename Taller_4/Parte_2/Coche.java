public class Coche {
    private String Marca;
    private String Modelo;
    private double V_Maxima;

    public Coche(String  Marca, String Modelo, double V_Maxima) {
        this.Marca =  Marca;
        this.Modelo = Modelo;
        this.V_Maxima = V_Maxima;
    }

    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public double getV_Maxima() {
        return V_Maxima;
    }

    public void Acelerar(double incremento) {
        if (incremento > 0) {
            V_Maxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}
