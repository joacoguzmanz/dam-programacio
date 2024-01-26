package FunctionsRepas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrediccioPersona {
    public static void main(String[] args) {
        PrediccioPersona program = new PrediccioPersona();
        program.inici();
    }

    public void inici() {
        String[] months = {"gener", "febrer", "marc", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};
        // String[] teams = {"Bayern de Munich", "Atlético de Madrid", "Chelsea", "Manchester City", "Liverpool", "Real Madrid", "Borussia Dortmund", "FC Barcelona", "Juventus", "PSG", "Sevilla", "Manchester United"};
        String[] code = {"C++", "Python", "JavaScript", "Node.js", "React", "C#", "Swift", "Java", "PHP", "R", "Go", "Ruby"};

        // mes nombre edad
        String[] chosen;
        chosen = menu(months);

        System.out.println("Tu nombre es: " + chosen[1]);
        System.out.println("Tu numero de la suerte es: " + calculateNumber(chosen[0], months, chosen[2]));
        System.out.println("Tu equipo de futbol es: " + calculateTeam(chosen[0], months));
        System.out.println("Tu lenguaje programacion es: " + calculateCode(chosen[0], months, code));


        /*for (String h : chosen) {
            System.out.print(h);
        }*/
    }

    public String[] menu(String[] opts) {
        String[] res = new String[3];

        System.out.print("Meses");
        System.out.print("\n");
        System.out.print("Gener\tFebrer\tMarc\n");
        System.out.print("Abril\tMaig\tJuny\n");
        System.out.print("Juliol\tAgost\tSetembre\n");
        System.out.print("Octubre\tNovembre\tDesembre");
        System.out.print("\n\n");
        res[0] = isValidOption(opts, inputString("Ingrese el mes"), "Ingrese un mes del menu");

        res[1] = inputString("Ingrese su nombre");

        res[2] = inputString("Ingrese su edad");

        return res;
    }

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

    public String calculateTeam(String userMonth, String[] months) {
        String team = "";

        if (userMonth.equalsIgnoreCase(months[0])) {
            team = "Bayern de Munich";
        } else if (userMonth.equalsIgnoreCase(months[1])) {
            team = "Atlético de Madrid";
        } else if (userMonth.equalsIgnoreCase(months[2])) {
            team = "Chelsea";
        } else if (userMonth.equalsIgnoreCase(months[3])) {
            team = "Manchester City";
        } else if (userMonth.equalsIgnoreCase(months[4])) {
            team = "Liverpool";
        } else if (userMonth.equalsIgnoreCase(months[5])) {
            team = "Real Madrid";
        } else if (userMonth.equalsIgnoreCase(months[6])) {
            team = "Borussia Dortmund";
        } else if (userMonth.equalsIgnoreCase(months[7])) {
            team = "FC Barcelona";
        } else if (userMonth.equalsIgnoreCase(months[8])) {
            team = "Juventus";
        } else if (userMonth.equalsIgnoreCase(months[9])) {
            team = "PSG";
        } else if (userMonth.equalsIgnoreCase(months[10])) {
            team = "Sevilla";
        } else if (userMonth.equalsIgnoreCase(months[11])) {
            team = "Manchester United";
        } else {
            team = "No tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
        }

        return team;
    }

    public String calculateCode(String userMonth, String[] months, String[] codeLanguage) {
        String code = "";

        if (userMonth.equalsIgnoreCase(months[0])) {
            code = codeLanguage[0];
        } else if (userMonth.equalsIgnoreCase(months[1])) {
            code = codeLanguage[1];
        } else if (userMonth.equalsIgnoreCase(months[2])) {
            code = codeLanguage[2];
        } else if (userMonth.equalsIgnoreCase(months[3])) {
            code = codeLanguage[3];
        } else if (userMonth.equalsIgnoreCase(months[4])) {
            code = codeLanguage[4];
        } else if (userMonth.equalsIgnoreCase(months[5])) {
            code = codeLanguage[5];
        } else if (userMonth.equalsIgnoreCase(months[6])) {
            code = codeLanguage[6];
        } else if (userMonth.equalsIgnoreCase(months[7])) {
            code = codeLanguage[7];
        } else if (userMonth.equalsIgnoreCase(months[8])) {
            code = codeLanguage[8];
        } else if (userMonth.equalsIgnoreCase(months[9])) {
            code = codeLanguage[9];
        } else if (userMonth.equalsIgnoreCase(months[10])) {
            code = codeLanguage[10];
        } else if (userMonth.equalsIgnoreCase(months[11])) {
            code = codeLanguage[11];
        } else {
            code = "No tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
        }

        return code;
    }

    public double calculateNumber(String userMonth, String[] months, String age) {
        double result = 0;
        double sum = Double.parseDouble(age) + Double.parseDouble(age);

        if (userMonth.equalsIgnoreCase(months[0])) {
            result = Double.parseDouble(age) * 3 / 2;
        } else if (userMonth.equalsIgnoreCase(months[1])) {
            result = Double.parseDouble(age) - 4;
        } else if (userMonth.equalsIgnoreCase(months[2])) {
            result = Double.parseDouble(age) / 2;
        } else if (userMonth.equalsIgnoreCase(months[3])) {
            result = Double.parseDouble(age) % 4;
        } else if (userMonth.equalsIgnoreCase(months[4])) {
            result = Double.parseDouble(age) * 3 / 6;
        } else if (userMonth.equalsIgnoreCase(months[5])) {
            result = sum;
        } else if (userMonth.equalsIgnoreCase(months[6])) {
            result = Double.parseDouble(age) * Double.parseDouble(age) / 5;
        } else if (userMonth.equalsIgnoreCase(months[7])) {
            result = Double.parseDouble(age) * 1 / 2 * Double.parseDouble(age);
        } else if (userMonth.equalsIgnoreCase(months[8])) {
            result = 1.0;
        } else if (userMonth.equalsIgnoreCase(months[9])) {
            result = Double.parseDouble(age) * 4 / 3;
        } else if (userMonth.equalsIgnoreCase(months[10])) {
            result = Double.parseDouble(age) % 2 + 23;
        } else if (userMonth.equalsIgnoreCase(months[11])) {
            result = sum / 2;
        } else {
            result = 0;
        }

        return result;
    }
}
