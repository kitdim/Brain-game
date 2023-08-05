package hexlet.code;

import hexlet.code.game.*;

import java.util.Scanner;

public class Engine {
    private static final Scanner input = new Scanner(System.in);
    private static String userName;
    private static String result;
    private static String answer;
    private static final byte ROUND_RANDOM_NUMBERS = 100;
    private static final byte COUNT_OF_ATTEMPTS = 3;
    private static final byte COUNT_OPERATIONS = 3;
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
            answer = input.next().toLowerCase();
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
            System.out.println("Question: " + calcGame.getOperand1() + calcGame.getOperation() + calcGame.getOperand2());
            System.out.print("Your answer: ");
            answer = input.next();
            result = calcGame.calculation();
            if(isFalseAnswer()) {
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
            System.out.println("Congratulation, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

    private static String getUserName() {
        System.out.print("May i have your name? ");
        userName = input.next();
        return userName;
    }
}
