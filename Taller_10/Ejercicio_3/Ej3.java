class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Vaca extends Animal {
    //  Error de compilación → diferente firma
    // @Override
    public void hacerSonido(String tipo) {
        System.out.println("La vaca hace: " + tipo);
    }
}

class Gato extends Animal {
    //  Compila, pero mala práctica (sin @Override)
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}
