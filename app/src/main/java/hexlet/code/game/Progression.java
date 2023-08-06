package hexlet.code.game;

import java.util.Random;

public class Progression {
    private String title;
    private byte minLength;
    private byte maxLength;
    private int[] progression;
    private int missNum;

    public Progression(byte minLength, byte maxLength) {
        title = "What number is missing in this progression?";
        this.minLength = minLength;
        this.maxLength = maxLength;
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
                System.out.print("..");
            } else {
                System.out.print(" " + item + " ");
            }
        }
        System.out.println();
    }

    public void setProgression(byte round) {
        int number = new Random().nextInt(round) + 1;
        progression = new int[new Random().nextInt(minLength, maxLength)];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = number * (i + 1);
        }
    }

}
