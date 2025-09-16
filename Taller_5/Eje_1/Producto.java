// Producto.java  (sin package)
class Producto {
    String nombre;    // acceso default
    double precio;    // acceso default
    int stock;        // acceso default

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() { // método default
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
    }
}
