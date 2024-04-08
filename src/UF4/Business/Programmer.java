package UF4.Business;

public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, String address, int salary, String position, String report) {
        super(name, address, salary, position, report);
    }

    public void debug() {
        System.out.println("Programmer " + this.getName() + " is debugging code in Python.");
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * .12;
    }

    @Override
    public String generateReport() {
        return "Performance report for Programmer " + this.getName() + ": " + this.getReport();
    }
}
