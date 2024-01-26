package DeleteElement;

import java.util.Scanner;

public class DeleteVectorEl {
    public static void main(String[] args) {
        DeleteVectorEl program = new DeleteVectorEl();
        program.inici();
    }

    public void inici() {
        int[] arrNumbs = fillArray(createArray());
        int[] finalArr = removeFromArray(arrNumbs, askIndex(arrNumbs));

        for (int numbs : finalArr) {
            System.out.print(numbs + " ");
        }
        System.out.println();
    }

    public int[] createArray() {
        int len = inputNumber("Ingrese la cantidad de notas");

        return new int[len];
    }

    public int[] fillArray(int[] arr) {
        System.out.println("\n-- Cargar notas en el array --");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputNumber("Ingrese un numero");
        }

        return arr;
    }

    public int inputNumber(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message + ": ");
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un numero valido: ");
            sc.next();
        }

        return sc.nextInt();
    }

    public boolean isValidIndex(int index, int arrLength) {
        return index >= 0 && index < arrLength;
    }

    public int askIndex(int[] arr) {
        int arrLen = arr.length;
        int index = inputNumber("\nEnter the index to delete");

        while (!isValidIndex(index, arrLen)) {
            index = inputNumber("Index must be between 0 and " + (arrLen - 1));
        }

        return index;
    }

    public int[] removeFromArray(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        int newArrIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index && i <= newArr.length) {
                newArr[newArrIndex] = arr[i];
                newArrIndex++;
            }
        }

        return newArr;
    }

    public int[] removeArrayElement(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        int newArrIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element && i <= newArr.length) {
                newArr[newArrIndex] = arr[i];
                newArrIndex++;
            }
        }

        return newArr;
    }
}
