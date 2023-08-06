package hexlet.code.game;

import java.util.Random;

public final class Even {
    private final String title;
    private int number;

    public Even() {
        title = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(byte roundRandomNumbers) {
        this.number = new Random().nextInt(roundRandomNumbers) + 1;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}
