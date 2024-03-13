package UF4.ProjectFigures;

import Toolkit.UsersUtil;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            int choice = menu();
            handleShapes(choice);
            exit = goOn();
        }
    }

    public static int menu() {
        System.out.println("Menu of shapes");
        System.out.println("1 - Triangle");
        System.out.println("2 - Square");
        System.out.println("3 - Rectangle");
        System.out.println("4 - Trapezoid");
        System.out.println("5 - Rhombus");
        System.out.println("6 - Parallelogram");
        System.out.println("7 - Circle");
        System.out.println("9 - Exit");

        return UsersUtil.getIntFromUser("Select a shape", "ERROR. Try again");
    }

    public static void handleShapes(int option) {
        switch (option) {
            case 1:
                Triangle triangle = new Triangle(3, 4);
                Triangle triangle1 = new Triangle();
                triangle1.readData();
                System.out.println(triangle1.calculateArea());
                // Call method to handle Triangle
                break;
            case 2:
                // Call method to handle Square
                break;
            case 3:
                // Call method to handle Rectangle
                break;
            case 4:
                // Call method to handle Trapezoid
                break;
            case 5:
                // Call method to handle Rhombus
                break;
            case 6:
                // Call method to handle Parallelogram
                break;
            case 7:
                // Call method to handle Circle
                break;
            case 9:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Not a valid option. Try again.");
        }
    }

    public static boolean goOn() {
        String choice = UsersUtil.getStringFromUser("Do you want to continue? (Y/N)", "ERROR. Try again");
        return choice.equalsIgnoreCase("N");
    }
}
