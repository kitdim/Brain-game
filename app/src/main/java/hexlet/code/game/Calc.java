package hexlet.code.game;

import java.util.Random;

public final class Calc {
    private final char[] operations;
    private char operation;
    private int operand1;
    private int operand2;

    public Calc() {
        System.out.println("What is the result of the expression?");
        operations = new char[]{'+', '-', '*'};
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
            case '+' -> {
                return Integer.toString(operand1 + operand2);
            }
            case '-' -> {
                return Integer.toString(operand1 - operand2);
            }
            case '*' -> {
                return Integer.toString(operand1 * operand2);
            }
            default -> {
            }
        }
        return null;
    }
}
