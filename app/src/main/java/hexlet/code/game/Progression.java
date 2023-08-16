package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN = 0;
    private static final int MAX = 20;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("What number is missing in the progression?");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int startItem = Utils.getRandomNumber(MIN, MAX);
            String[] progression = getProgression(length, startItem);
            int randIndex = Utils.getRandomNumber(MIN, progression.length);
            String result = progression[randIndex];
            String question = getProgressionWithMiss(progression, randIndex);
            Engine.setQuestion(question);
            System.out.println(Engine.getQuestion());
            if (Engine.checkAnswer(result)) {
                Engine.showAnswer();
            } else {
                Engine.showAnswer(result);
                break;
            }
        }
        Engine.showResult(userName);
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

}
