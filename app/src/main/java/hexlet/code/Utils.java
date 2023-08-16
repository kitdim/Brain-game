package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(min, max);
    }
}
