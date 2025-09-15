

public class Estudiante{
    private String Nombre;
    private int Edad;
    private double Nota_P;

 
    public Estudiante(String Nombre, int Edad, double Nota_P){
        this.Nombre= Nombre;
        this.Edad=Edad;
        this.Nota_P=Nota_P;
        setedad(Edad); // Esta sera nuetra validacion
        setNota_P(Nota_P);


    }
    
    // Getter y Setter de nombre
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    // Getter y Setter para la edad
    public int getedad(){
        return Edad;
    }
    public void setedad(int Edad){
        if(Edad >= 0){
            this.Edad= Edad;
        }else {
        System.out.println("La edad No puede ser negativa!!!!!!!!!!");
        } 

    }
        // Getter y Setter para la  nota promedio 
     public double getNota_P() {
        return Nota_P;
    }
    public void setNota_P(double Nota_P) {
        if (Nota_P >= 0 && Nota_P <= 5) {
            this.Nota_P = Nota_P;
        } else {
            System.out.println("La nota debe estar entre 0 y 5.");
        }
    }   







}