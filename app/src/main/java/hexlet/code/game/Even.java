package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {
    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int operand = Utils.getRandomNumber();
            String question = Integer.toString(operand);
            String result = isEven(operand) ? "yes" : "no";
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

    public static boolean isEven(int operand) {
        return operand % 2 == 0;
    }
}
