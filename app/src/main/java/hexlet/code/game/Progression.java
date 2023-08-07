package hexlet.code.game;

import java.util.Random;

public final class Progression {
    public final static String TITLE = "What number is missing in the progression?";
    private int[] progression;
    private int missNum;

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
        byte min = 5;
        byte max = 10;
        int number = new Random().nextInt(round) + 1;
        progression = new int[new Random().nextInt(min, max)];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = number * (i + 1);
        }
    }

}
