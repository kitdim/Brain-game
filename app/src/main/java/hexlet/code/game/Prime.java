package hexlet.code.game;

import java.util.Random;

public class Prime {
    private final String TITLE;
    private int number;

    public Prime() {
        TITLE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public String getTitle() {
        return TITLE;
    }
    public int getPrime() {
        return number;
    }
    public void setNumber(byte roundRandomNumbers) {
        number = new Random().nextInt(roundRandomNumbers);
    }
    public boolean isPrime() {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
