package hexlet.code;

import java.util.Random;

public class Utils {
    private static final byte ROUND_RANDOM_NUMBERS = 50;
    private static final Random RNB = new Random();

    public static int getRandomNumber() {
        return RNB.nextInt(ROUND_RANDOM_NUMBERS);
    }
    public static int getRandomNumber(int length) {
        return RNB.nextInt(length);
    }
    public static int getRandomNumber(int min, int max) {
        return RNB.nextInt(min, max);
    }
}
