package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN = 0;
    private static final int MAX = 20;

    public static void start() {
        String[][] data = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int startItem = Utils.getRandomNumber(MIN, MAX);
            String[] progression = new String[length];
            int randIndex = Utils.getRandomNumber(MIN, progression.length);
            for (int j = 0; j < length; j++) {
                progression[j] = Integer.toString(startItem * (j + 1));
            }
            String result = progression[randIndex];
            progression[randIndex] = "..";
            data[i][0] = String.join(" ", progression);
            data[i][1] = result;
        }
        String rule = "What number is missing in the progression?";
        Engine.review(data, rule);
    }
}
