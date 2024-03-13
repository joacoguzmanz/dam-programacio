package UF4.ProjectFigures;

import java.util.concurrent.ThreadLocalRandom;

public class HandleObjects {
    int min = 0, max = 10;
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
}
