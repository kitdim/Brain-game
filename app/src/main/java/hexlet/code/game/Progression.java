package hexlet.code.game;

import java.util.Random;

public final class Progression {
    private final String title;
    private final static byte MIN_LENGTH = 5;
    private final static byte MAX_LENGTH = 10;
    private int[] progression;
    private int missNum;

    public Progression() {
        title = "What number is missing in the progression?";
    }

    public String getTitle() {
        return title;
    }

    public String getMissNum() {
        return Integer.toString(missNum);
    }

    public void showProgression() {
        missNum = progression[new Random().nextInt(progression.length)];
        for (var item : progression) {
            if (item == missNum) {
                System.out.print(".. ");
            } else {
                System.out.print(item + " ");
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
