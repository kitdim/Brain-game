package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUNT_OF_DATA;
import static hexlet.code.Engine.NUMBER_OF_ATTEMPTS;

public class Calc {
    private static final int MIN = 0;
    private static final int MAX = 50;
    private static final char[] OPERATIONS = new char[]{'+', '-', '*'};


    public static void start() {
        String[][] data = new String[NUMBER_OF_ATTEMPTS][COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int number1 = Utils.getRandomNumber(MIN, MAX);
            int number2 = Utils.getRandomNumber(MIN, MAX);
            int randomIndex = Utils.getRandomNumber(0, OPERATIONS.length);
            char operation = OPERATIONS[randomIndex];
            data[i][QUESTION] = number1 + " " + operation + " " + number2;
            data[i][ANSWER] = getCalculationResult(operation, number1, number2);
        }
        Engine.review(data, getRules());
    }

    private static String getCalculationResult(char operation, int operand1, int operand2) {
        return switch (operation) {
            case '-' -> Integer.toString(operand1 - operand2);
            case '+' -> Integer.toString(operand1 + operand2);
            case '*' -> Integer.toString(operand1 * operand2);
            default -> throw new RuntimeException("Operation is not supported.");
        };
    }
    private static String getRules() {
        return "What is the result of the expression?";
    }
}
