package UF4.Geometry;

public class Rectangle {
    private int base;
    private int height;
    private String colour;

    public Rectangle(int base, int height, String colour) {
        this.base = base;
        this.height = height;
        this.colour = colour;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
