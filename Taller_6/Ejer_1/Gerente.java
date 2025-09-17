// Subclase Gerente
class Gerente extends Empleado {
    private String Departamento;

    public Gerente(String Nombre, double Salario, String Departamento) {
        super(Nombre, Salario);
        this.Departamento = Departamento;
    }

   
    protected void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Departamento: " + Departamento);
    }
}

