package Toolkit;

import java.util.Scanner;

public class UsersUtil {
    static Scanner sc = new Scanner(System.in);

    /**
     *
     * @param message to ask the user for input
     * @param err to display in case there is no int
     * @return the number the user entered
     */
    public static int getIntFromUser(String message, String err) {
        System.out.print(message + ": ");
        while (!sc.hasNextInt()) {
            System.out.print(err + ": ");
            sc.next();
        }

        return sc.nextInt();
    }

    public static float getFloatFromUser(String message, String err) {
        System.out.print(message + ": ");
        while (!sc.hasNextFloat()) {
            System.out.print(err + ": ");
            sc.next();
        }

        return sc.nextInt();
    }

    public static double getDoubleFromUser(String message, String err) {
        System.out.print(message + ": ");
        while (!sc.hasNextDouble()) {
            System.out.print(err + ": ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static String getStringFromUser(String msg, String err) {
        String regex = "^[a-zA-Z\\s]+$";
        System.out.print(msg + ": ");
        String input = sc.next();
        while (!input.matches(regex)) {
            System.out.print(err + ": ");
            input = sc.next();
        }
        return input;
    }
}
