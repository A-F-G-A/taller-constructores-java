class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
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
        Persona p2 = new Estudiante(); // Polimorfismo
        Persona p3 = new Profesor();   // Polimorfismo

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}
