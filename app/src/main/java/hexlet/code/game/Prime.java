package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String[][] data = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int operand = Utils.getRandomNumber(MIN, MAX);
            String result = isPrime(operand) ? "yes" : "no";
            data[i][0] = Integer.toString(operand);
            data[i][1] = result;
        }
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.review(data, rule);
    }

    private static boolean isPrime(int number) {
        if (number <= 0) {
            return  false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
