public class Pru_Empleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos", 2000);
        e1.MostrarInformacion();

        e1.setSalario(-500); // No lo permite
        e1.setSalario(2500); // Actualiza
        e1.MostrarInformacion();
    }
}
