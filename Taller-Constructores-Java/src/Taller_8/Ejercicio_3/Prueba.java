package Taller_8.Ejercicio_3;
public class Prueba{
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Carlos", 2500);
        Gerente ger1 = new Gerente("Ana", 5000, "Recursos Humanos");

        // Uso de métodos
        emp1.MostrarDetalles();  
        ger1.MostrarDetalles();
    }
}
