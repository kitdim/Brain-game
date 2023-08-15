package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("What number is missing in the progression?");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int length = Utils.getRandomNumber(5, 10);
            int startItem = Utils.getRandomNumber(1, 20);
            String[] progression = getProgression(length, startItem);
            String result = progression[Utils.getRandomNumber(0, progression.length)];
            String question = getProgressionWithMiss(progression, result);
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

    public static String getProgressionWithMiss(String[] progression, String missNum) {
        for (var i = 0; i < progression.length; i++) {
            if (progression[i].equals(missNum)) {
                progression[i] = "..";
            }
        }
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
