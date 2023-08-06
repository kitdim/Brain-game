package hexlet.code;

import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Calc;
import hexlet.code.game.Nod;
import hexlet.code.game.Even;

import java.util.Scanner;

public final class Engine {
    private static final Scanner scanner = new Scanner(System.in);
    private static String userName;
    private static String result;
    private static String answer;
    private static final byte COUNT_OF_ATTEMPTS = 3;
    private static final byte COUNT_OPERATIONS = 3;
    private static final byte ROUND_RANDOM_NUMBERS = 100;
    private static final byte ROUND_RANDOM_NUMBERS_OF_PROGRESSION = 50;
    private static final byte MIN_LENGTH_PROGRESSION = 5;
    private static final byte MAX_LENGTH_PROGRESSION = 10;
    private static byte countBadAnswers = 0;


    public static void game(byte numberGame) {

        if (numberGame == 0) {
            return;
        } else if (numberGame == 1) {
            userName = getUserName();
            System.out.println("Hello, " + userName + "!");
            return;
        }
        userName = getUserName();
        System.out.println("Hello, " + userName + "!");
        switch (numberGame) {
            case 2:
                Even evenGame = new Even();
                System.out.println(evenGame.getTitle());
                runEvenGame(evenGame);
                break;
            case 3:
                Calc calcGame = new Calc();
                System.out.println(calcGame.getTitle());
                runCalcGame(calcGame);
                break;
            case 4:
                Nod nodGame = new Nod();
                System.out.println(nodGame.getTitle());
                runNodGame(nodGame);
                break;
            case 5:
                Progression progressionGame = new Progression(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
                System.out.println(progressionGame.getTitle());
                runProgressionGame(progressionGame);
                break;
            case 6:
                Prime primeGame = new Prime();
                System.out.println(primeGame.getTitle());
                runPrimeGame(primeGame);
                break;
            default:
                break;
        }
        showResultGame();
    }

    private static void runEvenGame(Even evenGame) {
        for (int i = COUNT_OF_ATTEMPTS; i > 0; i--) {
            evenGame.setNumber(ROUND_RANDOM_NUMBERS);
            System.out.println("Question: " + evenGame.getNumber());
            System.out.print("Your answer: ");
            answer = scanner.next().toLowerCase();
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
            answer = scanner.next();
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
            answer = scanner.next();
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
            answer = Integer.toString(scanner.nextInt());
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
            answer = scanner.next().toLowerCase();
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
        userName = scanner.next();
        return userName;
    }
}
