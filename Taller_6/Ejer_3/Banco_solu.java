public class Banco_solu {
    private double saldo; 

    public Banco_solu(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método de lectura (solo devuelve el valor, sin modificar)
    public double getSaldo() {
        return saldo;
    }

    // Método controlado para depósito
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto inválido.");
        }
    }

    // Método controlado para retiro
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}
