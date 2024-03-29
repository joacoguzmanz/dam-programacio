package UF4.ProjectFigures;

public class Rectangle extends Shape {
    private int side1;
    private int side2;

    public Rectangle() {

    }

    public Rectangle(int id, String name, int side1, int side2) {
        super(id, name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return this.side1 * this.side2;
    }
}
