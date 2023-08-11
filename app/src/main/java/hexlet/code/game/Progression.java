package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final byte MIN = 5;
    private static final byte MAX = 10;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("What number is missing in the progression?");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int[] progression = getProgression();
            int missNum = progression[Utils.getRandomNumber(progression.length)];
            String result = Integer.toString(missNum);
            String question = getProgressionWithMiss(progression, missNum);
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

    public static String getProgressionWithMiss(int[] progression, int missNum) {
        StringBuilder progressionWithMiss = new StringBuilder();
        for (var item : progression) {
            if (item == missNum) {
                progressionWithMiss.append(".. ");
            } else {
                progressionWithMiss.append(item).append(" ");
            }
        }
        return progressionWithMiss.toString();
    }

    public static int[] getProgression() {
        int number = Utils.getRandomNumber();
        int[] tempProgression = new int[Utils.getRandomNumber(MIN, MAX)];
        for (int i = 0; i < tempProgression.length; i++) {
            tempProgression[i] = number * (i + 1);
        }
        return tempProgression;
    }

}
