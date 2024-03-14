package UF4.ProjectFigures;

import java.util.List;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        List<Shape> listOfShapes = new ArrayList<>();

        // Complex constructor
        Triangle triangle = new Triangle(1, "triangle", 5, 6);
        listOfShapes.add(triangle);

        Square square = new Square(2, "square", 4);
        listOfShapes.add(square);

        Trapezoid trapezoid = new Trapezoid(3, "trapezoid", 3, 7, 9);
        listOfShapes.add(trapezoid);

        Rhombus rhombus = new Rhombus(4, "rhombus", 10, 6);
        listOfShapes.add(rhombus);

        Parallelogram parallelogram = new Parallelogram(5, "parallelogram", 3, 6);
        listOfShapes.add(parallelogram);

        Circle circle = new Circle(6, "circle", 14);
        listOfShapes.add(circle);

        // Basic constructor
        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(5);
        rectangle.setSide2(6);
        rectangle.setId(7);
        listOfShapes.add(rectangle);

        showShapes(listOfShapes);
    }

    public static void showShapes(List<Shape> shapeList) {
        for (Shape shape : shapeList) {
            System.out.println("The shape with id " + shape.getId() + " is a " + shape.getName() + ".");
            System.out.println("The shape of the " + shape.getName() + " is: " + shape.calculateArea());
            System.out.println();
            System.out.println("--------------");
            System.out.println();
        }
    }
}
