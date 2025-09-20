package Taller_10.Ejercicio_1;
class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }

    public void mostrarNombre() {
        
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNombre'");
    }
}

class estudiante extends Persona {
  
    

    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }

    public void MostrarDetalles() {
       
        throw new UnsupportedOperationException("Unimplemented method 'MostrarDetalles'");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}

public class MainEj1 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new estudiante(); // Polimorfismo
        Persona p3 = new Profesor();   // Polimorfismo

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}
