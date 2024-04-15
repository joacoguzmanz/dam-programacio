package UF4.Marco;

public class Manager extends Employee {
	private int numTrabajadores;

	// Direcciones idem developer
	// agrego report atributo
	/*
	public Manager(int numTrabajadores, String nombre, String direccion, double salario, String puestoTrabajo) {
		super(nombre, direccion, salario, puestoTrabajo);
		this.numTrabajadores = numTrabajadores;
	}
	*/
	public Manager(int numTrabajadores, String nombre, double salario, String puestoTrabajo, String report) {
		super(nombre, salario, puestoTrabajo, report);
		this.numTrabajadores = numTrabajadores;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public void gestionProyecto() {
		System.out.println(getPuestoTrabajo() + " " + getNombre() + " is managing a project.");
	}
}