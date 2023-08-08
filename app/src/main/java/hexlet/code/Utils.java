package hexlet.code;

import java.util.Random;

public class Utils {
    private static final byte ROUND_RANDOM_NUMBERS = 50;
    private static final Random rnb = new Random();

    public static int getRandomNumber() {
        return rnb.nextInt(ROUND_RANDOM_NUMBERS);
    }
    public static int getRandomNumber(int length) {
        return rnb.nextInt(length);
    }
    public static int getRandomNumber(int min, int max) {
        return rnb.nextInt(min, max);
    }
}
