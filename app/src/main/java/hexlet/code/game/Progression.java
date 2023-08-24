package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUNT_OF_DATA;
import static hexlet.code.Engine.NUMBER_OF_ATTEMPTS;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN = 0;
    private static final int MAX = 20;

    public static void start() {
        String[][] data = new String[NUMBER_OF_ATTEMPTS][COUNT_OF_DATA];
        for (int i = 0; i < data.length; i++) {
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int startItem = Utils.getRandomNumber(MIN, MAX);
            String[] progression = new String[length];
            int randIndex = Utils.getRandomNumber(MIN, progression.length);
            for (int j = 0; j < length; j++) {
                progression[j] = Integer.toString(startItem * (j + 1));
            }
            data[i][ANSWER] = progression[randIndex];
            progression[randIndex] = "..";
            data[i][QUESTION] = String.join(" ", progression);
        }
        Engine.review(data, getRules());
    }

    private static String getRules() {
        return "What number is missing in the progression?";
    }
}
