package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Nod {
    private static int operand1;
    private static int operand2;
    public static void start(){
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            operand1 = Utils.getRandomNumber();
            operand2 = Utils.getRandomNumber();
            int result = getNod();
            String answer = Engine.buildGame(operand1, operand2, result);
            if (answer.equals("yes")) {
                Engine.showAnswer();
            } else {
                Engine.showAnswer(result);
                break;
            }
        }
        Engine.showResult(userName);
    }

    private static int getNod() {
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

