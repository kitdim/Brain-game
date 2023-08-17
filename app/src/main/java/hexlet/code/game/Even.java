package hexlet.code.game;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {

    private static final int MIN = 0;
    private static final int MAX = 50;
    public static void start() {
        String[][] fullText = make();
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.review(fullText, rule);
    }

    public static boolean isEven(int operand) {
        return operand % 2 == 0;
    }
    public static String[][] make() {
        String[][] fullText = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_QUESTIONS];
        for (int i = 0; i < fullText.length; ++i) {
            for (int j = 0; j < fullText[i].length; ++j) {
                int operand = Utils.getRandomNumber(MIN, MAX);
                String question = Integer.toString(operand);
                String result = isEven(operand) ? "yes" : "no";
                fullText[i][j] = question + ":" + result;
            }
        }
        return fullText;
    }
}
