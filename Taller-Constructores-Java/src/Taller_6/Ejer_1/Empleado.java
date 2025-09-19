package Taller_6.Ejer_1;
// Clase base 
class Empleado {
    protected String Nombre;
    protected double Salario;

    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    protected void MostrarInformacion() {
        System.out.println("Empleado: " + Nombre + " | Salario: $" + Salario);
    }
}

