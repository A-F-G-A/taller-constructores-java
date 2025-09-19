package Taller_5.Eje_1;
public class Pru_Producto {
    public static void main(String[] args) {
        Producto P_1 = new Producto("Camiseta", 29.99, 50);
        Producto P_2 = new Producto("Pantalón", 49.99, 30);

        P_1.mostrarInfo();
        System.out.println("-----");
        P_2.mostrarInfo();
    }
}
