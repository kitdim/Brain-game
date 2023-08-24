package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUNT_OF_DATA;
import static hexlet.code.Engine.NUMBER_OF_ATTEMPTS;

public class Prime {

    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String[][] data = new String[NUMBER_OF_ATTEMPTS][COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int number = Utils.getRandomNumber(MIN, MAX);
            data[i][QUESTION] = Integer.toString(number);
            data[i][ANSWER] = isPrime(number) ? "yes" : "no";
        }
        Engine.review(data, getRules());
    }

    private static boolean isPrime(int number) {
        if (number <= 0) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
