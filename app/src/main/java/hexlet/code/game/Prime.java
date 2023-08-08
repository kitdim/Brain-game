package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private static int number;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            number = Utils.getRandomNumber();
            String result = isPrime() ? "yes" : "no";
            String answer = Engine.buildGame(number, result);
            if (answer.equals("yes")) {
                Engine.showAnswer();
            } else {
                Engine.showAnswer(result);
                break;
            }
        }
        Engine.showResult(userName);
    }

    private static boolean isPrime() {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
