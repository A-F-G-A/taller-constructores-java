import java.util.Scanner;


public class Libro {
    String Titulo,Autor;
    int Numero_Paginas;

    //Constructor por defecto

    public Libro(){
        this.Titulo="Sin titulo";
        this.Autor="Desconocido";
        this.Numero_Paginas= 0;


    }


    //constructor parametrizado


    public Libro(String Titulo, String Autor, int Numero_Paginas){
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.Numero_Paginas=Numero_Paginas;


    }
    // Para mostrar los detalles
    public void MostrarDetalles(){
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Numero de paginas: " + Numero_Paginas);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro: ");
        String Titulo= teclado.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String Autor= teclado.nextLine();
        System.out.println("Ingrese el numero del libro: ");
        int Numero_Paginas= teclado.nextInt();

        //creamos un objeto usando constructores parametrizado
        Libro Libro1 = new Libro(Titulo,Autor,Numero_Paginas);
        //Creamos un objeto constructor por defecto
        Libro Libro2 = new Libro();

        System.out.println("\nDetalles del libro: ");
        Libro1.MostrarDetalles();
        System.out.println("\nDetalles del por defecto:");
        Libro2.MostrarDetalles();






    }

}