package Taller_7.Ejer_2;
public class Cuenta_Bancaria {
    private String NumeroCuenta;  // Privado
    private double Saldo;         // Privado
    public String TipoCuenta;     // Público

    public Cuenta_Bancaria(String NumeroCuenta, double Saldo, String TipoCuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.TipoCuenta = TipoCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        if (Saldo >= 0) {
            this.Saldo = Saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + NumeroCuenta + ", Tipo: " + TipoCuenta + ", Saldo: " + Saldo);
    }
}

