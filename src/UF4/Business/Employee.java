package UF4.Business;

public class Employee {
    private String name;
    private String address;
    private int salary;
    private String position;
    private String report;

    public Employee() {

    }

    public Employee(String name, String address, int salary, String position, String report) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
        this.report = report;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public double calculateBonus() {
        return salary;
    }

    public String generateReport() {
        return "hello";
    }
}
