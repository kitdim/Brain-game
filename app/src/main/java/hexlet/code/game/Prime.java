package hexlet.code.game;

import java.util.Random;

public final class Prime {
    private String title;
    private int number;

    public Prime() {
        title = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public String getTitle() {
        return title;
    }
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
