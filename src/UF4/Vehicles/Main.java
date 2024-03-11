package UF4.Vehicles;

import java.util.ArrayList;
import java.util.List;
import Toolkit.UsersUtil;
import UF4.Empresa.GestionarSucursales;

public class Main {
    public static void main(String[] args) {
        // List<Brand> brandsList = new ArrayList<>();
        List<Model> modelsList = new ArrayList<>();

        boolean goOn;

        do {
            int option = menu();
            switch (option) {
                case 1:
                    ManageModels.create(modelsList);
                    break;
                case 2:
                    ManageModels.update(modelsList);
                    break;
                case 3:
                    ManageModels.read(modelsList);
                    break;
                case 4:
                    ManageModels.delete(modelsList);
                case 9:
                    break;
            }

            goOn = continueMenu();
        } while (goOn);
    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println("1 - Create car");
        System.out.println("2 - Update car");
        System.out.println("3 - Read cars");
        System.out.println("5 - Delete car");
        System.out.println("9 - Exit");

        return UsersUtil.getIntFromUser("Enter an option", "ERR. Enter a number");
    }

    public static boolean continueMenu() {
        boolean response = false;
        int userInput = UsersUtil.getIntFromUser("Want to go on? [1-Yes / 2-No]", "ERR. Enter an option");
        if (userInput == 1) {
            response = true;
        }
        return response;
    }
}
