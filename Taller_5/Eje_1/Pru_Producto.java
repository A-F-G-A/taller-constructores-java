// Pru_Producto.java  (sin package)
public class Pru_Producto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Camiseta", 29.99, 50);
        Producto p2 = new Producto("Pantalón", 49.99, 30);

        p1.mostrarInfo();
        System.out.println("-----");
        p2.mostrarInfo();
    }
}
