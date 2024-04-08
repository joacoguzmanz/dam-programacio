package UF4.Business;

public class Manager extends Employee {
    private int qtyEmployees;

    public Manager(int qtyEmployees) {
        this.qtyEmployees = qtyEmployees;
    }

    public Manager(String name, String address, int salary, String position, int qtyEmployees, String report) {
        super(name, address, salary, position, report);
        this.qtyEmployees = qtyEmployees;
    }

    public int getQtyEmployees() {
        return qtyEmployees;
    }

    public void setQtyEmployees(int qtyEmployees) {
        this.qtyEmployees = qtyEmployees;
    }

    public void manageProject() {
        System.out.println("Manager " + this.getName() + " is managing a project.");
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * .15;
    }

    @Override
    public String generateReport() {
        return "Performance report for Manager " + this.getName() + ": " + this.getReport();
    }
}
