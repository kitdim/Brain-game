package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RNB = new Random();

    public static int getRandomNumber(int min, int max) {
        return RNB.nextInt(min, max);
    }
}
