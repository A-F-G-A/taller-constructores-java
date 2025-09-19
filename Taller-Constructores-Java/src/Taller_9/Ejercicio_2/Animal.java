package Taller_9.Ejercicio_2;
public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void MostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

