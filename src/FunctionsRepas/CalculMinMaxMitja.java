package FunctionsRepas;

import java.util.Scanner;

public class CalculMinMaxMitja {
    public static void main(String[] args) {
        CalculMinMaxMitja program = new CalculMinMaxMitja();
        program.inici();
    }

    public void inici() {
        int[] notes = fillArray(createArray());
        notesCalculator(notes);
    }

    public int[] createArray() {
        int len = inputNumber("Ingrese el largo del array");

        return new int[len];
    }

    public int[] fillArray(int[] arr) {
        System.out.println("\n-- Cargar valores en el array --");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputNumber("Ingrese un numero");
        }

        return arr;
    }

    public int inputNumber(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message + ": ");
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid number please: ");
            sc.next();
        }

        return sc.nextInt();
    }

    public void notesCalculator(int[] notes) {
        System.out.println("El mas pequeño es " + minNote(notes));
        System.out.println("El mas grande es " + maxNote(notes));
        System.out.println("El mas promedio es " + averageNote(notes));
    }

    public float maxNote(int[] notes) {
        float max = notes[0];

        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }

        return max;
    }

    public float minNote(int[] notes) {
        float min = notes[0];

        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }

        return min;
    }

    public float averageNote(int[] notes) {
        float avg, sum = 0;

        if (notes.length == 0) {
            System.out.println("No se puede calcular vacio");
            avg = 0;
        } else {
            for (int i : notes) {
                sum += i;
            }

            avg = sum / notes.length;
        }

        return avg;
    }
}
