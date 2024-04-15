package UF4.Marco;

public class Developer extends Employee {
	private String lenguajeProgramacion;

	// dirección innecesaria porque no se usa
	// agrego report atributo
	/*
	public Developer(String lenguajeProgramacion, String nombre, String direccion, double salario, String puestoTrabajo) {
		super(nombre, direccion, salario, puestoTrabajo);
		this.lenguajeProgramacion = lenguajeProgramacion;
	}
	*/
	public Developer(String lenguajeProgramacion, String nombre, double salario, String puestoTrabajo, String report) {
		super(nombre, salario, puestoTrabajo, report);
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	public String getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}

	public void setLenguajeProgramacion(String lenguajeProgramacion) {
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	public void escribirCodigo() {
		System.out.println(getPuestoTrabajo() + " " + getNombre() + " is writing code in " + getLenguajeProgramacion() + ".");
	}
}