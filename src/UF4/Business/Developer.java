package UF4.Business;

public class Developer extends Employee {
    private String codeLanguage;

    public Developer(String codeLanguage) {
        this.codeLanguage = codeLanguage;
    }

    public Developer(String name, String address, int salary, String position, String codeLanguage, String report) {
        super(name, address, salary, position, report);
        this.codeLanguage = codeLanguage;
    }

    public String getCodeLanguage() {
        return codeLanguage;
    }

    public void setCodeLanguage(String codeLanguage) {
        this.codeLanguage = codeLanguage;
    }

    public void writeCode() {
        System.out.println("Developer " + this.getName() + " is writing code in " + this.getCodeLanguage());
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * .1;
    }

    @Override
    public String generateReport() {
        return "Performance report for Developer " + this.getName() + ": " + this.getReport();
    }
}
