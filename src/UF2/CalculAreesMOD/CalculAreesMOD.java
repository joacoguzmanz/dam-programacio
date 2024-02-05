package UF2.CalculAreesMOD;

public class CalculAreesMOD {
    public static void main(String[] args) {
        CalculAreesMOD program = new CalculAreesMOD();
        program.inici();
    }

    public void inici() {
        Misc misc = new Misc();
        UserInput inputs = new UserInput();

        String[] shapes = {"triangle", "square", "rectangle", "trapezoid", "rhombus", "circle", "parallelogram", "q"};
        double result;

        do {
            result = misc.areasCalculator(inputs.isValidOption(shapes, misc.menu(), "Ingrese una opcion valida"));
            if (result > 0) {
                System.out.println("- El area de la figura es: " + result + "\n");
                if (!inputs.goOn("Queres continuar")) {
                    result = 0;
                }
            }
        } while (result != 0);
    }
}
