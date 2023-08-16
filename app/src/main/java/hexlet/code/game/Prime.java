package hexlet.code.game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void start() {
        String userName = Cli.getUserName();
        Cli.hello(userName);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = Engine.COUNT_OF_ATTEMPTS; i > 0; i--) {
            int number = Utils.getRandomNumber(MIN, MAX);
            String question = Integer.toString(number);
            String result = isPrime(number) ? "yes" : "no";
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

    private static boolean isPrime(int number) {
        if (number == 0) {
            return  false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
