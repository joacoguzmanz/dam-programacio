package UF4.Marco;

public class Programmer extends Employee {

	// Corregir dirección
	// agrego report atributo
	/*
	public Programmer(String nombre, String direccion, double salario, String puestoTrabajo) {
		super(nombre, direccion, salario, puestoTrabajo);
	}
	*/
	public Programmer(String nombre, double salario, String puestoTrabajo, String report) {
		super(nombre, salario, puestoTrabajo, report);
	}

	public void debug() {
		System.out.println(getPuestoTrabajo() + " " + getNombre() + " is debugging code in Python.");
	}
}