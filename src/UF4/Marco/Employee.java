package UF4.Marco;

public class Employee {
	private String nombre;
	private String direccion;
	private double salario;
	private String puestoTrabajo;
	private String report; // Atributo para generar el report

	// No es necesario el atributo dirección
	/*
	public Employee(String nombre, String direccion, double salario, String puestoTrabajo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.salario = salario;
		this.puestoTrabajo = puestoTrabajo;
	}
	*/
	public Employee(String nombre, double salario, String puestoTrabajo, String report) {
		this.nombre = nombre;
		this.salario = salario;
		this.puestoTrabajo = puestoTrabajo;
		this.report = report;
	}

	public Employee() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}

	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}

	// Getters y Setters de report
	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public double calcularBonus(double porcentaje) {
		return getSalario() * porcentaje;
	}

	public String generarReport() {
		return "Performance report for " + getPuestoTrabajo() + " " + getNombre() + " : " + getReport();
	}
}