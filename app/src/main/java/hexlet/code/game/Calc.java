package hexlet.code.game;

import java.util.Random;

public class Calc {
    private final String TITLE;
    private final char[] operations;
    private char operation;
    private int operand1;
    private int operand2;
    private int result;
    public Calc() {
        operations = new char[]{'+', '-', '*'};
        TITLE = "What is the result of the expression?";
        result = 0;
    }

    public String getTitle() {
        return TITLE;
    }
    public int getOperand1() {
        return operand1;
    }
    public int getOperand2() {
        return operand2;
    }
    public char getOperation() {
        return operation;
    }
    public void setOperand1(byte round) {
        operand1 = new Random().nextInt(round) + 1;
    }
    public void setOperand2(byte round) {
        operand2 = new Random().nextInt(round) + 1;
    }
    public void setOperation(byte round) {
        operation = operations[new Random().nextInt(round)];
    }

    public String calculation() {
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            default:
                break;
        }
        return Integer.toString(result);
    }
}
