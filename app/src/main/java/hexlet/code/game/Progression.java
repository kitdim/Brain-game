package hexlet.code.game;

import java.util.Random;

public final class Progression {
    private final byte min = 5;
    private final byte max = 10;
    private int[] progression;
    private int missNum;

    public Progression() {
        System.out.println("What number is missing in the progression?");
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
        progression = new int[new Random().nextInt(min, max)];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = number * (i + 1);
        }
    }

}
