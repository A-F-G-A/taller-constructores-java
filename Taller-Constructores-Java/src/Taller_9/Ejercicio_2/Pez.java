package Taller_9.Ejercicio_2;
public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Invoca al constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void MostrarEspecie() {
        super.MostrarEspecie(); // Llama al método de la clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
