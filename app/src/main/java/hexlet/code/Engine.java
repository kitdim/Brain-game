package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int countBadAnswers = 0;
    private static String input;

    public static String buildGame(int operand, String result) {
        System.out.println("Question: " + operand);
        System.out.print("Your answer: ");
        input = SCANNER.next().toLowerCase();
        return isEqualAnswers(result, input) ? "yes" : "no";
    }

    public static String buildGame(int operand1, int operand2, char operation, int result) {
        System.out.println("Question: " + operand1 + " " + operation + " " + operand2);
        System.out.print("Your answer: ");
        input = SCANNER.next();
        int convert = Integer.parseInt(input);
        return isEqualAnswers(result, convert) ? "yes" : "no";
    }

    private static boolean isEqualAnswers(String result, String input) {
        return result.equals(input);
    }

    private static boolean isEqualAnswers(int result, int convert) {
        return result == convert;
    }

    public static void showAnswer(String result) {
        System.out.println("'" + input + "'" + " is wrong answer ;(. "
                + "Correct answer is " + "'" + result + "'");
        countBadAnswers++;
    }

    public static void showAnswer(int result) {
        System.out.println("'" + input + "'" + " is wrong answer ;(. "
                + "Correct answer is " + "'" + result + "'");
        countBadAnswers++;
    }

    public static void showAnswer() {
        System.out.println("Correct!");
    }

    public static void showResult(String userName) {
        if (countBadAnswers == 0) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}

