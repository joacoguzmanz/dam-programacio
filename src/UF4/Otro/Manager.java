package UF4.Otro;

public class Manager extends Employee{
    int numTrabajadores;


    // Constructor
    public Manager() {}
    public Manager(String nombre, String direccion, double salario, String puestoTrabajo, int numTrabajadores) {
        super(nombre, direccion, salario, puestoTrabajo);
        this.numTrabajadores = numTrabajadores;
    }

    // Getters Setters
    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }
    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    //Funciones
    public void gestionProyecto()
    {
        System.out.println("Manager " + nombre + " is managing a project");
    }

    @Override
    public double calcularBonus() {
        return salario * 15 / 100;
    }
    @Override
    public String generarReport(){
        String report = "Performance report for Manager " + nombre + ": Excellent";
        return report;
    }
}
