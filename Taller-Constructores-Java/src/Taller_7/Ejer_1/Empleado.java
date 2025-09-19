package Taller_7.Ejer_1;
public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // uso del setter para validar
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser positivo.");
        }
    }

   
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Salario: " + salario);
    }
}
