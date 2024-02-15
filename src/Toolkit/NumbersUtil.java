package Toolkit;

import java.util.Random;

public class NumbersUtil {
    static Random rd = new Random();

    /**
     *
     * @param from minimum number limit
     * @param to max number limit
     * @return random int
     */
    public static int getRandomInt(int from, int to) {
        return rd.nextInt(from, to + 1);
    }

    public static float getRandomFloat(int from, int to) {
        return rd.nextFloat(from, to + 1);
    }

    public static double getRandomDouble(int from, int to) {
        return rd.nextDouble(from, to + 1);
    }
}
