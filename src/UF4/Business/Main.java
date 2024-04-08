package UF4.Business;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Avril Aroldo", "Calle 123", 80000, "Manager", 4, "Excellent");
        Developer developer = new Developer("Iver Dipali", "Calle 456", 72000, "Developer", "Java", "Good");
        Programmer programmer = new Programmer("Yaron Gabriel", "Calle 789", 76000, "Programmer", "Excellent");

        System.out.println("Manager's bonus: " + manager.calculateBonus());
        System.out.println("Developer's bonus: " + developer.calculateBonus());
        System.out.println("Programmer's bonus: " + programmer.calculateBonus());

        System.out.println(manager.generateReport());
        System.out.println(developer.generateReport());
        System.out.println(programmer.generateReport());

        manager.manageProject();
        developer.writeCode();
        programmer.debug();
    }
}
