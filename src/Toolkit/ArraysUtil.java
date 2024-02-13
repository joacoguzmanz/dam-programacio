package Toolkit;

import java.util.Arrays;

public class ArraysUtil {

    /**
     *
     * @param index The index to be validated
     * @param arrLength The array to validate the index
     * @return Boolean based on index being within array length
     */
    private static boolean isValidIndex(int index, int arrLength) {
        return index >= 0 && index < arrLength;
    }

    /**
     *
     * @return An array of the length input by the user
     */
    public static int[] createArray() {
        int len = UsersUtil.getIntFromUser("Ingrese el largo del array", "Ingresá un numero válido");

        return new int[len];
    }

    /**
     *
     * @param arr The array to be filled
     */
    public static void fillArrayUser(int[] arr) {
        System.out.println("\n-- Cargar valores en el array --");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = UsersUtil.getIntFromUser("Ingrese un numero", "Ingresá un numero válido");
        }
    }

    /**
     *
     * @param arr array to fill with random numbers
     * @param min min value for random
     * @param max max value for random
     */
    public static void fillArrayRandom(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = NumbersUtil.getRandomInt(min, max);
        }
    }

    /**
     *
     * @param arr The array to transform
     * @param index The index of the element to delete
     * @return The array without the element
     */
    public static int[] removeFromArray(int[] arr, int index) {
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

    /**
     *
     * @param arr The array to transform
     * @param element The element to delete from the array
     * @return The array without the element
     */
    public static int[] removeElement(int[] arr, int element) {
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

    /**
     *
     * @param arr array to print
     */
    public static void printArrayInt(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }


    public static void printArrayValuesOnArray(int[] arrToSearch, int[] arrToBeSearched) {
        int counter = 0;
        for (int j : arrToSearch) {
            boolean trobat = false;
            for (int k : arrToBeSearched) {
                if (j == k && !trobat) {
                    System.out.println("A la posicio " + Arrays.binarySearch(arrToBeSearched, j) + " hi ha el valor " + j);
                    trobat = true;
                    counter += 1;
                }
            }
        }
        if (counter < 1) {
            System.out.println("No se encontraron coincidencias");
        }
    }

}

/*/**
     *
     * @param arr The array to check if index is within range
     * @return The index the user input
     *
    public static int askIndex(int[] arr) {
        int arrLen = arr.length;
        int index = UsersUtil.getIntFromUser("Input the index value", "Ingresá un numero válido");

        while (!isValidIndex(index, arrLen)) {
            index = UsersUtil.getIntFromUser("Index must be between 0 and " + (arrLen - 1), "Ingresá un numero válido");
        }

        return index;
    }*/



