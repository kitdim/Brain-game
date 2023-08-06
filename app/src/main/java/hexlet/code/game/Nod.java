package hexlet.code.game;

import java.util.Random;

public class Nod {
    private final String TITLE;
    private int operand1;
    private int operand2;
    private int nod;

    public Nod() {
        TITLE = "What number is gcd of two numbers?";
        nod = 0;
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

    public String getNod() {

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

        return Integer.toString(nod);
    }

    public void setOperand1(byte round) {
        operand1 = new Random().nextInt(round) + 1;
    }

    public void setOperand2(byte round) {
        operand2 = new Random().nextInt(round) + 1;
    }
}
