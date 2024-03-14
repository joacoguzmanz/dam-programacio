package UF4.ProjectFigures;

public class Parallelogram extends Shape {
    private int b;
    private int h;

    public Parallelogram() {

    }

    public Parallelogram(int id, String name, int b, int h) {
        super(id, name);
        this.b = b;
        this.h = h;
    }

    public Parallelogram(int b, int h) {
        this.b = b;
        this.h = h;
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
        return this.b * this.h;
    }
}
