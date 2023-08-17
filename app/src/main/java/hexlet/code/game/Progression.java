package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN = 0;
    private static final int MAX = 20;

    public static void start() {
        String[][] fullText = make();
        String rule = "What number is missing in the progression?";
        Engine.review(fullText, rule);
    }

    public static String getProgressionWithMiss(String[] progression, int randIndex) {
        progression[randIndex] = "..";
        return String.join(" ", progression);
    }

    public static String[] getProgression(int length, int startItem) {
        String[] tempProgression = new String[length];
        for (int i = 0; i < tempProgression.length; i++) {
            tempProgression[i] = Integer.toString(startItem * (i + 1));
        }
        return tempProgression;
    }

    private static String[][] make() {
        String[][] fullText = new String[Engine.COUNT_OF_ATTEMPTS][Engine.COUNT_OF_QUESTIONS];
        for (int i = 0; i < fullText.length; i++) {
            for (int j = 0; j < fullText[i].length; j++) {
                int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
                int startItem = Utils.getRandomNumber(MIN, MAX);
                String[] progression = getProgression(length, startItem);
                int randIndex = Utils.getRandomNumber(MIN, progression.length);
                String result = progression[randIndex];
                String question = getProgressionWithMiss(progression, randIndex);
                fullText[i][j] = question + ":" + result;
            }
        }
        return fullText;
    }
}
