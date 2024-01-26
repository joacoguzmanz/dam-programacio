package Lib;

import java.util.Scanner;

public class HandleNums {

    /**
     *
     * @param message The message to ask for input
     * @return User's int input value
     */
    public static int inputNumber(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message + ": ");
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid number please: ");
            sc.next();
        }

        return sc.nextInt();
    }
}
