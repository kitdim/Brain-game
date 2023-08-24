package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUNT_OF_DATA;
import static hexlet.code.Engine.NUMBER_OF_ATTEMPTS;

public class Nod {
    private static final int MIN = 1;
    private static final int MAX = 50;

    public static void start() {
        String[][] data = new String[NUMBER_OF_ATTEMPTS][COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int number1 = Utils.getRandomNumber(MIN, MAX);
            int number2 = Utils.getRandomNumber(MIN, MAX);
            data[i][QUESTION] = number1 + " " + number2;
            data[i][ANSWER] = Integer.toString(getNod(number1, number2));
        }
        Engine.review(data, getRules());
    }

    private static int getNod(int number1, int number2) {
        return number1 == 0 ? number1 : getNod(number2, number1 % number2);
    }

    private static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
