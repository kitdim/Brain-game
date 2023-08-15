package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final byte COUNT_OF_ATTEMPTS = 3;
    private static int countBadAnswers = 0;
    private static String answer;
    private static String question;

    public static void setQuestion(String str) {
        question = str;
    }

    public static String getQuestion() {
        return "Question: " + question;
    }

    public static boolean checkAnswer(String result) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        answer = scanner.next().toLowerCase();
        return isEqual(result);
    }

    private static boolean isEqual(String result) {
        return result.equals(answer);
    }

    public static void showAnswer(String result) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. "
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
