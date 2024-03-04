package UF4.Persona;

public class Main {
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante("dam", "prat", "prat", 2);
        Estudiante estu2 = new Estudiante("j3k4", "joauqin", 10);

        System.out.println(estu1.getNom());
        System.out.println(estu2.getNom());
    }
}
