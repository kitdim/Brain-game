package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Nod {
    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int operand1 = Utils.getRandomNumber();
            int operand2 = Utils.getRandomNumber();
            String result = Integer.toString(getNod(operand1, operand2));
            String question = "Question: " + operand1 + " " + operand2;
            Engine.setQuestion(question);
            System.out.println(Engine.getQuestion());
            if (Engine.checkAnswer(result)) {
                Engine.showAnswer();
            } else {
                Engine.showAnswer(result);
                break;
            }
        }
        Engine.showResult(userName);
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
}
