package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final byte LENGTH_OPERATIONS = 3;
    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        char[] operations = new char[]{'+', '-', '*'};
        System.out.println("What is the result of the expression?");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int operand1 = Utils.getRandomNumber(MIN, MAX);
            int operand2 = Utils.getRandomNumber(MIN, MAX);
            char operation = operations[Utils.getRandomNumber(0, LENGTH_OPERATIONS)];
            String result = calculation(operation, operand1, operand2);
            String question = operand1 + " " + operation + " " + operand2;
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

    public static String calculation(char operation, int operand1, int operand2) {
        return switch (operation) {
            case '-' -> Integer.toString(operand1 - operand2);
            case '+' -> Integer.toString(operand1 + operand2);
            case '*' -> Integer.toString(operand1 * operand2);
            default -> null;
        };
    }
}
