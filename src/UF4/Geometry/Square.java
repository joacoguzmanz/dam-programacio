package UF4.Geometry;

public class Square {
    private int side;
    private String colour;

    public Square(int side, String colour) {
        this.side = side;
        this.colour = colour;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
