package UF2.LlegirNums;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        SecondLargest program = new SecondLargest();
        program.inici();
    }

    public void inici() {
        returnSecondLargest(fillArray(createArray()));
    }

    public void returnSecondLargest(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nEl segundo más grande es: " + arr[arr.length - 2]);
    }

    public int[] createArray() {
        System.out.print("Ingrese el largo del array: ");
        int len = checkNumber("Ingrese un número válido: ");

        return new int[len];
    }

    public int[] fillArray(int[] arr) {
        System.out.println("\n-- Cargar valores en el array --");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un número: ");
            arr[i] = checkNumber("Ingresa un número válido: ");
        }

        return arr;
    }

    public int checkNumber(String message) {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    private void quickSort(int numerosAOrdenar[], int izq, int der)
    {
        int pivote = numerosAOrdenar[izq];
        int i=izq;
        int j=der;
        int auxiliar;
        while(i < j)
        {
            while(numerosAOrdenar[i] <= pivote && i < j) i++;
            while(numerosAOrdenar[j] > pivote) j--;
            if (i < j)
            {
                auxiliar = numerosAOrdenar[i];
                numerosAOrdenar[i] = numerosAOrdenar[j];
                numerosAOrdenar[j] = auxiliar;
            }
        }
        numerosAOrdenar[izq] = numerosAOrdenar[j];
        numerosAOrdenar[j] = pivote;
        if(izq < j-1)
        {
            quickSort(numerosAOrdenar,izq,j-1);
        }
        if(j+1 < der)
        {
            quickSort(numerosAOrdenar,j+1,der);
        }
    }
}
