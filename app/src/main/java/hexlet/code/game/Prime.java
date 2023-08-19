package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String[][] fullText = make();
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.review(fullText, rule);
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
    private static String[][] make() {
        String[][] fullText = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_QUESTIONS];
        for (int i = 0; i < fullText.length; ++i) {
            for (int j = 0; j < fullText[i].length; ++j) {
                int operand = Utils.getRandomNumber(MIN, MAX);
                String question = Integer.toString(operand);
                String result = isPrime(operand) ? "yes" : "no";
                fullText[i][j] = question + ":" + result;
            }
        }
        return fullText;
    }
}
