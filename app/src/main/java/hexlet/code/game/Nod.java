package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Nod {
    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String[][] fullText = make();
        String rule = "Find the greatest common divisor of given numbers.";
        Engine.review(fullText, rule);
    }

    private static int getNod(int operand1, int operand2) {
        if (operand1 == 0 && operand2 == 0) {
            return 0;
        }
        if (operand1 == 0) {
            return operand2;
        } else if (operand2 == 0) {
            return operand1;
        }
        int nod = 0;
        if (operand1 < operand2) {
            operand1 += operand2;
            operand2 = operand1 - operand2;
            operand1 -= operand2;
        }

        for (int i = 1; i <= operand2; i++) {
            if (operand1 % i == 0 && operand2 % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    public static String[][] make() {
        String[][] fullText = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_QUESTIONS];
        for (int i = 0; i < fullText.length; i++) {
            for (int j = 0; j < fullText[i].length; j++) {
                int operand1 = Utils.getRandomNumber(MIN, MAX);
                int operand2 = Utils.getRandomNumber(MIN, MAX);
                String result = Integer.toString(getNod(operand1, operand2));
                fullText[i][j] = operand1 + " " + operand2 + ":" + result;
            }
        }
        return fullText;
    }
}
