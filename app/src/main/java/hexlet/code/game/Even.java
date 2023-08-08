package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {
    private static final byte COUNT_OF_ATTEMPTS = 3;
    private static int operand;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            operand = Utils.getRandomNumber();
            String result = isEven() ? "yes" : "no";
            String answer = Engine.buildGame(operand, result);
            if (answer.equals("yes")) {
                Engine.showAnswer();
            } else {
                Engine.showAnswer(result);
                break;
            }
        }
        Engine.showResult(userName);
    }

    public static boolean isEven() {
        return operand % 2 == 0;
    }
}
