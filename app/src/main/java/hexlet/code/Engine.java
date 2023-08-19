package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final byte COUNT_OF_ATTEMPTS = 3;
    public static final byte COUNT_OF_QUESTIONS = 1;

    public static void review(String[][] fullText, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        int countBadAnswers = 0;
        for (String[] strings : fullText) {
            if (countBadAnswers > 0) {
                break;
            }
            for (String string : strings) {
                String question = string.split(":")[0];
                String result = string.split(":")[1];
                System.out.println("Question: " + question);
                System.out.print("Your answer: ");
                String answer = scanner.next().toLowerCase();
                if (result.equals(answer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                            + "Correct answer is " + "'" + result + "'");
                    countBadAnswers++;
                    break;
                }
            }
        }
        if (countBadAnswers == 0) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
