import java.util.Scanner;


public class CuentaBancaria {
    int numero_Cuenta;
    double saldo;
    String tipo_Cuenta;

    //Constructor por defecto

    public CuentaBancaria(){
        this.numero_Cuenta=0;
        this.saldo= 0.0;
        this.tipo_Cuenta = " Ahorros ";


    }


    //constructor parametrizado


    public CuentaBancaria(int numero_Cuenta, String tipo_Cuenta){
        this.numero_Cuenta=numero_Cuenta;
        this.saldo= 0.0;
        this.tipo_Cuenta = tipo_Cuenta;


    }
    public CuentaBancaria(int numero_Cuenta, double saldo, String tipo_Cuenta){
        this.numero_Cuenta=numero_Cuenta;
        this.saldo= saldo;
        this.tipo_Cuenta= tipo_Cuenta;
        


    }
    // Para mostrar los detalles
    public void MostrarDetalles(){
        System.out.println("Numero de cuenta: " + numero_Cuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipo_Cuenta);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese numero de cuenta:  ");
        int num = teclado.nextInt();

        System.out.println("Ingrese el saldo inicial: ");
        double saldo = teclado.nextDouble();
        teclado.nextLine();// Limpiamos el buffer

        System.out.println("Ingrese el tipo de cuenta: ");
        String tipo=teclado.nextLine();

        CuentaBancaria cuenta1 = new CuentaBancaria(num,tipo);
        CuentaBancaria cuenta2 = new CuentaBancaria(num,saldo,tipo);



        System.out.println("\nCuenta creada con 2 parametros: ");
        cuenta1.MostrarDetalles();

        System.out.println("\nCuenta creada con 3 parametros: ");
        cuenta2.MostrarDetalles();






    }

}