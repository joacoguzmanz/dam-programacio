package UF2.CalculAreesMOD;

public class Figures {
    public double triangle(double base, double height) {
        return (base * height) / 2;
    }

    public double square(double side) {
        return Math.pow(side, 2);
    }

    public double rectangle(double base, double height) {
        return base * height;
    }

    public double trapezoid(double sBase, double lBase, double height) {
        return (sBase + lBase) / 2 * height;
    }

    public double rhombus(double sDiagonal, double lDiagonal) {
        return (sDiagonal * lDiagonal) / 2;
    }

    public double circle(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double parallelogram(double base, double height) {
        return base * height;
    }
}
