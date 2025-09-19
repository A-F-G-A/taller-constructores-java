package  Taller_2;
public class Producto {
    private String Nombre;
    private double Precio;

    public Producto(String Nombre, double Precio){
        this.Nombre=Nombre;
        this.Precio=Precio;
    }
    public void MostrarProducto(){
        System.out.println("Producto: "+ this.Nombre + " , Precio: $ " + this.Precio);

    }
    public static void main(String[] args) {
        Producto P_1= new Producto("Xbox one", 1000000);
        P_1.MostrarProducto();
    }


    
}