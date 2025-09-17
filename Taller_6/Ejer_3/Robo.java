public class Robo extends Banco {
    public Robo(double saldo) {
        super(saldo);
    }

    public void robar() {
        this.saldo = 9999999; // 😱 Puede alterar el saldo sin restricciones
    }
}
