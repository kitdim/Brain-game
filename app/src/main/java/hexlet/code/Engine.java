package hexlet.code;

import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Calc;
import hexlet.code.game.Nod;
import hexlet.code.game.Even;

import java.util.Scanner;

public final class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final byte COUNT_OF_ATTEMPTS = 3;
    private static final byte COUNT_OPERATIONS = 3;
    private static final byte ROUND_RANDOM_NUMBERS = 100;
    private static final byte ROUND_RANDOM_NUMBERS_OF_PROGRESSION = 50;
    private static byte countBadAnswers = 0;
    private static String userName;
    private static String result;
    private static String answer;


    public static void game(byte numberGame) {
        switch (numberGame) {
            case 1 -> {
                userName = getUserName();
                hello(userName);
            }
            case 2 -> {
                userName = getUserName();
                hello(userName);
                Even evenGame = new Even();
                runEvenGame(evenGame);
                showResultGame();
            }
            case 3 -> {
                userName = getUserName();
                hello(userName);
                Calc calcGame = new Calc();
                runCalcGame(calcGame);
                showResultGame();
            }
            case 4 -> {
                userName = getUserName();
                hello(userName);
                Nod nodGame = new Nod();
                runNodGame(nodGame);
                showResultGame();
            }
            case 5 -> {
                userName = getUserName();
                hello(userName);
                Progression progressionGame = new Progression();
                runProgressionGame(progressionGame);
                showResultGame();
            }
            case 6 -> {
                userName = getUserName();
                hello(userName);
                Prime primeGame = new Prime();
                runPrimeGame(primeGame);
                showResultGame();
            }
            default -> {
            }
        }
    }
    private static void runEvenGame(Even evenGame) {
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            evenGame.setNumber(ROUND_RANDOM_NUMBERS);
            System.out.println("Question: " + evenGame.getNumber());
            System.out.print("Your answer: ");
            answer = SCANNER.next().toLowerCase();
            result = evenGame.isEven() ? "yes" : "no";
            if (isFalseAnswer()) {
                return;
            }
        }
    }

    private static void runCalcGame(Calc calcGame) {
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            calcGame.setOperand1(ROUND_RANDOM_NUMBERS);
            calcGame.setOperand2((ROUND_RANDOM_NUMBERS));
            calcGame.setOperation(COUNT_OPERATIONS);
            System.out.println("Question: "
                    + calcGame.getOperand1()
                    + " "
                    + calcGame.getOperation()
                    + " "
                    + calcGame.getOperand2());
            System.out.print("Your answer: ");
            answer = SCANNER.next();
            result = calcGame.calculation();
            if (isFalseAnswer()) {
                return;
            }
        }
    }

    public static void runNodGame(Nod nodGame) {
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            nodGame.setOperand1(ROUND_RANDOM_NUMBERS);
            nodGame.setOperand2(ROUND_RANDOM_NUMBERS);
            System.out.println("Question: " + nodGame.getOperand1() + " " + nodGame.getOperand2());
            System.out.print("Your answer: ");
            answer = SCANNER.next();
            result = nodGame.getNod();
            if (isFalseAnswer()) {
                return;
            }
        }
    }

    private static void runProgressionGame(Progression progressionGame) {
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            progressionGame.setProgression(ROUND_RANDOM_NUMBERS_OF_PROGRESSION);
            System.out.print("Question: ");
            progressionGame.showProgression();
            System.out.print("Your answer: ");
            answer = Integer.toString(SCANNER.nextInt());
            result = progressionGame.getMissNum();
            if (isFalseAnswer()) {
                return;
            }
        }
    }

    private static void runPrimeGame(Prime primeGame) {
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            primeGame.setNumber(ROUND_RANDOM_NUMBERS);
            System.out.println("Question: " + primeGame.getPrime());
            System.out.print("Your answer: ");
            answer = SCANNER.next().toLowerCase();
            result = primeGame.isPrime() ? "yes" : "no";
            if (isFalseAnswer()) {
                return;
            }
        }
    }

    private static boolean isFalseAnswer() {
        if (result.equals(answer)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                    + "Correct answer is " + "'" + result + "'");
            countBadAnswers++;
            return true;
        }
    }

    private static void showResultGame() {
        if (countBadAnswers == 0) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

    private static String getUserName() {
        System.out.print("May I have your name? ");
        userName = SCANNER.next();
        return userName;
    }

    private static void hello(String userName) {
        System.out.println("Hello, " + userName + "!");
    }
}
