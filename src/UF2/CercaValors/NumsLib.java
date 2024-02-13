package UF2.CercaValors;

import java.util.Random;

public class NumsLib {
    Random rd = new Random();

    /**
     *
     * @param from Minimum number limit
     * @param to Top number limit
     * @return random number generated
     */
    public int getRandomInt(int from, int to) {
        return rd.nextInt(from, to + 1);
    }

    /**
     *
     * @param from Minimum number limit
     * @param to Top number limit
     * @return random number generated
     */
    public float getRandomFloat(int from, int to) {
        return rd.nextFloat(from, to + 1);
    }

    public double getRandomDouble(int from, int to) {
        return rd.nextDouble(from, to + 1);
    }
}
