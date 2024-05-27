package Calculator;

import java.util.Scanner;
import Calculator.Utilities.MathLogic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.print("Enter another number: ");
        double b = sc.nextDouble();

        try {
            double result = MathLogic.divide(a, b);
            System.out.println("The result is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        }
    }
}
