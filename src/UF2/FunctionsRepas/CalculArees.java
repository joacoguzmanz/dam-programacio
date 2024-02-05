package UF2.FunctionsRepas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CalculArees {
    public static void main(String[] args) {
        CalculArees program = new CalculArees();
        program.inici();
    }

    public void inici() {
        String[] shapes = {"triangle", "square", "rectangle", "trapezoid", "rhombus", "circle", "parallelogram", "q"};
        double result;
        do {
            result = areasCalculator(isValidOption(shapes, menu(), "Ingrese una opcion valida"));
            if (result > 0) {
                System.out.println("- El area de la figura es: " + result + "\n");
                if (!goOn("Queres continuar?")) {
                    result = 0;
                }
            }
        } while (result != 0);
    }

    public String menu() {
        System.out.println("-- Area calculator --\n");
        System.out.println("\t\t  - Options -\ntriangle\tsquare\t\trectangle\ntrapezoid\t\trhombus\t\tcircle\nparallelogram\nEnter Q to quit\n");
        return inputString("Enter a shape");
    }

    public String inputString(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message + ": ");
        while (!sc.hasNextLine()) {
            System.out.print("Ingrese una palabra: ");
            sc.next();
        }

        return sc.nextLine();
    }

    public boolean goOn(String message) {
        String[] ops = {"s", "n"};
        boolean again = false;

        System.out.print(message + " ");
        if (isValidOption(ops, inputString("(s/n)"), "Ingrese la opción correcta").equals("s")) {
            again = true;
        }

        return again;
    }

    public String isValidOption(String[] options, String userOption, String errorMsg) {
        Set<String> listOptions = new HashSet<>(Arrays.asList(options));

        while (!listOptions.contains(userOption.toLowerCase())) {
            userOption = inputString(errorMsg);
        }

        return userOption.toLowerCase();
    }

    public double inputDouble(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message + ": ");
        while (!sc.hasNextDouble()) {
            System.out.print("Enter a valid number please: ");
            sc.next();
        }

        return sc.nextDouble();
    }

    public double areasCalculator(String shape) {
        double area = 0;
        switch (shape) {
            case "triangle":
                area = triangle(inputDouble("Ingrese la base"), inputDouble("Ingrese la altura"));
                break;
            case "square":
                area = square(inputDouble("Ingrese un lado"));
                break;
            case "rectangle":
                area = rectangle(inputDouble("Ingrese la base"), inputDouble("Ingrese la altura"));
                break;
            case "trapezoid":
                area = trapezoid(inputDouble("Ingrese la base corta"), inputDouble("Ingrese la base larga"), inputDouble("Ingrese la altura"));
                break;
            case "rhombus":
                area = rhombus(inputDouble("Ingrese la diagonal corta"), inputDouble("Ingrese la diagonal larga"));
                break;
            case "circle":
                area = circle(inputDouble("Enter the radius"));
                break;
            case "parallelogram":
                area = parallelogram(inputDouble("Ingrese la base"), inputDouble("Ingrese la altura"));
                break;
            case "q":
                break;
        }

        return area;
    }

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
