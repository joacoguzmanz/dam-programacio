package UF4.ProjectFigures;

import Toolkit.UsersUtil;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

public class HandleShapes {
    private static int lastId;
    static int min = 0, max = 10;
    static int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

    // Circle
    public static void createCircle(List<Shape> shapeList) {
        String name = UsersUtil.getStringFromUser("Enter a name for the circle", "ERR. Only letters");
        int radius = UsersUtil.getIntFromUser("Enter the radius", "ERR. Only number");

        if (randomNum < 5) {
            Circle circle = new Circle();
            circle.setId(lastId++);
            circle.setName(name);
            circle.setRadius(radius);
            shapeList.add(circle);
        }

        if (randomNum >= 5) {
            Circle circle = new Circle(lastId++, name, radius);
            shapeList.add(circle);
        }
    }

    // Parallelogram
    public static void createParallelogram(List<Shape> shapeList) {
        String shapeName = UsersUtil.getStringFromUser("Enter a name for the parallelogram", "ERR. Only letters");
        int base = UsersUtil.getIntFromUser("Enter the base", "ERR. Only number");
        int height = UsersUtil.getIntFromUser("Enter the height", "ERR. Only number");

        if (randomNum < 5) {
            Parallelogram parallelogram = new Parallelogram();
            parallelogram.setId(lastId++);
            parallelogram.setName(shapeName);
            parallelogram.setB(base);
            parallelogram.setH(height);
            shapeList.add(parallelogram);
        }

        if (randomNum >= 5) {
            Parallelogram parallelogram = new Parallelogram(lastId++, shapeName, base, height);
            shapeList.add(parallelogram);
        }
    }

    // Rectangle
    public static void createRectangle(List<Shape> shapeList) {
        String shapeName = UsersUtil.getStringFromUser("Enter a name for the rectangle", "ERR. Only letters");
        int sideOne = UsersUtil.getIntFromUser("Enter one side of the rectangle", "ERR. Only numbers");
        int sideTwo = UsersUtil.getIntFromUser("Enter the other side of the rectangle", "ERR. Only numbers");

        if (randomNum < 5) {
            Rectangle rectangle = new Rectangle();
            rectangle.setId(lastId++);
            rectangle.setName(shapeName);
            rectangle.setSide1(sideOne);
            rectangle.setSide2(sideTwo);
            shapeList.add(rectangle);
        }

        if (randomNum >= 5) {
            Rectangle rectangle = new Rectangle(lastId++, shapeName, sideOne, sideTwo);
            shapeList.add(rectangle);
        }
    }

    // Rhombus
    public static void createRhombus(List<Shape> shapeList) {
        String shapeName = UsersUtil.getStringFromUser("Enter a name for the rhombus", "ERR. Only letters");
        int diagonalOne = UsersUtil.getIntFromUser("Enter the greatest diagonal", "ERR. Only numbers");
        int diagonalTwo = UsersUtil.getIntFromUser("Enter the shortest diagonal", "ERR. Only numbers");

        if (randomNum < 5) {
            Rhombus rhombus = new Rhombus();
            rhombus.setId(lastId++);
            rhombus.setName(shapeName);
            rhombus.setdM(diagonalOne);
            rhombus.setDm(diagonalTwo);
            shapeList.add(rhombus);
        }

        if (randomNum >= 5) {
            Rhombus rhombus = new Rhombus(lastId++, shapeName, diagonalOne, diagonalTwo);
            shapeList.add(rhombus);
        }
    }

    // Square
    public static void createSquare(List<Shape> shapeList) {
        String shapeName = UsersUtil.getStringFromUser("Enter a name for the square", "ERR. Only letters");
        int side = UsersUtil.getIntFromUser("Enter the side of the square", "ERR. Only numbers");

        if (randomNum < 5) {
            Square square = new Square();
            square.setId(lastId++);
            square.setName(shapeName);
            square.setSide(side);
            shapeList.add(square);
        }

        if (randomNum >= 5) {
            Square square = new Square(lastId++, shapeName, side);
            shapeList.add(square);
        }
    }

    // Trapezoid
    public static void createTrapezoid(List<Shape> shapeList) {
        String shapeName = UsersUtil.getStringFromUser("Enter a name for the trapezoid", "ERR. Only letters");
        int sideA = UsersUtil.getIntFromUser("Enter the short side", "ERR. Only numbers");
        int sideB = UsersUtil.getIntFromUser("Enter the base", "ERR. Only numbers");
        int height = UsersUtil.getIntFromUser("Enter the height", "ERR. Only numbers");

        if (randomNum < 5) {
            Trapezoid trapezoid = new Trapezoid();
            trapezoid.setId(lastId++);
            trapezoid.setName(shapeName);
            trapezoid.setA(sideA);
            trapezoid.setB(sideB);
            trapezoid.setH(height);
            shapeList.add(trapezoid);
        }

        if (randomNum >= 5) {
            Trapezoid trapezoid = new Trapezoid(lastId++, shapeName, sideA, sideB, height);
            shapeList.add(trapezoid);
        }
    }

    // Triangle
    public static void createTriangle(List<Shape> shapeList) {
        String shapeName = UsersUtil.getStringFromUser("Enter a name for the triangle", "ERR. Only letters");
        int base = UsersUtil.getIntFromUser("Enter the base", "ERR. Only numbers");
        int height = UsersUtil.getIntFromUser("Enter the height", "ERR. Only numbers");

        if (randomNum < 5) {
            Triangle triangle = new Triangle();
            triangle.setId(lastId++);
            triangle.setName(shapeName);
            triangle.setBase(base);
            triangle.setH(height);
            shapeList.add(triangle);
        }

        if (randomNum >= 5) {
            Triangle triangle = new Triangle(lastId++, shapeName, base, height);
            shapeList.add(triangle);
        }
    }
}
