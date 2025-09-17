
public class Pru_Cuenta {
    public static void main(String[] args) {
        Cuenta_Bancaria c1 = new Cuenta_Bancaria("12345", 1000, "Ahorros");
        c1.mostrarDetalles();

        c1.setSaldo(1500);
        c1.mostrarDetalles();

        // System.out.println(c1.NumeroCuenta); // Error: es privado
    }
}
