import java.util.Scanner;


public class Estudiante{
    String Nombre, Curso;
    int Edad;

    //Constructor por defecto

    public Estudiante(){
        this.Nombre= "Sin nombre";
        this.Edad= 0;
        this.Curso="Ninguno";


    }


    // Constructor con 2 parametros
    public Estudiante(String Nombre, int Edad){
        this.Nombre= Nombre;
        this.Edad=  Edad;
        this.Curso=" Ninguno";


    }
     // Constructor con 3 parametros usando this()
    public Estudiante(String Nombre, int Edad, String Curso){
        this(Nombre, Edad);
        this.Curso=Curso;

    }
    // Para mostrar los detalles
    public void MostrarDetalles(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Curso: " + Curso);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:  ");
        String nombre = teclado. nextLine();

        System.out.println("Ingrese la edad: ");
        int edad= teclado.nextInt();
        teclado.nextLine();// Limpiamos el buffer

        System.out.println("Ingrese el curso: ");
        String Curso= teclado. nextLine();

        Estudiante Estudiante1 = new Estudiante(nombre,edad,Curso);
        Estudiante Estudiante2 = new Estudiante();



        System.out.println("\nEstudiante con datos ingresados: ");
        Estudiante1.MostrarDetalles();

        System.out.println("\nEstudiante con constructor por defecto: ");
        Estudiante2.MostrarDetalles();






    }

}