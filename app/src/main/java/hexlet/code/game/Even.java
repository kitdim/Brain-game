package hexlet.code.game;

import hexlet.code.Utils;
import hexlet.code.Engine;

import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUNT_OF_DATA;
import static hexlet.code.Engine.NUMBER_OF_ATTEMPTS;


public class Even {

    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String[][] data = new String[NUMBER_OF_ATTEMPTS][COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int number = Utils.getRandomNumber(MIN, MAX);
            data[i][QUESTION] = Integer.toString(number);
            data[i][ANSWER] = isEven(number) ? "yes" : "no";
        }
        Engine.review(data, getRules());
    }

    private static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    private static boolean isEven(int operand) {
        return operand % 2 == 0;
    }
}
