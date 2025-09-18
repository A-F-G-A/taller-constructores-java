public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Invoca al constructor de Persona
        this.departamento = departamento;
    }

    @Override
    public void MostrarDetalles() {
        super.MostrarDetalles(); // Llama al método de la clase 
        System.out.println("Departamento: " + departamento);
    }
}
