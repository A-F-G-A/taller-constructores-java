public class Gerente extends Empleado {
    private String departamento;

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);  // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void MostrarDetalles() {
        System.out.println("Gerente: " + nombre + ", Salario: " + salario + ", Departamento: " + departamento);
    }
}
