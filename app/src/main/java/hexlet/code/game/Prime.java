package hexlet.code.game;

import java.util.Random;

public final class Prime {
    public final String TITLE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private int number;
    public int getPrime() {
        return number;
    }
    public void setNumber(byte roundRandomNumbers) {
        number = new Random().nextInt(roundRandomNumbers);
    }
    public boolean isPrime() {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
