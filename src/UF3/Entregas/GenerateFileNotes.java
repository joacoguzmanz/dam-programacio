package UF3.Entregas;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class GenerateFileNotes {
    public static final String MARCA_FI = "fi";

    public static void main(String[] args) {
        try {
            File f = new File("/Users/joacoguzman/Code/prat/NotaMitja.txt");
            f.createNewFile();

            PrintStream printStream = new PrintStream(f);

            printStream.println("Maria Almerich 4 3.5 6 -1");
            printStream.println("Joan Sebastià 4.5 8.5 5 6.5 7 -1");
            printStream.println("Carme González 6.5 8.75 10 9.5 -1");
            printStream.println("fi");
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        try {
            File f = new File("/Users/joacoguzman/Code/prat/NotaMitja.txt");
            Scanner lector = new Scanner(f);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                } else {
                    String cognom = lector.next();
                    System.out.print("Estudiant: " + nom + " " + cognom);
                    double mitjana = llegirNotes(lector);
                    System.out.println("− Mitjana: " + mitjana);
                }
            }
            lector.close();
        }
        catch(Exception e) {
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    public static double llegirNotes(Scanner lector) {
        double res = 0;
        int countNotes = 0;
        try {
            double numNotes = lector.nextDouble();
            while (numNotes != -1) {
                res = res + numNotes;
                countNotes++;
                numNotes = lector.nextDouble();
            }
            res = res/countNotes;
        }
        catch (Exception e) {
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}
