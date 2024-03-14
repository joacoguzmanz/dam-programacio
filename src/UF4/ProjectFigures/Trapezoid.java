package UF4.ProjectFigures;

public class Trapezoid extends Shape {
    private int a;
    private int b;
    private int h;

    public Trapezoid() {

    }

    public Trapezoid(int id, String name, int a, int b, int h) {
        super(id, name);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Trapezoid(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (double) (this.a + this.b) * this.h / 2;
    }
}
