package Lib;

import Lib.HandleNums;

public class HandleArrays {

    /**
     *
     * @param index The index to be validated
     * @param arrLength The array to validate the index
     * @return Boolean based on index being within array length
     */
    public static boolean isValidIndex(int index, int arrLength) {
        return index >= 0 && index < arrLength;
    }

    /**
     *
     * @param arr The array to check if index is within range
     * @return The index the user input
     */
    public static int askIndex(int[] arr) {
        int arrLen = arr.length;
        int index = HandleNums.inputNumber("Input the index value");

        while (!isValidIndex(index, arrLen)) {
            index = HandleNums.inputNumber("Index must be between 0 and " + (arrLen - 1));
        }

        return index;
    }

    /**
     *
     * @return An array of the length input by the user
     */
    public static int[] createArray() {
        int len = HandleNums.inputNumber("Ingrese el largo del array");

        return new int[len];
    }

    /**
     *
     * @param arr The array to be filled
     * @return The filled array
     */
    public static int[] fillArray(int[] arr) {
        System.out.println("\n-- Cargar valores en el array --");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = HandleNums.inputNumber("Ingrese un numero");
        }

        return arr;
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
    public static int[] removeArrayElement(int[] arr, int element) {
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
