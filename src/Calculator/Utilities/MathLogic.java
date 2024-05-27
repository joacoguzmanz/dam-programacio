package Calculator.Utilities;

public class MathLogic {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }

    public static double percentDifference(double a) {
        return 1 - (a / 100);
    }
}
