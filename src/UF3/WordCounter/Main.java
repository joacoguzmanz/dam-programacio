package UF3.WordCounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static int COUNTER = 0;
    public static String TEXT;

    public static void main(String[] args) {
        try {
            File f = new File("/Users/joacoguzman/Code/prat/dam-programacio/src/UF3/WordCounter/Input.txt");
            Scanner lector = new Scanner(f);

            COUNTER = countWords(lector);

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Not found file: " + e.getMessage());

            try {
                File f = new File("/Users/joacoguzman/Code/prat/dam-programacio/src/UF3/WordCounter/Input.txt");
                if (f.createNewFile()) {
                    System.out.println("File created: " + f.getName());
                } else {
                    System.out.println("File already exists.");
                }

                Scanner lector = new Scanner(f);
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter your text: ");
                TEXT = sc.nextLine();

                PrintStream printStream = new PrintStream(f);
                printStream.println(TEXT);
                printStream.close();

                COUNTER = countWords(lector);

                lector.close();
            } catch (Exception ex) {
                System.out.println("Problem: " + ex);
            }
        }

        try {
            File f = new File("/Users/joacoguzman/Code/prat/dam-programacio/src/UF3/WordCounter/Output.txt");

            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }

            PrintStream printStream = new PrintStream(f);

            printStream.println("File has " + COUNTER + " words.");
            printStream.close();
        } catch (Exception e) {
            System.out.println("Problem: " + e);
        }
    }

    public static int countWords(Scanner lector) {
        int counter = 0;
        while (lector.hasNext()) {
            lector.next();
            counter++;
        }
        return counter;
    }
}
