package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        return scanner.next();
    }

    public static void hello(String userName) {
        System.out.println("Hello, " + userName + "!");
    }
}
