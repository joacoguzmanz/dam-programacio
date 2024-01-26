package FunctionsRepas;

import java.util.Scanner;

public class CodiRaul {

    private Scanner scan = new Scanner(System.in);
    private boolean fi = false;
    private double area = 0;

    public static void main(String[] args) {
        CodiRaul programa = new CodiRaul();
        programa.inici();
    }

    public void inici() {
        while (!fi) {
            mostrarMenu();
            triaOpcio();
        }
    }

    public void mostrarMenu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("De quina figura vols calcular");
        System.out.println("Tens les següents opcions:");
        System.out.println("[TG] Triangle");
        System.out.println("[QU] Quadrat");
        System.out.println("[TZ] Trapezi");
        System.out.println("[FI] Sortir");
        System.out.println("-----------------------------------------------------");
    }

    public void triaOpcio() {
        String opcio = scan.nextLine();
        System.out.println(opcio);

        if (opcio.equalsIgnoreCase("TG")) {
            operacioTriangle();
        } else if (opcio.equalsIgnoreCase("QU")) {
            operacioQuadrat();
        } else if (opcio.equalsIgnoreCase("TZ")) {
            operacioTrapezi();
        } else if (opcio.equalsIgnoreCase("FI")) {
            // Acaba el programa
            System.out.println("Programa acabat!!");
            fi = true;
        } else {
            System.out.println("Opció incorrecta. Escull un altre.\n");
        }
        System.out.println("NO coges nada");
    }

    public void operacioTriangle() {
        System.out.println("Digam la base del triangle.");
        double baseTriangle = scan.nextDouble();
        System.out.println("Digam l' altura del triangle.");
        double alturaTriangle = scan.nextDouble();
        scan.nextLine();
        area = 0.5 * baseTriangle * alturaTriangle;
        System.out.println("L' area es de " + area);
    }

    public void operacioQuadrat() {
        System.out.println("Digam el primer costat del quadrat.");
        double costat1 = scan.nextDouble();
        System.out.println("Digam el segon costat del quadrat.");
        double costat2 = scan.nextDouble();
        area = costat1 * costat2;
        System.out.println("L' area es de " + area);
    }

    public void operacioTrapezi() {
        System.out.println("Digam el valor de la base major del trapezi.");
        double baseMajor = scan.nextDouble();
        System.out.println("Digam el valor de la base menor del trapezi.");
        double baseMenor = scan.nextDouble();
        System.out.println("Digam l'altura del trapezi.");
        double alturaTrapezi = scan.nextDouble();
        area = 0.5 * (baseMajor + baseMenor) * alturaTrapezi;
        System.out.println("L' area es de " + area);
    }
}
