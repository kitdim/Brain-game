package hexlet.code.game;
import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.print("May i have your name? ");
        String name = input.next();
        System.out.printf("Hello " + name + "!");
        return name;
    }
}
