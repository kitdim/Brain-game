package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {
    private static final byte LENGTH_OPERATIONS = 3;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        char[] operations = new char[]{'+', '-', '*'};
        boolean isGoodResult;
        System.out.println("What is the result of the expression?");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int operand1 = Utils.getRandomNumber();
            int operand2 = Utils.getRandomNumber();
            char operation = operations[Utils.getRandomNumber(LENGTH_OPERATIONS)];
            String result = calculation(operation, operand1, operand2);
            String question = operand1 + " " + operation + " " + operand2;
            Engine.setQuestion(question);
            System.out.println(Engine.getQuestion());
            isGoodResult = Engine.checkAnswer(result);
            if (isGoodResult) {
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
