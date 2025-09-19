package Taller_6.Ejer_2;
class Main2 {
    public static void main(String[] args) {
        Moto M1 = new Moto("Deportiva", "Yamaha", 600);
        M1.MostrarDatos();

        // Acceso desde clase no relacionada (error si lo intentas descomentar)
        // System.out.println(M1.Tipo); // Esto causa error de compilación
    }
}
// Para probar