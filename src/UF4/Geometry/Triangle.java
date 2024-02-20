package UF4.Geometry;

public class Triangle {
    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private String colour;

    public Triangle(int sideOne, int sideTwo, int sideThree, String colour) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.colour = colour;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
