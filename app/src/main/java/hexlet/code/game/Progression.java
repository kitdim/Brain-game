package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final byte MIN = 5;
    private static final byte MAX = 10;
    private static int[] progression;
    private static int missNum;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("What number is missing in the progression?");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            progression = getProgression();
            missNum = progression[Utils.getRandomNumber(progression.length)];
            String progressionWithMiss = getProgressionWithMiss();
            String answer = Engine.buildGameProgression(missNum, progressionWithMiss);
            if (answer.equals("yes")) {
                Engine.showAnswer();
            } else {
                Engine.showAnswer(missNum);
                break;
            }
        }
        Engine.showResult(userName);
    }

    public static String getProgressionWithMiss() {
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

    public static int[] getProgression(){
        int number = Utils.getRandomNumber();
        int[] tempProgression = new int[Utils.getRandomNumber(MIN, MAX)];
        for (int i = 0; i < tempProgression.length; i++) {
            tempProgression[i] = number * (i + 1);
        }
        return tempProgression;
    }

}
