package UF4.Marco;

public class Main {
	public static void main(String[] args) {
		Main programa = new Main();
		programa.inici();
	}

	public void inici() {
		// Manager manager = new Manager(10, "Avril Aroldo", "Barcelona", 80000, "Manager");
		Manager manager = new Manager(10, "Avril Aroldo", 80000, "Manager", "Excellent");
		// double porcentaje = 0.15; línea innecesaria
		double bonus = manager.calcularBonus(0.15);
		System.out.println("Manager's Bonus: $" + bonus);

		// Developer developer = new Developer("Java", "Iver Dipali", "Barcelona", 72000, "Developer");
		Developer developer = new Developer("Java", "Iver Dipali", 72000, "Developer", "Good");
		// porcentaje = 0.10; línea innecesaria
		bonus = developer.calcularBonus(0.10);
		System.out.println("Developer's Bonus: $" + bonus);

		// Programmer programmer = new Programmer("Yaron Gabriel", "Barcelona", 76000, "Programmer");
		Programmer programmer = new Programmer("Yaron Gabriel", 76000, "Programmer", "Excellent");
		// porcentaje = 0.12; línea innecesaria
		bonus = programmer.calcularBonus(0.12);
		System.out.println("Programmer's Bonus: $" + bonus);

		// Lista para evitar repetición de System Out del report
		Employee[] employees = {manager, developer, programmer};
		for (Employee employee : employees) {
			System.out.println(employee.generarReport());
		}

		// String report = manager.generarReport();
		// System.out.println(report);
		// report = developer.generarReport();
		// System.out.println(report);
		// report = programmer.generarReport();
		// System.out.println(report);

		manager.gestionProyecto();
		developer.escribirCodigo();
		programmer.debug();
	}
}