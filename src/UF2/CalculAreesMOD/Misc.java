package UF2.CalculAreesMOD;

public class Misc {
    public String menu() {
        UserInput inputs = new UserInput();
        System.out.println("-- Area calculator --\n");
        System.out.println("\t\t  - Options -\ntriangle\tsquare\t\trectangle\ntrapezoid\t\trhombus\t\tcircle\nparallelogram\nEnter Q to quit\n");
        return inputs.inputString("Enter a shape");
    }

    public double areasCalculator(String shape) {
        Figures calculate = new Figures();
        UserInput inputs = new UserInput();

        double area = 0;
        switch (shape) {
            case "triangle":
                area = calculate.triangle(inputs.inputDouble("Ingrese la base"), inputs.inputDouble("Ingrese la altura"));
                break;
            case "square":
                area = calculate.square(inputs.inputDouble("Ingrese un lado"));
                break;
            case "rectangle":
                area = calculate.rectangle(inputs.inputDouble("Ingrese la base"), inputs.inputDouble("Ingrese la altura"));
                break;
            case "trapezoid":
                area = calculate.trapezoid(inputs.inputDouble("Ingrese la base corta"), inputs.inputDouble("Ingrese la base larga"), inputs.inputDouble("Ingrese la altura"));
                break;
            case "rhombus":
                area = calculate.rhombus(inputs.inputDouble("Ingrese la diagonal corta"), inputs.inputDouble("Ingrese la diagonal larga"));
                break;
            case "circle":
                area = calculate.circle(inputs.inputDouble("Enter the radius"));
                break;
            case "parallelogram":
                area = calculate.parallelogram(inputs.inputDouble("Ingrese la base"), inputs.inputDouble("Ingrese la altura"));
                break;
            case "q":
                break;
        }

        return area;
    }
}
