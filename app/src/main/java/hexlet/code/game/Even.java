package hexlet.code.game;

import java.util.Random;

public final class Even {
    public final String TITLE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(byte roundRandomNumbers) {
        number = new Random().nextInt(roundRandomNumbers) + 1;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}
