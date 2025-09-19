package  Taller_1;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Libro
        System.out.println("\n*****************************************");
        System.out.println("Ingrese el titulo del libro: ");
        String Titulo = teclado.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String Autor = teclado.nextLine();
        System.out.println("Ingrese la cantidad de paginas: ");
        int Numero_Paginas = teclado.nextInt();
        teclado.nextLine(); // limpiar buffer

        Libro libro = new Libro(Titulo, Autor, Numero_Paginas);

        // Cuenta bancaria
        System.out.println("\n*****************************************");
        System.out.println("Ingrese el numero de cuenta:  ");
        int num = teclado.nextInt();
        System.out.println("Ingrese el saldo: ");
        double saldo = teclado.nextDouble();
        teclado.nextLine(); // limpiar buffer
        System.out.println("Ingrese el tipo de cuenta: ");
        String tipo = teclado.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(num, saldo, tipo);

        // Estudiante
        
        System.out.println("\n*****************************************");
        System.out.println("Ingrese el nombre del estudiante:  ");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine(); // limpiar buffer

        System.out.println("Ingrese el curso: ");
        String Curso = teclado.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, Curso);
        

        // Mostrar resultados
        System.out.println("\n*****************************************");
        System.out.println("\n**************** RESULTADOS ***********");
        System.out.println("Libro:");
        
        
        System.out.println("\nCuenta Bancaria:");
     
        System.out.println("\nEstudiante:");
       
    }
}

