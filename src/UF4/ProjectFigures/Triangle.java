package UF4.ProjectFigures;

import java.util.Scanner;
import Toolkit.UsersUtil;

public class Triangle extends Shape {
    private int base;
    private int h;

    public Triangle() {

    }

    public Triangle(int id, String name, int base, int h) {
        super(id, name);
        this.base = base;
        this.h = h;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return this.base * this.h;
    }

    @Override
    public void readData() {
        this.base = UsersUtil.getIntFromUser("Enter the base of the triangle", "ERROR. Try again");
        this.h = UsersUtil.getIntFromUser("Enter the height of the triangle", "ERROR. Try again");
    }
}
