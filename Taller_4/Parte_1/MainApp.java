public class MainApp {
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Andrés", 22,4.5);
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getedad());
        System.out.println("Nota promedio: " + estudiante1.getNota_P());

        estudiante1.setNota_P(4.8);
    }
     
}