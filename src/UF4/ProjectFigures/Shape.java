package UF4.ProjectFigures;

public class Shape {
    private int id;
    private String name;

    public Shape() {

    }

    public Shape(int id) {
        this.id = id;
    }

    public Shape(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showData() {
        System.out.println("Shape name is " + this.name);
        System.out.println("Shape ID is " + this.id);
    }

    public double calculateArea() {
        return 4;
    }

    public void readData() {

    }
}
