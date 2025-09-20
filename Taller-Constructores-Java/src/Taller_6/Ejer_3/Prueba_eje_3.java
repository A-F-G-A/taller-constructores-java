package Taller_6.Ejer_3;
public class Prueba_eje_3 {
    public static void main(String[] args) {
        Banco_solu b = new Banco_solu(5000);

        // b.saldo = 999999;  Error, no se puede acceder porque es private
        System.out.println("Saldo inicial: " + b.getSaldo());

        b.depositar(2000);
        b.retirar(1000);
        b.retirar(7000); // prueba de control de seguridad
    }
}
