package UF4.ProjectFigures;

import java.lang.Math;

public class Square extends Shape {
    private int side;

    public Square() {

    }

    public Square(int id, String name, int side) {
        super(id, name);
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2);
    }
}
