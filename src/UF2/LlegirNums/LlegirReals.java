package UF2.LlegirNums;

import java.util.Scanner;

public class LlegirReals {
    public static void main (String[] args) {
        LlegirReals programa = new LlegirReals();
        programa.inici();
    }

    public void inici() {
        System.out.println("Llegiu un enter pel teclat:");
        double a = llegirEnterTeclat();
        System.out.println("L’enter ha estat " + a + ".");
        System.out.println("Llegiu un altre enter pel teclat:");
        a = llegirEnterTeclat();
        System.out.println("L’altre enter ha estat " + a + ".");
    }

    //1. Quin tipus de valor genera? Un enter (int)
    public double llegirEnterTeclat() {
        //2. Es fa el codi que llegeix un únic enter del teclat, com s’ha fet sempre
        //No canvia absolutament res...
        Scanner lector = new Scanner(System.in);
        double enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();
            if (llegit) {
                enterLlegit = lector.nextDouble();
            }
            else {
                System.out.println("Això no és un enter.");
                lector.next();
            }
        }
        lector.nextLine();
        //3. Un cop fet, quina variable t  el resultat? "enterLlegit"
        //4. Cal fer "return" damunt seu
        return enterLlegit;
    }
}
