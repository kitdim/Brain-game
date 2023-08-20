package hexlet.code.game;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {

    private static final int MIN = 0;
    private static final int MAX = 50;
    public static void start() {
        String[][] data = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int operand = Utils.getRandomNumber(MIN, MAX);
            String result = isEven(operand) ? "yes" : "no";
            data[i][0] = Integer.toString(operand);
            data[i][1] = result;
        }
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.review(data, rule);
    }

    public static boolean isEven(int operand) {
        return operand % 2 == 0;
    }
}
