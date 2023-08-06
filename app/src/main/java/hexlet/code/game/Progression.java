package hexlet.code.game;

import java.util.Random;

public class Progression {
    private final String TITLE;
    private final byte MIN_LENGTH;
    private final byte MAX_LENGTH;
    private int[] progression;
    private int missNum;

    public Progression(byte minLength, byte maxLength) {
        TITLE = "What number is missing in this progression?";
        MIN_LENGTH = minLength;
        MAX_LENGTH = maxLength;
    }

    public String getTitle() {
        return TITLE;
    }

    public String getMissNum() {
        return Integer.toString(missNum);
    }

    public void showProgression() {
        missNum = progression[new Random().nextInt(progression.length)];
        for (var item : progression) {
            if (item == missNum) {
                System.out.print(" .. ");
            } else {
                System.out.print(" " + item + " ");
            }
        }
        System.out.println();
    }

    public void setProgression(byte round) {
        int number = new Random().nextInt(round) + 1;
        progression = new int[new Random().nextInt(MIN_LENGTH, MAX_LENGTH)];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = number * (i + 1);
        }
    }

}
