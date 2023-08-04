package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void runEven() {
        Scanner input = new Scanner(System.in);
        System.out.print("May i have your name? ");
        String username = input.next();
        System.out.println("Hello, " + username + "!");
        System.out.println("Answer 'yes' if number is even otherwise answer 'no'.");
        int counterOfAttempts = 3;
        int badAnswersCount = 0;
        int number;
        String answer;
        String result;
        for (int i = counterOfAttempts; i > 0; i--) {
            number = new Random().nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            answer = input.next().toLowerCase();
            result = isEven(number) ? "yes" : "no";
            if (result.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer is " + "'" + result + "'");
                badAnswersCount++;
                break;
            }
        }
        if (badAnswersCount == 0) {
            System.out.println("Congratulation, " + username + "!");
        } else {
            System.out.println("Let's try again, " + username + "!");
        }
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
