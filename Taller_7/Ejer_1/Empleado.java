public class Empleado {
    public String Nombre;   // Público
    private double Salario; // Privado con encapsulación

    public Empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        setSalario(Salario); // Uso de set para validar
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        if (Salario > 0) {
            this.Salario = Salario;
        } else {
            System.out.println("El salario debe ser positivo.");
        }
    }

    public void MostrarInformacion() {
        System.out.println("Empleado: " + Nombre + ", Salario: " + Salario);
    }
}

