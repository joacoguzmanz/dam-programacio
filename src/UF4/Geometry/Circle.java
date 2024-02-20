package UF4.Geometry;

public class Circle {
    private int radius;

    private String colour;

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
