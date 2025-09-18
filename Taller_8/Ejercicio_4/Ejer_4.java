// Ejemplo incorrecto (Java NO soporta herencia múltiple):
class ClaseA {
    int a;
}

class ClaseB {
    int b;
}

//  Error: no se puede heredar de dos clases
// class ClaseC extends ClaseA, ClaseB {}

// Ejemplo de acceso a atributo privado
class Base {
    private int dato = 100;
}

class Derivada extends Base {
    public void mostrar() {
        //  Error: no se puede acceder a "dato" porque es private
        // System.out.println(dato);
    }
}
/*Herencia múltiple no soportada en 
Java  solo se puede heredar de una 
clase, pero sí se pueden implementar múltiples interfaces.

Atributos privados no son accesibles 
en la clase hija  solo son visibles dentro 
de la clase en la que se declaran. 
Para acceder, se deben usar getters y setters.*/