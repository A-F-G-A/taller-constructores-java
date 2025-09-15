public class Matematicas {

    public static int Sumar(int a, int b) {
        return a + b;
    }

    public static int Restar(int a, int b) {
        return a - b;
    }

    public static int Multiplicar(int a, int b) {
        return a * b;
    }

    public static double Dividir (double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir  por cero.");
            return 0;
        }
        return a / b;
    }
}

class MainMatematicas {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.Sumar(26, 8));
        System.out.println("Resta: " + Matematicas.Restar(26, 8));
        System.out.println("Multiplicación: " + Matematicas.Multiplicar(26, 8));
        System.out.println("División: " + Matematicas. Dividir (26, 8));
        System.out.println("División por cero: " + Matematicas.Dividir(26, 0));
    }
}
