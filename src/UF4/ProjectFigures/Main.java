package UF4.ProjectFigures;

import Toolkit.UsersUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        List<Shape> listOfShapes = new ArrayList<>();

        while (!exit) {
            int choice = menu();
            handleShapes(choice, listOfShapes);
            exit = goOn();
        }

        if ( listOfShapes.isEmpty()) {
            System.out.println("No hay figuras cargadas");
        } else {
            showShapes(listOfShapes);
        }
    }

    public static void showShapes(List<Shape> shapeList) {
        System.out.println();
        System.out.println("--- List of shapes ---");
        for (Shape shape : shapeList) {
            System.out.println();
            System.out.println("The shape with id " + shape.getId() + " is a " + shape.getName() + ".");
            System.out.println("The shape of the " + shape.getName() + " is: " + shape.calculateArea());
            System.out.println();
            System.out.println("--------------");
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

    public static void handleShapes(int option, List<Shape> shapeList) {
        switch (option) {
            case 1:
                // Call method to handle Triangle
                HandleShapes.createTriangle(shapeList);
                break;
            case 2:
                // Call method to handle Square
                HandleShapes.createSquare(shapeList);
                break;
            case 3:
                // Call method to handle Rectangle
                HandleShapes.createRectangle(shapeList);
                break;
            case 4:
                // Call method to handle Trapezoid
                HandleShapes.createTrapezoid(shapeList);
                break;
            case 5:
                // Call method to handle Rhombus
                HandleShapes.createRhombus(shapeList);
                break;
            case 6:
                // Call method to handle Parallelogram
                HandleShapes.createParallelogram(shapeList);
                break;
            case 7:
                // Call method to handle Circle
                HandleShapes.createCircle(shapeList);
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
