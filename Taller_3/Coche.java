public class Coche {
    private String Marca_de_Carro;
    private String Modelo_de_Carro;
    // Atributo estático compartido entre todas las instancias
    private static int Contador_C = 0;

    // Constructor
    public Coche(String Marca_de_Carro, String Modelo_de_Carro) {
        this.Marca_de_Carro = Modelo_de_Carro;
        this.Modelo_de_Carro=Modelo_de_Carro;
        Contador_C++; // Aumenta con cada coche nuevo
    }

    // Muestra cuantos carros nuevos hay
    public static void Mostrar_Contador() {
        System.out.println("Número total de coches creados: " + Contador_C);
    }

    // Información del coche 
    public void Mostrar_Detalles() {
        System.out.println("Marca_de_Carro: " + Marca_de_Carro + " | Modelo: " + Modelo_de_Carro);
    }
}

class MainCoche {
    public static void main(String[] args) {
        Coche Carro_1 = new Coche("Toyota", "Hylux");
        Coche Carro_2 = new Coche("Audi", "A3 Sportback");
        Coche Carro_3 = new Coche("Volkswagen", "Jetta");

        Carro_1.Mostrar_Detalles();
        Carro_2.Mostrar_Detalles();
        Carro_3.Mostrar_Detalles();

        // Se llama al método estático desde la clase
        Coche.Mostrar_Contador();
    }
}
