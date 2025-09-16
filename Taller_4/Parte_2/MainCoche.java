public class MainCoche {
    public static void main(String[] args) {
        Coche C_1 = new Coche("Toyota", "Hylux", 170);
        C_1.Acelerar(20);

        System.out.println("Marca: " + C_1.getMarca());
        System.out.println("Modelo: " + C_1.getModelo());
        System.out.println("Velocidad Máxima: " + C_1.getV_Maxima());
    }
}
