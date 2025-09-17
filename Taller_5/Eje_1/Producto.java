class Producto {
    String Dombre;    
    double Precio;    // acceso default
    int stock;       

    Producto(String Dombre, double Precio, int stock) {
        this.Dombre = Dombre;
        this.Precio = Precio;
        this.stock = stock;
    }

    void mostrarInfo() { // método default
        System.out.println("Producto: " + Dombre);
        System.out.println("Precio: $" + Precio);
        System.out.println("stock disponible: " + stock);
    }
}
