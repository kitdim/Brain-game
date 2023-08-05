package hexlet.code.game;

import java.util.Random;

public class Calc {
    private static char[] operations;
    private static char operation;
    private static int operand1;
    private static int operand2;

    public Calc() {
        operations = new char[]{'+', '-', '*'};
    }

    public String getTitle() {
        return "What is the result of the expression?";
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
        int result = 0;
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
        }
        return Integer.toString(result);
    }
}
