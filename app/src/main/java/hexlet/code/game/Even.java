package hexlet.code.game;

import java.util.Random;

public class Even {
    private final String TITLE;
    private int number;

    public Even() {
        TITLE = "Answer 'yes' if number is even otherwise answer 'no'.";
    }

    public String getTitle() {
        return TITLE;
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
