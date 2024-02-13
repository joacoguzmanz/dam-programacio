package UF2.CercaValors;

import java.util.Arrays;
import Toolkit.ArraysUtil;

public class CercaValors {
    public static void main(String[] args) {
        CercaValors program = new CercaValors();
        program.inici();
    }

    public void inici() {

        int[] array = ArraysUtil.createArray();
        ArraysUtil.fillArrayRandom(array, 0, 20);

        int[] copia1 = Arrays.copyOfRange(array, 0, 5);
        ArraysUtil.printArrayInt(copia1);

        System.out.print("Valors a cercar: ");
        ArraysUtil.printArrayInt(copia1);

        int[] copia2 = Arrays.copyOfRange(array, 5, array.length);
        Arrays.sort(copia2);

        System.out.print("Array on es cerca: ");
        ArraysUtil.printArrayInt(copia2);

        ArraysUtil.printArrayValuesOnArray(copia1, copia2);
    }
}
