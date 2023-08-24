package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final byte NUMBER_OF_ATTEMPTS = 3;
    public static final byte COUNT_OF_DATA = 2;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void review(String[][] data, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        for (String[] round : data) {
            String question = round[0];
            String result = round[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (result.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer is " + "'" + result + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
