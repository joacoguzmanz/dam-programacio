package UF2.CalculAreesMOD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInput {
    public double inputDouble(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message + ": ");
        while (!sc.hasNextDouble()) {
            System.out.print("Enter a valid number please: ");
            sc.next();
        }

        return sc.nextDouble();
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

    public String isValidOption(String[] options, String userOption, String errorMsg) {
        Set<String> listOptions = new HashSet<>(Arrays.asList(options));

        while (!listOptions.contains(userOption.toLowerCase())) {
            userOption = inputString(errorMsg);
        }

        return userOption.toLowerCase();
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
}
