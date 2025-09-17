public class Pru_vehi {
    public static void main(String[] args) {
        // Vehiculo v = new Vehiculo("Automóvil"); 
        //  Da error si Vehiculo no es public al compilar desde otro archivo

        Motos m = new Motos("Deportiva", 1000);

        // System.out.println(m.tipo);  
        //  Error: "tipo" es de acceso por defecto (no es public)

        System.out.println("Cilindrada: " + m.cilindrada); //  es public
    }
}
