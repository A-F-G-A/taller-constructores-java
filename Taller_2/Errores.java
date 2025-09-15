public class Errores {
    private String mensaje = "Hola desde this";

    //  Método incorrecto
    public static void MetodoIncorrecto() {
        // System.out.println(this.mensaje); // Mandara error
    }

    //  Método corregido
    public void MetodoCorrecto() {
        System.out.println(this.mensaje);
    }

    public static void main(String[] args) {
        Errores Prueba_C = new Errores();
        Prueba_C.MetodoCorrecto();
    }
}
